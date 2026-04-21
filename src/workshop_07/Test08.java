package workshop_07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test08 {

	public static void main(String[] args) {
		String mesg = "     홍길동/이순신/유관순     	";
		System.out.printf("문자열 길이(공백포함):%d\n",mesg.length());
		System.out.printf("공백제거: %s\n",mesg.replace(" ",""));
		System.out.printf("공백제거된 문자열 길이: %d\n",mesg.replace(" ","").length());
		System.out.printf("부분열: %s\n",mesg.replace(" ","").substring(0,8));
		System.out.printf("홍길동 출력: %s\n",mesg.replace(" ","").substring(0,3));
		System.out.printf("유관순 출력: %s\n",mesg.replace(" ","").substring(8,12));
	}

}
