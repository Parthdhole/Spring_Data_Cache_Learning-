package com.example.demo.Cache;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.WeatherEntity.City;

@Component
public class WetherCatche {


	
	// we need to save the data in cache by using collection 
	Map<Integer,City> Citylist = new HashMap<Integer,City>();

	
	  /*
	   * 1)we can  save weather  data
	   * 2)we can get data data 
	   * 3)we can check the data is present in db or not
	   * 
	   */
	
	public void storeData(City city) {
	   Citylist.put(city.getPincode(), city);

	}

      public boolean checkdata(Integer pincode){
//    	 for(City city:Citylist) {
//    		 if(city.getPincode()==pincode) {
//    			 return true;
//    		 }
//    		 
//    	 }
    	 
          return Citylist.containsKey(pincode);
	 }
	 public City getdata(Integer pincdoe){
//		 for(City city :Citylist) {
//			 if(city.getPincode()==pincdoe) {
//				 return city;
//			 }
//		 }
//		 return null;
		City city= Citylist.get(pincdoe);
		return city;
		 
	 }
	 
	 
	 // to clear the data form cache after some time 
	 public void CacheClear() {
		 
		 Citylist.clear();
	 }
	
}
