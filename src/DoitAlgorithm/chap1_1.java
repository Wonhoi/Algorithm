/* 네 값의 최대값을 구하는 max4 메서드를 작성하세요. 
	static int max4(int a, int b, int c, int d)
	작성한 메세드를 테스트 하기 위해 main 메서드를 포함한 프로그램을 작성해야 합니다.
	이후의 문제도 마찬가지입니다.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_1 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 :"); int a = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 :"); int b = scan.nextInt();
		System.out.print("세번째 숫자를 입력하세요 :"); int c = scan.nextInt();
		System.out.print("네번째 숫자를 입력하세요 :"); int d = scan.nextInt();
		
		System.out.println("최댓값은 : "+max4(a, b, c, d)+" 입니다.");

	}

}
