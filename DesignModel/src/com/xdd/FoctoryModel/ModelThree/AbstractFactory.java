package com.xdd.FoctoryModel.ModelThree;

import com.xdd.FoctoryModel.ModelThree.Interface.Food;
import com.xdd.FoctoryModel.ModelThree.Interface.Vehicle;
import com.xdd.FoctoryModel.ModelThree.Interface.Weapon;

public abstract class AbstractFactory {

	public abstract Vehicle createVehicle();
    public abstract Weapon createWeapon();
    public abstract Food createFood();
}
