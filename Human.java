package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	Heart heart;

	@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	
     public void humanFunc() {
     System.out.println("Human function calling heart");
      heart.heartFunction();
	}

}
