package javafundamentalX;

import java.util.*;
/*
@Author Andara a.k.a. Sandhy
Junior Programmer
Created with Eclipse version 2022-09(4.25.0)
Created on 09-11-2022 09:09:09
Last Modified on 09-11-2022 09:09:09
Version 1.0
*/

public class Day3String {

	public static void main(String[] args) {
		System.out.println("4"+4);	
		
		//String
		String strK = new String ("OP");
		//String strK = "OP";
		if(strK == "OP") {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		//String Concat
		String str1 = "Sandhy";
		String str2 = "Akmal";
		
		System.out.println(str1.concat(str2));
		
		
		//append
		StringBuilder sb1 = new StringBuilder("Sandhy Akmal ");
		System.out.println("Input: " + sb1);
		
		sb1.append("Nasution");
        System.out.println("Output: " + sb1);
        
        //length
        String nama = "Sandhy Akmal Nasution";
        System.out.println(nama.length());
        char huruf = nama.charAt(0);
        System.out.println(huruf);
        
        //banding == dan equals
        String str3 = "Sandhy";
		String str4 = "sandhy"+"";
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		
		//substring
		String str5 = "Welcome";
		System.out.println(str5.substring(4));
		
		//input
		Scanner sc = new Scanner(System.in);
		int panjang, lebar;
		String strA;
		
		System.out.print("Masukan Nama: ");
		strA = sc.nextLine();
		
		System.out.print("Masukan Panjang: ");
		panjang = sc.nextInt();
		
		System.out.print("Masukan Lebar: ");
		lebar = sc.nextInt();
		
		int hasil = panjang * lebar;
		
		System.out.println("Nama: "+strA);
		System.out.println("Panjang x Lebar adalah: "+hasil);
	}

}
