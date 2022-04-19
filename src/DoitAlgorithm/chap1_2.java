/* 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
 * static int min3(int a, int b, int c)
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_2 {

	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: "); int a = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요: "); int b = scan.nextInt();
		System.out.print("세번째 숫자를 입력하세요: "); int c = scan.nextInt();
		System.out.println("최솟값은 : "+min3(a,b,c)+" 입니다.");
	}

}
