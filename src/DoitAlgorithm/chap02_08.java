/* 메서드 dayOfYear를 변수 i와 days없이 구현하세요.
 * while문을 사용하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap02_08 {
	
	//--- 각 월의 일수 ---//
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 	//평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//윤년
	};
	
	//--- 윤년인지 판단, 윤년->1, 평년->0 반환 ---//
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	//--- 남은 일수를 구하는 메서드 ---//
	static int dayOfYear(int y, int m, int d) {
		while(--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return (d);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int retry;	//--- 재시도 ---//
		
		System.out.println("그 해 경과 일수를 구합니다.");
		do {
			System.out.print("년 : "); int y = scan.nextInt();
			System.out.print("월 : "); int m = scan.nextInt();
			System.out.print("일 : "); int d = scan.nextInt();
			
			System.out.println("그 해 경과 일수는 " +dayOfYear(y, m, d) +"일 입니다.");
			System.out.print("재시도 (1.예 / 0.아니오)"); retry = scan.nextInt();
		} while(retry == 1);
	}
}
