/* �Է��� ���� �� ������ �ϴ� ���簢����
 * *��ȣ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� ��: "); int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
