package javafundamentalX;

import java.util.*; // menambahkan fungsi untuk random 

/*
@Author Andara a.k.a. Sandhy
Junior Programmer
Created with Eclipse version 2022-09(4.25.0)
Created on 09-11-2022 09:09:09
Last Modified on 09-11-2022 09:09:09
Version 1.0
*/

public class Day2 {
	public static void main (String args[]) {
		String strA = "Tb@14XzM";
		char[] charA = strA.toCharArray();
		System.out.println(charA[1]);
		
		int intB = 0;
		for (int i=0;i<strA.length();i++) {
			if(charA[i]>=65 && charA[i]<=90) {
				intB += charA[i];
			}
		}
		System.out.println(intB);
		
		/*
		 Membuat Fungsi Random untuk menampilkan Huruf Kapital, Kecil, dan Angka
		
		*/
		Random ran = new Random();
		int intX = 0;
		char chY;
		String strB = "";
		for (int i = 0;i<9;i++) {
			if(i<3) {
				chY = (char) ran.nextInt(65, 91);
				strB = strB+chY;
			} else if(i<6) {
				chY = (char) ran.nextInt(97, 123);
				strB = strB+chY;
			} else if(i<9) {
				chY = (char) ran.nextInt(48, 58);
				strB = strB+chY;
			}
			
		}
		System.out.println(strB);
	}
	
}