/* n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램을 작성하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하세요.");
		System.out.print("n의 값을 입력하세요: "); int num = scan.nextInt();
		
		int sum = 0, i = 1;
		
		System.out.print(i);
		while(i < num) {
			sum += i;
			System.out.print(" + " +(i+1));
			i++;
		}
		
		System.out.print(" = "+(sum+i));
	}

}
