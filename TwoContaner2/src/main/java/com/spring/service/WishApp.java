package com.spring.service;

import java.util.Date;

public class WishApp implements TimeGetter {

	@Override
	public String getmms(){
		// TODO Auto-generated method stub
		Date d=null;
		d=new Date();
		int timee=d.getHours();
		if(timee<12)
		{
			return "good morning user";
		}
		else if(timee>12)
		{
			return "good after-noon user";
		}
		
		return "good night user";
		
	}

}
