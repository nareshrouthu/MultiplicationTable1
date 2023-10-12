package com.example.MultiplicationTable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MultiplicationTableApplication {


	public static void main(String[] args)
	{
		SpringApplication.run(MultiplicationTableApplication.class, args);
		int a=2;
		for(int k=1;k<=10;k++)
		{
			System.out.println("2 * "+k+ " = "+a*k);
		}

	}

}
