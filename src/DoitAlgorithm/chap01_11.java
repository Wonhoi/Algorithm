/* ���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ���� ��� 135�� �Է��ϸ� '�� ���� 3�ڸ��Դϴ�.' ��� ����ϰ�,
 * 1314�� �Է��ϸ� '�� ���� 4�ڸ��Դϴ�.'��� ����ϸ� �˴ϴ�.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, i = 0;
		do {
			System.out.print("�Է��� ����: "); num = scan.nextInt();
			if(num <= 0)
				System.out.println("���� ������ �Է��ϼ���.");
			else
				break;
		} while(true);
		
		int origin = num;
		
		do {
			num = num / 10;
			i++;
		} while(num != 0);
		
		System.out.println(origin + " ��/�� " + i + "�ڸ��Դϴ�.");
	}

}
