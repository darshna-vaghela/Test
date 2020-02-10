package com.unique;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Student sRef=new Student();
		sRef.setSid(101);
		sRef.setSname("John");
		sRef.setSaddress("Rajkot");
		System.out.println("Student Details:" + sRef);
	
	Resource resource=new ClassPathResource("StudentConfig.xml");
	BeanFactory factory=new XmlBeanFactory(resource);//spring container which  shall parse XML file and construct the objects
	
	ApplicationContext context=new ClassPathXmlApplicationContext("StudentConfig.xml");
	
	Student st1=(Student)factory.getBean("S1");
	Student st2=factory.getBean("S2",Student.class);

	//Student st1=(Student)context.getBean("S1");
	//Student st2=context.getBean("S2",Student.class);

	System.out.println("Student Details 1:" + st1);
	System.out.println("Student Details 2: " + st2);
	}
}
 