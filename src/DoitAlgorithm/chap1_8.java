/* 1���� 10������ ���� (1+10)*5 �� ���� ������� ���� �� �ֽ��ϴ�.
 * ���콺 �����̶�� ����� �̿��Ͽ� 1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���ϼ���.");
		System.out.print("n�� ���� �Է��ϼ���: "); int num = scan.nextInt();
		
		int sum = 0;
		
		sum = (1 + num) * (num / 2) + (num % 2 == 1 ? (num + 1) / 2 : 0);

		System.out.println("1���� "+num+"������ ��: "+sum);
	}

}
