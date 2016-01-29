package com.training.apps;

import com.training.domains.*;
import com.training.ifaces.Automobile;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsShowRoom showRoom = new SportsShowRoom();
		Automobile polyAuto = null;
		int key = 1;
		
		polyAuto = showRoom.getItem(key);
		if(polyAuto!=null)
		{
		showRoom.printQuote(polyAuto);
		}
		else{
			System.out.println("INVALID OPTION - Try Again");
		}
	}

}
