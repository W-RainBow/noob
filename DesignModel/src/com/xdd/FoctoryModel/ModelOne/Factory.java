package com.xdd.FoctoryModel.ModelOne;

public class Factory{ //getClass ����Sample һ���ʹ�ö�̬��װ��װ���ࡣ
    public static Sample creator(int which){ 
        if (which==1)
            return new SampleA();
        else if (which==2)
            return new SampleB();
		return null;
    }
}