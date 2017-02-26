package com.frankTest.easyJave.algorithm.list;

public interface List {
	/**
	 * ���ٱ�ṹ  �����ڴ�
	 * @return
	 */
	boolean destroyList();
	/**
	 * ��ձ�ṹ
	 * @return
	 */
	boolean clearList();
	/**
	 * ���Ƿ�Ϊ��
	 * @return
	 */
	boolean isEmpty();
	/**
	 * ��ĳ���
	 * @return
	 */
	int length();
	/**
	 * ��ȡ��i��Ԫ��
	 * @param index
	 * @return
	 */
	Object get(int index);
	/**
	 * ��ȡԪ�ص�˳��
	 * @param elemt
	 * @return
	 */
	int getIndex(Object element);
	/**
	 * ��ȡԪ�ص�ǰ��Ԫ��
	 * @param element
	 */
	Object priorElement(Object element);
	/**
	 * ��ȡԪ�صĺ���Ԫ��
	 * @param element
	 * @return
	 */
	Object nextElement(Object element);
	/**
	 * ��index֮ǰ����Ԫ��
	 * @param index
	 * @param element
	 * @return
	 */
	boolean insertBefore(int index,Object element);
	/**
	 * ɾ�����Ϊindex��Ԫ��
	 * @param index
	 * @return  ɾ����Ԫ��
	 */
	Object deleteIndex(int index);
}
