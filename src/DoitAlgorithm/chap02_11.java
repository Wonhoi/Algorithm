/* ���� ������� �ʵ�� ���� Ŭ������ ���弼��.
 * ������ ���� ������(constructor)�� �޼��带 �����ؾ��մϴ�.
 * ������(�־��� ��¥�� ����)
 * YMD(int y, int m, int d)
 * n�� ���� ��¥�� ��ȯ
 * YMD after(int n)
 * n�� ���� ��¥�� ��ȯ
 * YMD before(int n)
*/

package DoitAlgorithm;

import java.util.Scanner;

class YMD {
	int y;		//��
	int m;		//��(1~12)
	int d;		//��(1~31)
	
	//---������---//
	YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	//---�� ���� �ϼ� ---//
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		//���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		//����
	};
	
	//---�������� �˻��ϴ� �޼���---//
	static int isLeap(int y) {
		return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 1 : 0;
	}
	
	
	//---n�� ���� ��¥�� ��ȯ---//
	YMD after(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		if(n < 0)
			return before(-n);
		
		temp.d += n;
		
		while(temp.d > mdays[isLeap(y)][temp.m -1]) {
			temp.d -= mdays[isLeap(y)][temp.m -1];
			if(++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}			
		}
		return temp;
	}
	
	//---n�� ���� ��¥�� ��ȯ---//
	YMD before(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		if(n < 0)
			return after(-n);
		
		temp.d -= n;
		while(temp.d < 1) {
			if(--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(y)][temp.m -1];
		}
		return temp;
	}
}

public class chap02_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��¥�� �Է��ϼ���.");
		System.out.print("�� : "); int y = scan.nextInt();
		System.out.print("�� : "); int m = scan.nextInt();
		System.out.print("�� : "); int d = scan.nextInt();
		YMD date = new YMD(y, m, d);
		
		System.out.print("��ĥ ��/���� ��¥�� ���ұ��? : ");
		int n = scan.nextInt();
		
		YMD d2 = date.before(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d2.y, d2.m, d2.d);
		
		YMD d1 = date.after(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d1.y, d1.m, d1.d);
	}
}
