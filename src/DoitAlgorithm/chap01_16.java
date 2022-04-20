/* n단의 피라미드를 출력하는 메서드를 작성하세요.
 *    *
 *   ***
 *  *****
 * *******
 * static void spira(int n)
 * i행 (i - 1) * 2 + 1
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_16 {
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= (n-i); j++)
				System.out.print(" ");
			for(int k = 1; k <= (i -1) * 2 + 1; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("피라미드의 높이: "); int num = scan.nextInt();
		System.out.println(num + "단의 피라미드를 출력합니다.");
		spira(num);
		
	}
}
