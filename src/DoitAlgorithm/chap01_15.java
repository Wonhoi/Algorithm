/* 직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요.
 * static void triangleLB(int n) // 왼쪽 아래가 직각인 이등변 삼각형을 출력
 * static void triangleLU(int n) // 왼쪽 위가 직각인 이등변 삼각형을 출력
 * static void triangleRB(int n) // 오른쪽 아래가 직각인 이등변 삼각형을 출력
 * static void triangleRU(int n) // 오른쪽 위가 직각인 이등변 삼각형을 출력
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_15 {
	/* 왼쪽 아래가 직각인 이등변 삼각형
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */	
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	/* 왼쪽 위가 직각인 이등변 삼각형
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 */
	static void triangleLU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	/* 오른쪽 아래가 직각인 이등변 삼각형
	 *     *
	 *    **
	 *   ***
	 *  ****
	 * *****
	 */
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= (n-i); j++)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	/* 오른쪽 위가 직각인 이등변 삼각형
	 * *****
	 *  ****
	 *   ***
	 *    **
	 *     *
	 */
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k < i; k++)
				System.out.print(" ");
			for(int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수: "); int num = scan.nextInt();
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		triangleLB(num);
		System.out.println();
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		triangleLU(num);
		System.out.println();
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		triangleRB(num);
		System.out.println();
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		triangleRU(num);
		System.out.println();
	
	}
}
