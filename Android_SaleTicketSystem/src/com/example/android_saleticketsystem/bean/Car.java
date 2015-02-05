package com.example.android_saleticketsystem.bean;

public class Car {
	private int id;
	private String load;
	private String car_shift[];
	private String car_time[];
	private int car_price[];
	private int ticket[];
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}
	public String[] getCar_shift() {
		return car_shift;
	}
	public void setCar_shift(String[] car_shift) {
		this.car_shift = car_shift;
	}
	public String[] getCar_time() {
		return car_time;
	}
	public void setCar_time(String[] car_time) {
		this.car_time = car_time;
	}
	public int[] getCar_price() {
		return car_price;
	}
	public void setCar_price(int[] car_price) {
		this.car_price = car_price;
	}
	public int[] getTicket() {
		return ticket;
	}
	public void setTicket(int[] ticket) {
		this.ticket = ticket;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
