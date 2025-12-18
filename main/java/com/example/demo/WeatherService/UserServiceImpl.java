package com.example.demo.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Cache.WetherCatche;
import com.example.demo.WeatherEntity.City;
import com.example.demo.WeatherRepository.WeatherRepository;

@Service
public class UserServiceImpl implements TempService {


	@Autowired
	WeatherRepository repository;
	
	
	@Autowired
	WetherCatche catche;
	
//	WetherCatche catche = new WetherCatche();
	
	@Override
	public City savedata(City city) {
		return repository.save(city);
	
	}
	
	/*
	 *  1)check the data is present in catche  if present return it
	 *  2)if not the go to data base and store the data
	 * 
	 * 
	 */

	@Override
	public City getdata(Integer pincode) {
		// TODO Auto-generated method stub
	    System.out.println("Checking data inside cache");

		if(catche.checkdata(pincode)) {
	        System.out.println("Data present in cache, returning data");
			return catche.getdata(pincode);
		}
		System.out.println("data is not present in cache and now gettign data from db");
		City city = repository.findById(pincode).get();
	    System.out.println("Storing data in cache");
		catche.storeData(city);
	    System.out.println("Returning data");

		return city; 
	}
	
	
	
	
	
	
	

}
