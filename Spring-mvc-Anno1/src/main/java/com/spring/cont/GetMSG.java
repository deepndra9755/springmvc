package com.spring.cont;

import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Service;
@Service
public class GetMSG {
	
public Locale [] msgRead()
{
//Locale []obj=Locale.getAvailableLocales();
	Locale j[]=Locale.getAvailableLocales();
return j;


}
}