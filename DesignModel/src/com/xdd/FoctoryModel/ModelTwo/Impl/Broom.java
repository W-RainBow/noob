package com.xdd.FoctoryModel.ModelTwo.Impl;

import com.xdd.FoctoryModel.ModelTwo.Interface.Moveable;

//具体产品角色
public class Broom implements Moveable {

	 @Override
    public void run() {
        System.out.println("broom.....");
    }

}
