package com.example.demo.Cache;



import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.example.demo.WeatherEntity.City;

@Component
public class WetherCatche {


	
	// we need to save the data in cache by using collection 
	List<City> Citylist = new ArrayList<>();

	
	  /*
	   * 1)we can  save weather  data
	   * 2)we can get data data 
	   * 3)we can check the data is present in db or not
	   * 
	   */
	
	public void storeData(City city) {
		Citylist.add(city);

	}

      public boolean checkdata(Integer pincode){
    	 for(City city:Citylist) {
    		 if(city.getPincode()==pincode) {
    			 return true;
    		 }
    		 
    	 }
    	 return false;
	 }
	 public City getdata(Integer pincdoe){
		 for(City city :Citylist) {
			 if(city.getPincode()==pincdoe) {
				 return city;
			 }
		 }
		 return null;
		 
	 }
	
}
