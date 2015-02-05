package com.example.android_saleticketsystem.server;

import android.content.Context;
import android.widget.Toast;

import com.example.android_saleticketsystem.CarInit;
import com.example.android_saleticketsystem.bean.Car;

public class CarServer {
	private CarInit carInit;
	private int ticketArray[];
	private int ticket;
	private Context context;
	public CarServer(Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
		carInit = new CarInit();
	}
	
	public String[] getCarLoad(){
		String[] list = {carInit.car1.getLoad(),carInit.car2.getLoad(),carInit.car3.getLoad(),carInit.car4.getLoad()};
		return list;
	}
	

	public Car getCar(int id){
		if(id==0){
			return carInit.car1;
		}else if(id==1){
			return carInit.car2;
		}else if(id==2){
			return carInit.car3;
		}else if(id==3){
			return carInit.car4;
		}
		return null;
	}
	
	
	
	public void saleTicket1(final int id,final String car_shift,final int ticket_num) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new Runnable() {
			public synchronized void run() {
				buy(id, car_shift, ticket_num);
				System.out.println("第一个线程");
				return;
			}
				
		});
		
		thread1.start();
	}
	public void saleTicket2(final int id,final String car_shift,final int ticket_num) {
		// TODO Auto-generated method stub
		Thread thread2 = new Thread(new Runnable() {
			public synchronized void run() {
				buy(id, car_shift, ticket_num);
				System.out.println("第二个线程");
				return;
			}
			
		});
		
		thread2.start();
	}
	
	public synchronized void buy(int id,String car_shift,int ticket_num){
		if(id==0){
			ticketArray = carInit.car1.getTicket();
			if("2001".equals(car_shift)){
				if(ticketArray[0]>0){
					if(ticket_num<= ticketArray[0]){
						ticketArray[0] = ticketArray[0] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2002".equals(car_shift)){
				if(ticketArray[1]>0){
					if(ticket_num<= ticketArray[1]){
						ticketArray[1] = ticketArray[1] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2003".equals(car_shift)){
				if(ticketArray[2]>0){
					if(ticket_num<= ticketArray[2]){
						ticketArray[2] = ticketArray[2] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2004".equals(car_shift)){
				if(ticketArray[3]>0){
					if(ticket_num<= ticketArray[3]){
						ticketArray[3] = ticketArray[0] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}
		}else if(id==1){
			ticketArray = carInit.car2.getTicket();
			if("2001".equals(car_shift)){
				if(ticketArray[0]>0){
					if(ticket_num<= ticketArray[0]){
						ticketArray[0] = ticketArray[0] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2002".equals(car_shift)){
				if(ticketArray[1]>0){
					if(ticket_num<= ticketArray[1]){
						ticketArray[1] = ticketArray[1] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2003".equals(car_shift)){
				if(ticketArray[2]>0){
					if(ticket_num<= ticketArray[2]){
						ticketArray[2] = ticketArray[2] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2004".equals(car_shift)){
				if(ticketArray[3]>0){
					if(ticket_num<= ticketArray[3]){
						ticketArray[3] = ticketArray[3] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}
		}else if(id==2){
			ticketArray = carInit.car3.getTicket();
			if("2001".equals(car_shift)){
				if(ticketArray[0]>0){
					if(ticket_num<= ticketArray[0]){
						ticketArray[0] = ticketArray[0] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2002".equals(car_shift)){
				if(ticketArray[1]>0){
					if(ticket_num<= ticketArray[1]){
						ticketArray[1] = ticketArray[1] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2003".equals(car_shift)){
				if(ticketArray[2]>0){
					if(ticket_num<= ticketArray[2]){
						ticketArray[2] = ticketArray[2] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2004".equals(car_shift)){
				if(ticketArray[3]>0){
					if(ticket_num<= ticketArray[3]){
						ticketArray[3] = ticketArray[3] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}
		}else if(id==3){
			ticketArray = carInit.car4.getTicket();
			if("2001".equals(car_shift)){
				if(ticketArray[0]>0){
					if(ticket_num<= ticketArray[0]){
						ticketArray[0] = ticketArray[0] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2002".equals(car_shift)){
				if(ticketArray[1]>0){
					if(ticket_num<= ticketArray[1]){
						ticketArray[1] = ticketArray[1] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2003".equals(car_shift)){
				if(ticketArray[2]>0){
					if(ticket_num<= ticketArray[2]){
						ticketArray[2] = ticketArray[2] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}else if("2004".equals(car_shift)){
				if(ticketArray[3]>0){
					if(ticket_num<= ticketArray[3]){
						ticketArray[3] = ticketArray[3] - ticket_num;
					}else{
						Toast.makeText(context, "您输入的票数已超过剩余票数，请重新输入!", 0).show();
					}
				}else{
					Toast.makeText(context, "对不起，票已经卖完了", 0).show();
				}
			}
		}
		
	}
}
