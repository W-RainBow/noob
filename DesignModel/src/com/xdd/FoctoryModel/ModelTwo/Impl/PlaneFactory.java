package com.xdd.FoctoryModel.ModelTwo.Impl;

import com.xdd.FoctoryModel.ModelTwo.Interface.Moveable;
import com.xdd.FoctoryModel.ModelTwo.Interface.VehicleFactory;
//���幤��
public class PlaneFactory implements VehicleFactory {

	  public Moveable create() {
	     return new Plane();
	  }
}
