package com.xdd.BuilderModel;

import com.xdd.BuilderModel.Interface.Builder;
import com.xdd.BuilderModel.Interface.Part;
import com.xdd.BuilderModel.Interface.Product;

public class ConcreteBuilder implements Builder {
	Part partA, partB, partC;
	Product p;
	public void buildPartA() {
		//�����Ǿ�����ι���
	}
	public void buildPartB() {
		//�����Ǿ�����ι���
	}
	public void buildPartC() {
		//�����Ǿ�����ι���
	}
	public Product getResult() {
		//���������װ��Ʒ���
		return p;
	}
}