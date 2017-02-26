package com.frankTest.easyJave.algorithm.list;

public interface List {
	/**
	 * 销毁表结构  销毁内存
	 * @return
	 */
	boolean destroyList();
	/**
	 * 清空表结构
	 * @return
	 */
	boolean clearList();
	/**
	 * 表是否为空
	 * @return
	 */
	boolean isEmpty();
	/**
	 * 表的长度
	 * @return
	 */
	int length();
	/**
	 * 获取第i个元素
	 * @param index
	 * @return
	 */
	Object get(int index);
	/**
	 * 获取元素的顺序
	 * @param elemt
	 * @return
	 */
	int getIndex(Object element);
	/**
	 * 获取元素的前置元素
	 * @param element
	 */
	Object priorElement(Object element);
	/**
	 * 获取元素的后置元素
	 * @param element
	 * @return
	 */
	Object nextElement(Object element);
	/**
	 * 在index之前插入元素
	 * @param index
	 * @param element
	 * @return
	 */
	boolean insertBefore(int index,Object element);
	/**
	 * 删除序号为index的元素
	 * @param index
	 * @return  删除的元素
	 */
	Object deleteIndex(int index);
}
