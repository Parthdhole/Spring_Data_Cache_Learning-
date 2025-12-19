package com.example.demo.WeaterController;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.WeatherEntity.City;
import com.example.demo.WeatherService.TempService;
import com.example.demo.WeatherService.UserServiceImpl;

@RestController
public class Controller {
	

	@Autowired
	TempService temp;
	@PostMapping("savedata")
	public City savedata(@RequestBody City city) {
		return temp.savedata(city);
			
	}
	
	@GetMapping("getdata/{pincode}")
	public City getdata(@PathVariable Integer pincode) {
		return temp.getdata(pincode);
		
	}
	

}
