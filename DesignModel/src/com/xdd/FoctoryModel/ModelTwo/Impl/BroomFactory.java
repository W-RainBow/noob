package com.xdd.FoctoryModel.ModelTwo.Impl;

import com.xdd.FoctoryModel.ModelTwo.Interface.Moveable;
import com.xdd.FoctoryModel.ModelTwo.Interface.VehicleFactory;

public class BroomFactory implements VehicleFactory {

	public Moveable create() {
        return new Broom();
    }
}
