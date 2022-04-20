/* 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
 * 단, b값이 a값보다 이하이면 다시 입력하세요. 
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.print("a를 입력하세요: ");
		a = scan.nextInt();
		do {
			System.out.print("b를 입력하세요: ");
			b = scan.nextInt();
			if(a >= b)
				System.out.println("a보다 큰 값을 입력하세요.");
			else
				break;
		} while(true);
		
		System.out.println("b - a는 " + (b-a) + "입니다.");
		
	}

}
