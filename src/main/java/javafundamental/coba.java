package javafundamental;

import java.util.*;

public class coba {
	public static void main (String args[]) {
		String strA = "Tb@14XzM";
		char[] charA = strA.toCharArray();
		//System.out.print(charA[1]);
		
		int intB = 0;
		for (int i=0;i<strA.length();i++) {
			if(charA[i]>=65 && charA[i]<=90) {
				intB += charA[i];
			}
		}
		//System.out.print(intB);
		
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