/* 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 135를 입력하면 '그 수는 3자리입니다.' 라고 출력하고,
 * 1314를 입력하면 '그 수는 4자리입니다.'라고 출력하면 됩니다.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, i = 0;
		do {
			System.out.print("입력한 숫자: "); num = scan.nextInt();
			if(num <= 0)
				System.out.println("양의 정수를 입력하세요.");
			else
				break;
		} while(true);
		
		int origin = num;
		
		do {
			num = num / 10;
			i++;
		} while(num != 0);
		
		System.out.println(origin + " 은/는 " + i + "자리입니다.");
	}

}
