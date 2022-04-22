/* �޼��� dayOfYear�� ���� i�� days���� �����ϼ���.
 * while���� ����ϼ���.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap02_08 {
	
	//--- �� ���� �ϼ� ---//
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, 	//���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//����
	};
	
	//--- �������� �Ǵ�, ����->1, ���->0 ��ȯ ---//
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	//--- ���� �ϼ��� ���ϴ� �޼��� ---//
	static int dayOfYear(int y, int m, int d) {
		while(--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return (d);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int retry;	//--- ��õ� ---//
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		do {
			System.out.print("�� : "); int y = scan.nextInt();
			System.out.print("�� : "); int m = scan.nextInt();
			System.out.print("�� : "); int d = scan.nextInt();
			
			System.out.println("�� �� ��� �ϼ��� " +dayOfYear(y, m, d) +"�� �Դϴ�.");
			System.out.print("��õ� (1.�� / 0.�ƴϿ�)"); retry = scan.nextInt();
		} while(retry == 1);
	}
}
