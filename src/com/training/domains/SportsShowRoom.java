package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsShowRoom extends ShowRoom {

	public Automobile getItem(int key){
		if(key==4)
		return new SportsBike();
		else
			return super.getItem(key);
		}
	}

