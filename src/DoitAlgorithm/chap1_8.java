/* 1부터 10까지의 합은 (1+10)*5 와 같은 방법으로 구할 수 있습니다.
 * 가우스 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하세요.");
		System.out.print("n의 값을 입력하세요: "); int num = scan.nextInt();
		
		int sum = 0;
		
		sum = (1 + num) * (num / 2) + (num % 2 == 1 ? (num + 1) / 2 : 0);

		System.out.println("1부터 "+num+"까지의 합: "+sum);
	}

}
