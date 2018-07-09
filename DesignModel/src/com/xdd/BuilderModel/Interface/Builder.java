package com.xdd.BuilderModel.Interface;

public interface Builder {
	//��������A�������紴����������
	void buildPartA();
	//��������B ���紴������������
	void buildPartB();
	//��������C ���紴������������
	void buildPartC();
	//���������װ��Ʒ��� (�������װ��õ�����)
	//��Ʒ����װ���̲����������,����ת�Ƶ������Director���н���.
	//�Ӷ�ʵ���˽�����̺Ͳ���
    Product getResult();
}