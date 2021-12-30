package com.example.practice.schedulers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
	public class Scheduler { 
	   @Scheduled(fixedRate = 10000)
	   public void fixedRateSch() {
	      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

	      Date now = new Date();
	      String strDate = sdf.format(now);
	      System.out.println("Fixed Rate scheduler:: " + "todaysDate::" + strDate);
	   }
	  
}

