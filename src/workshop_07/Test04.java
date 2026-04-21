package workshop_07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am seconed to none";
		StringTokenizer words = new StringTokenizer(str," ");
		
		char[] alphavets = str.replace(" ", "").toCharArray();
		for(char c : alphavets) {
			if(c==' ') continue;
			System.out.print(" "+c);
		}
		System.out.println(" 문자개수: "+alphavets.length);
		
		int count  = words.countTokens();
		while(words.hasMoreTokens()) {
			System.out.print(" "+words.nextToken());
		}
		System.out.println(" 단어개수: "+count);
		
		
		
	}

}
