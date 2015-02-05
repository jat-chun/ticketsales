package com.example.android_saleticketsystem;

import com.example.android_saleticketsystem.bean.Car;

public class CarInit {
	public Car car1;
	public Car car2;
	public Car car3;
	public Car car4;
	
	public CarInit() {
		// TODO Auto-generated constructor stub
		car1 = new Car();
		car2 = new Car();
		car3 = new Car();
		car4 = new Car();
		init();
	}
	
	public void init(){
		
		car1.setId(0);
		car1.setLoad("和平-->广州");
		car1.setCar_shift(new String[]{"2001","2002","2003","2004"});
		car1.setCar_time(new String[]{"7:00","8:30","12:30","15:30"});
		car1.setTicket(new int[]{40,40,40,40});
		car1.setCar_price(new int[]{35,35,35,35});
		
		car2.setId(1);
		car2.setLoad("广州-->和平");
		car2.setCar_shift(new String[]{"2005","2006","2007","2008"});
		car2.setCar_time(new String[]{"7:00","8:30","12:30","15:30"});
		car2.setTicket(new int[]{40,40,40,40});
		car2.setCar_price(new int[]{35,35,35,35});
		
		car3.setId(2);
		car3.setLoad("广州-->江门");
		car3.setCar_shift(new String[]{"2009","2010","2011","2012"});
		car3.setCar_time(new String[]{"7:00","8:30","12:30","15:30"});
		car3.setTicket(new int[]{45,45,45,45});
		car3.setCar_price(new int[]{45,45,45,45});
		
		car4.setId(3);
		car4.setLoad("江门-->广州");
		car4.setCar_shift(new String[]{"2013","2014","2015","2016"});
		car4.setCar_time(new String[]{"7:00","8:30","12:30","15:30"});
		car4.setTicket(new int[]{45,45,45,45});
		car4.setCar_price(new int[]{45,45,45,45});
	}
}
