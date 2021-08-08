package com.spring.controllere;

import java.util.Date;

public class WPPApp {
	
	public String msg()
	{
		
	Date d=new Date();
	int yerr=d.getYear();
	if(yerr>2010)
	{
		return "2010 has complete";
	}
	else if(yerr>2020)
	{
		return "2020 has complete";
	}
	return "cuureentu year "+yerr;
	}

}
