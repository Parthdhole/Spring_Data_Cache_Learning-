package com.example.demo.WeatherRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.WeatherEntity.City;

@Repository
public interface WeatherRepository extends JpaRepository<City,Integer> {

	
	

}
