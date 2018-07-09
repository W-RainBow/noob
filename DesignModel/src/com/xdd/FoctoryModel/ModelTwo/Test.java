package com.xdd.FoctoryModel.ModelTwo;

import com.xdd.FoctoryModel.ModelTwo.Impl.BroomFactory;
import com.xdd.FoctoryModel.ModelTwo.Interface.Moveable;
import com.xdd.FoctoryModel.ModelTwo.Interface.VehicleFactory;

public class Test {

	public static void main(String[] args) {
        VehicleFactory factory = new BroomFactory();
        Moveable m = factory.create();
        m.run();
    }
}
