/* 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
 * static int sumof(int a, int b)
 * a = 3, b = 5 -> 3 + 4 + 5 = 12 
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_9 {
	static int sumof(int a, int b) {
		int sum = 0;
		if(a >= b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}
		else {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a를 입력하세요: "); int a = scan.nextInt();
		System.out.print("b를 입력하세요: "); int b = scan.nextInt();
		System.out.println(a +"와 " + b +"사이의 합은 : " + sumof(a,b));
	}

}
