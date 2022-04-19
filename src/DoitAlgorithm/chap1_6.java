/* while문이 종료될 때 변수 i값이 n+1이 됨을 확인하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하세요.");
		System.out.print("n의 값을 입력하세요: "); int num = scan.nextInt();
		
		int sum = 0, i = 1;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("1부터 "+num+"까지의 합: "+sum);
		System.out.println("i의 값: "+i);
	}

}
