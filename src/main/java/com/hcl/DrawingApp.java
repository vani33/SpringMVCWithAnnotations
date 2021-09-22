package com.hcl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle1 = (Triangle)beanFactory.getBean("triangle");
		//triangle.draw();
		Triangle triangle2 = (Triangle)beanFactory.getBean("triangle");
		System.out.println(triangle1);
		System.out.println(triangle2);
	}
}
