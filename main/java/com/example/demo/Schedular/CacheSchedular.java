package com.example.demo.Schedular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.Cache.WetherCatche;

@Component
@EnableScheduling
public class CacheSchedular {   
	
	
	
	@Autowired
	WetherCatche wetherCatche;
	
	 @Scheduled(initialDelay = 50000,fixedDelay = 50000)
	 public void m1() {
		 
		 System.out.println("data in cache are clear");
		 wetherCatche.CacheClear();
		  System.out.println("fetching all data from db");
		 wetherCatche.fetchdatadb();
		 
	 }
	
	


}
