package com.xdd.FoctoryModel.ModelOne;

import java.util.Calendar;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance(Locale.CHINA); //���ط����й���׼������
		System.out.println(cal.getTime());
		Integer a=Integer.valueOf(100); //����ȡֵΪ100��Integer����
		System.out.println(a);
	}
}
