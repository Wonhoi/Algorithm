/* n���� ���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���.
 * static void npira(int n)
 *    1
 *   222
 *  33333  
 * 4444444
 * i�࿡ ����ϴ� ���ڴ� i % 10���� ���ϼ���.
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
		System.out.print("�Ƕ�̵��� ����: "); int num = scan.nextInt();
		System.out.println(num + "���� �Ƕ�̵带 ����մϴ�.");
		npira(num);
	}
}
