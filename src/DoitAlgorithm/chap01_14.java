/* 입력한 수를 한 변으로 하는 정사각형을
 * *기호로 출력하는 프로그램을 작성하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수: "); int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
