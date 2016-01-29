package com.training.domains;

import com.training.ifaces.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "white";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i20";
	}

}
