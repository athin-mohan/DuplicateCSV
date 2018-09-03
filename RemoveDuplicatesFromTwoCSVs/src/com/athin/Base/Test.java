package com.athin.Base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test{

	public static void main(String[] args) throws IOException {
		
		int flag=0;
		
		FileReader reader=new FileReader("C:\\Users\\Athin\\Desktop\\TestCsv\\old.csv");
		BufferedReader breader=new BufferedReader(reader);
		
		
	String line1=breader.readLine();
	FileWriter writer=new FileWriter("C:\\Users\\Athin\\Desktop\\TestCsv\\now.csv",true);
	BufferedWriter bwriter=new BufferedWriter(writer);
	while(line1!=null)
	{
		System.out.println(line1);
		MultiExample m1= new MultiExample(line1, bwriter);
		m1.start();
		line1=breader.readLine();
		System.out.println(line1);
		MultiExample m2= new MultiExample(line1, bwriter);
		m2.start();
		line1=breader.readLine();
		MultiExample m3= new MultiExample(line1, bwriter);
		m3.start();
		line1=breader.readLine();
		MultiExample m4= new MultiExample(line1, bwriter);
		m4.start();
		line1=breader.readLine();
		MultiExample m5= new MultiExample(line1, bwriter);
		m5.start();
		line1=breader.readLine();
		MultiExample m6= new MultiExample(line1, bwriter);
		m6.start();
		line1=breader.readLine();
		MultiExample m7= new MultiExample(line1, bwriter);
		m7.start();
		line1=breader.readLine();
		MultiExample m8= new MultiExample(line1, bwriter);
		m8.start();
		line1=breader.readLine();
		MultiExample m9= new MultiExample(line1, bwriter);
		m9.start();
		line1=breader.readLine();
		MultiExample m10= new MultiExample(line1, bwriter);
		m10.start();
		while(m10.isAlive()||m1.isAlive());
		
	}
	
	{
		breader.close();
		reader.close();
		bwriter.flush();
		bwriter.close();
	}
	}
	
}