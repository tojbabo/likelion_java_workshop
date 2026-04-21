package workshop_07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test06 {

	public static void main(String[] args) {
		String mesg = "heLLO";
		StringBuilder sb= new StringBuilder(mesg);
		System.out.println("대문자로: "+mesg.toUpperCase());
		System.out.println("소문자로: "+mesg.toLowerCase());
		System.out.println("문자열 길이: " +mesg.length());
		System.out.println("1번째 위치 문자: "+sb.charAt(1));
		System.out.println("문자열 연결: "+sb.append("~~~"));
		System.out.println("h 문장열 포함 여부: "+((sb.indexOf("h")==-1)?false:true));
		System.out.println("he 문자열 포함 여부: "+((sb.indexOf("he")==-1)?false:true));
		System.out.println("hw 문자열 포함 여부: "+((sb.indexOf("hw")==-1)?false:true));
		System.out.println("h 문자로 끝나는지 여부: "+((sb.indexOf("h")!=mesg.length()-1)?false:true));
		System.out.println("h 문자로 시작하는지 여부: "+((sb.indexOf("h")!=0)?false:true));
		System.out.println("O 문자를 X 문자로 변경: "+mesg.replace("O", "X"));
		System.out.println("HELLO 문자열인지 비교: "+ ((mesg.compareTo("HELLO")==0)?true:false));
		System.out.println("HELLO 문자열인지 비교(대소문자 무시): "+ ((mesg.compareToIgnoreCase("HELLO")==0)?true:false));
	}

}
