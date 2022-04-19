/* 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_4 {

	static int med3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)	
				return b;
			else if(a >= c)	//a>b, c>b//
				return c;
			else //a>b, c>b, c>a -> c>a>b//
				return a;
		else if(a >= c) //b>a//
			return a;
		else if(b >= c) //b>a, c>a//
			return c;
		else //b>a, c>a, c>b -> c>b>a//
			return b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: "); int a = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요: "); int b = scan.nextInt();
		System.out.print("세번째 숫자를 입력하세요: "); int c = scan.nextInt();
		System.out.println("중앙값은 : "+med3(a,b,c)+" 입니다.");
	}

}
