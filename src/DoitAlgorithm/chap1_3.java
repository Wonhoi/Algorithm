/* 네 값의 최솟값을 구하는 min4 메소드를 작성하세요.
 * static int min4(int a, int b, int c, int d)
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_3 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: "); int a = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요: "); int b = scan.nextInt();
		System.out.print("세번째 숫자를 입력하세요: "); int c = scan.nextInt();
		System.out.print("네번째 숫자를 입력하세요: "); int d = scan.nextInt();
		System.out.println("최솟값은 : "+min4(a,b,c,d)+" 입니다.");
	}

}
