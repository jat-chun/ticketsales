package com.example.android_saleticketsystem;

import java.util.ArrayList;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android_saleticketsystem.bean.Car;
import com.example.android_saleticketsystem.server.CarServer;

public class MainActivity extends Activity implements OnClickListener{

	private EditText et_ticket_number1;
	private EditText et_ticket_number2;
	private Button bt_buy1;
	private Button bt_buy2;
	private CarServer server ;
	private Button bt_find;
	private Spinner sp_car_id;
	private Spinner sp_buy_car_shift1;
	private Spinner sp_buy_car_shift2;
	private TextView tv_car_shift1;
	private TextView tv_car_shift2;
	private TextView tv_car_shift3;
	private TextView tv_car_shift4;
	private TextView tv_car_time1;
	private TextView tv_car_time2;
	private TextView tv_car_time3;
	private TextView tv_car_time4;
	private TextView tv_car_ticket1;
	private TextView tv_car_ticket2;
	private TextView tv_car_ticket3;
	private TextView tv_car_ticket4;
	private TextView tv_ticket_price1;
	private TextView tv_ticket_price2;
	private TextView tv_ticket_price3;
	private TextView tv_ticket_price4;
	private ArrayAdapter<String> adapter;
	private ArrayAdapter<String> adapter1;
	private ArrayAdapter<String> adapter2;
	private Car car = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		server = new CarServer(this);

		et_ticket_number1 = (EditText) findViewById(R.id.et_ticket_number1);
		et_ticket_number2 = (EditText) findViewById(R.id.et_ticket_number2);

		bt_buy1 = (Button) findViewById(R.id.bt_buy1);
		bt_buy2 = (Button) findViewById(R.id.bt_buy2);
		bt_find = (Button) findViewById(R.id.bt_find);
		bt_find.setOnClickListener(this);
		bt_buy1.setOnClickListener(this);
		bt_buy2.setOnClickListener(this);

		sp_car_id = (Spinner) findViewById(R.id.sp_car_id);
		sp_buy_car_shift1 = (Spinner) findViewById(R.id.sp_buy_car_shift1);
		sp_buy_car_shift2 = (Spinner) findViewById(R.id.sp_buy_car_shift2);

		tv_car_shift1 = (TextView) findViewById(R.id.tv_car_shift1);
		tv_car_shift2 = (TextView) findViewById(R.id.tv_car_shift2);
		tv_car_shift3 = (TextView) findViewById(R.id.tv_car_shift3);
		tv_car_shift4 = (TextView) findViewById(R.id.tv_car_shift4);

		tv_car_time1 = (TextView) findViewById(R.id.tv_car_time1);
		tv_car_time2 = (TextView) findViewById(R.id.tv_car_time2);
		tv_car_time3 = (TextView) findViewById(R.id.tv_car_time3);
		tv_car_time4 = (TextView) findViewById(R.id.tv_car_time4);

		tv_car_ticket1 = (TextView) findViewById(R.id.tv_car_ticket1);
		tv_car_ticket2 = (TextView) findViewById(R.id.tv_car_ticket2);
		tv_car_ticket3 = (TextView) findViewById(R.id.tv_car_ticket3);
		tv_car_ticket4 = (TextView) findViewById(R.id.tv_car_ticket4);

		tv_ticket_price1 = (TextView) findViewById(R.id.tv_ticket_price1);
		tv_ticket_price2 = (TextView) findViewById(R.id.tv_ticket_price2);
		tv_ticket_price3 = (TextView) findViewById(R.id.tv_ticket_price3);
		tv_ticket_price4 = (TextView) findViewById(R.id.tv_ticket_price4);
		String[] list = server.getCarLoad();
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp_car_id.setAdapter(adapter);
		sp_car_id.setPrompt("请选择线路 ：");
		sp_car_id.setVisibility(View.VISIBLE);
	}

	public void show(int carId,Car car){
		tv_car_shift1.setText(car.getCar_shift()[0]);
		tv_car_time1.setText(car.getCar_time()[0]);
		tv_car_ticket1.setText(car.getTicket()[0]+"");
		tv_ticket_price1.setText("&"+car.getCar_price()[0]);

		tv_car_shift2.setText(car.getCar_shift()[1]);
		tv_car_time2.setText(car.getCar_time()[1]);
		tv_car_ticket2.setText(car.getTicket()[1]+"");
		tv_ticket_price2.setText("&"+car.getCar_price()[1]);

		tv_car_shift3.setText(car.getCar_shift()[2]);
		tv_car_time3.setText(car.getCar_time()[2]);
		tv_car_ticket3.setText(car.getTicket()[2]+"");
		tv_ticket_price3.setText("&"+car.getCar_price()[2]);

		tv_car_shift4.setText(car.getCar_shift()[3]);
		tv_car_time4.setText(car.getCar_time()[3]);
		tv_car_ticket4.setText(car.getTicket()[3]+"");
		tv_ticket_price4.setText("&"+car.getCar_price()[3]);

		String[] list1 = car.getCar_shift();
		adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list1);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp_buy_car_shift1.setAdapter(adapter1);
		sp_buy_car_shift1.setPrompt("请选择班次 ：");
		sp_buy_car_shift1.setVisibility(View.VISIBLE);

		adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list1);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp_buy_car_shift2.setAdapter(adapter2);
		sp_buy_car_shift2.setPrompt("请选择班次 ：");
		sp_buy_car_shift2.setVisibility(View.VISIBLE);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		int carId = 0;
		String load = null;
		String ticket_num;
		String select_shift;
		int select;
		int num;
		switch (id) {
		case R.id.bt_find:
			carId = sp_car_id.getSelectedItemPosition();
			car = server.getCar(carId);
			show(carId, car);
			break;
		case R.id.bt_buy1:
			ticket_num = et_ticket_number1.getText().toString().trim();
			if(!ticket_num.isEmpty()){
				try {
					select = sp_buy_car_shift1.getSelectedItemPosition();
					select_shift = car.getCar_shift()[select];
					num = Integer.valueOf(ticket_num).intValue();
					//					num = (int)Integer.parseInt(ticket_num.trim());
					server.saleTicket1(carId, select_shift, num);
					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			show(carId, car);
		case R.id.bt_buy2:
			ticket_num = et_ticket_number2.getText().toString().trim();
			if(!ticket_num.isEmpty()){
				try {
					select = sp_buy_car_shift2.getSelectedItemPosition();
					select_shift = car.getCar_shift()[select];
					num = Integer.valueOf(ticket_num).intValue();
					String.valueOf(num);
					//				num = (int)Integer.parseInt(ticket_num);
					server.saleTicket2(carId, select_shift, num);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			show(carId, car);
		default:
			break;
		}

	}


}
