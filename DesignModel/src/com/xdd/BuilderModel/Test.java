package com.xdd.BuilderModel;

import com.xdd.BuilderModel.Interface.Product;

public class Test {

	public static void main(String[] args) {
		ConcreteBuilder builder = new ConcreteBuilder();
		Director director = new Director( builder );
		director.construct();
		Product product = builder.getResult();
	}
}
