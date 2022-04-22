/* y�� m�� d���� �� �� ���� �� ��(12�� 31���̸� 0, 12�� 30���̸� 1)�� ���ϴ� �޼��带 �ۼ��ϼ���.
 * static int leftDayOfYear(int y, int m, int d)
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap02_09 {
	
	//--- �� ���� �ϼ� ---//
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 	//���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//����
	};
	
	//--- �������� �Ǵ�, ����->1, ���->0 ��ȯ ---//
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	//--- �� �� ���� �ϼ��� ���ϴ� �޼��� ---//
	static int leftDayOfYear(int y, int m, int d) {
		int totalDays = 365;
		int days = d;
		
		for(int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i - 1];
		}
		return days = totalDays - days;
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int retry;	//--- ��õ� ---//
		
		System.out.println("�� �� ���� �ϼ��� ���մϴ�.");
		do {
			System.out.print("�� : "); int y = scan.nextInt();
			System.out.print("�� : "); int m = scan.nextInt();
			System.out.print("�� : "); int d = scan.nextInt();
			
			System.out.println("�� �� ���� �ϼ��� " +leftDayOfYear(y, m, d) +"�� �Դϴ�.");
			System.out.print("��õ� (1.�� / 0.�ƴϿ�)"); retry = scan.nextInt();
		} while(retry == 1);
	}
}
