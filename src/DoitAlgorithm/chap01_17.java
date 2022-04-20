/* n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.
 * static void npira(int n)
 *    1
 *   222
 *  33333  
 * 4444444
 * i행에 출력하는 숫자는 i % 10으로 구하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_17 {
	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= (n-i); j++)
				System.out.print(" ");
			for(int k = 1; k <= (i-1)*2+1; k++)
				System.out.print(i%10);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("피라미드의 높이: "); int num = scan.nextInt();
		System.out.println(num + "단의 피라미드를 출력합니다.");
		npira(num);
	}
}
