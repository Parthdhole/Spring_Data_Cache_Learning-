package com.example.demo.WeatherService;

import com.example.demo.WeatherEntity.City;

public interface TempService {
	
	
	
	public City savedata(City city);
	
	public City getdata(Integer pincode);

}
