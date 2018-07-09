package com.xdd.FoctoryModel.ModelOne;

import java.util.Calendar;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance(Locale.CHINA); //返回符合中国标准的日历
		System.out.println(cal.getTime());
		Integer a=Integer.valueOf(100); //返回取值为100的Integer对象
		System.out.println(a);
	}
}
