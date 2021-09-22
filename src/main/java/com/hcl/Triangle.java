package com.hcl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Triangle {

	public void draw(){
		System.out.println("Triangle -> new draw");
	}
}
