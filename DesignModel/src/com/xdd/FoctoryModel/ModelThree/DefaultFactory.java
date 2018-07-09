package com.xdd.FoctoryModel.ModelThree;

import com.xdd.FoctoryModel.ModelThree.Interface.Food;
import com.xdd.FoctoryModel.ModelThree.Interface.Vehicle;
import com.xdd.FoctoryModel.ModelThree.Interface.Weapon;
import com.xdd.FoctoryModel.ModelThree.impl.AK47;
import com.xdd.FoctoryModel.ModelThree.impl.Apple;
import com.xdd.FoctoryModel.ModelThree.impl.Car;

public class DefaultFactory extends AbstractFactory{

	@Override
    public Food createFood() {
        return new Apple();
    }
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
