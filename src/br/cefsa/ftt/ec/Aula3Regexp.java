package br.cefsa.ftt.ec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aula3Regexp {

	public static void main(String[] args) {

		System.out.println("Aula 3...");
		
		int x = 10 + 9;
		
		System.out.println((double) x);
		
		Pattern p = Pattern.compile("(z|a)*b");
		Matcher m = p.matcher("zaazaaab");
		boolean b = m.matches();
		 
		 System.out.println(b);
		 
		 p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		 m = p.matcher("foobar@gmail.com");

		 if (m.find())
		     System.out.println("Correct!");
	} //main

} //Aula3Regexp
