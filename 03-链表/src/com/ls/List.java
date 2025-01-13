package com.ls;

// list 接口
public interface List<E> {
	static final int ELEMENT_NOT_FOUND = -1;
	
	/**
	 * 清除所有的元素
	 */
	public void clear();
	
	/**
	 * 元素的数量
	 * @return
	 */
	public int size();
	
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * 是否包含某个元素
	 * @param element
	 * @return
	 */
	public boolean contains(E element);
	
	/**
	 * 添加元素到尾部
	 * @param element
	 */
	public void add(E element);
	
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return
	 */
	public E get(int index);
	
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return 原来的元素值
	 */
	public E set(int index, E element);
	
	/**
	 * 在index位置插入某个值
	 * @param index
	 * @param element
	 */
	public void add(int index, E element);
	
	/**
	 * 删除某个位置的元素
	 * @param index
	 * @return
	 */
	public E remove(int index);
	
	/**
	 * 查看元素的索引
	 * @param element
	 * @return
	 */
	public int indexof(E element);
}
