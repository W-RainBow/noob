package com.xdd.BuilderModel;

import com.xdd.BuilderModel.Interface.Builder;
import com.xdd.BuilderModel.Interface.Part;
import com.xdd.BuilderModel.Interface.Product;

public class ConcreteBuilder implements Builder {
	Part partA, partB, partC;
	Product p;
	public void buildPartA() {
		//这里是具体如何构建
	}
	public void buildPartB() {
		//这里是具体如何构建
	}
	public void buildPartC() {
		//这里是具体如何构建
	}
	public Product getResult() {
		//返回最后组装成品结果
		return p;
	}
}