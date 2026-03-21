package com.klu.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import com.klu.model.Library;
import com.klu.config.AppConfig;
public class MainApp {

	public static void main(String args[]) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Library library =context.getBean(Library.class);
		library.displayDetails();
	}
}
