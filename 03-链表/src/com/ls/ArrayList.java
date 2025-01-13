package com.ls;

@SuppressWarnings("unchecked")
public class ArrayList<E> extends AbstractList<E> {
	
	// 所有元素
	private E[] elements;
	// 默认数组容量值
	private static final int DEFAULT_CAPATICY = 10;
	
	// 有参构造函数
	public ArrayList(int capaticy) {
		capaticy = (capaticy < DEFAULT_CAPATICY) ? DEFAULT_CAPATICY : capaticy; 
		elements = (E[]) new Object[capaticy];
	}
	
	// 无参构造函数
	public ArrayList() {
		this(DEFAULT_CAPATICY);
	}
	
	/**
	 * 清除所有的元素
	 */
	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
	}
	
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return
	 */
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index越界, Index:" + index + ",Size:" + size);
		}
		return elements[index];
	}
	
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return 原来的元素值
	 */
	public E set(int index, E element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index越界, Index:" + index + ",Size:" + size);
		}
		E old = elements[index];
		elements[index] = element;
		return old;
	}
	
	/**
	 * 在index位置插入某个值
	 * @param index
	 * @param element
	 */
	public void add(int index, E element) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index越界, Index:" + index + ",Size:" + size);
		}
		// 数组动态扩容
		ensureCapacity(size + 1);
		for (int i = size-1; i >= index ; i--) {
			elements[i+1] = elements[i];
		}
		elements[index] = element;
		size++;
	}
	
	/**
	 * 删除某个位置的元素
	 * @param index
	 * @return
	 */
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index越界, Index:" + index + ",Size:" + size);
		}
		E old = elements[index];
		for (int i = index+1; i <= size-1; i++) {
			elements[i - 1] = elements[i];
		}
		size--;
		
		elements[size] = null;
		return old;
	}
	
	/**
	 * 查看元素的索引
	 * @param element
	 * @return
	 */
	public int indexof(E element) {
		if (element == null) {
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == null) return i;
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (element.equals(elements[i])) return i;
			}
		}
		return -1;
	}
	
	/**
	 * 保证有capacity的容量
	 * @param capacity
	 */
	private void ensureCapacity(int capacity) {
		int oldCapacity = elements.length;
		if (oldCapacity >= capacity) return;
		
		//新容量为旧容量的1.5倍
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		E[] newElements =  (E[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
		System.out.println(oldCapacity + "扩容为" + newCapacity);
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("size=").append(size).append(", [");
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				string.append(", ");
			}
			string.append(elements[i]);
		}
		string.append("]");
		return string.toString();
	}
}
