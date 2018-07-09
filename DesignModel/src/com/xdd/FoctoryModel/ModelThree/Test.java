package com.xdd.FoctoryModel.ModelThree;

import com.xdd.FoctoryModel.ModelThree.Interface.Food;
import com.xdd.FoctoryModel.ModelThree.Interface.Vehicle;
import com.xdd.FoctoryModel.ModelThree.Interface.Weapon;

public class Test {
    public static void main(String[] args) {
        AbstractFactory f = new DefaultFactory();
        Vehicle v = f.createVehicle();
        v.run();
        Weapon w = f.createWeapon();
        w.shoot();
        Food a = f.createFood();
        a.printName();
    }
} 