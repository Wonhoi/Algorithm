/* �迭�� ���ʿ� �Ʒ��ڸ��� �ƴ϶� ���ڸ��� �־�δ� �޼��带 �ۼ��ϼ���.
 * static int cardConv(int x, int r, char[] d)
*/

package DoitAlgorithm;

import java.util.*;

public class chap02_06 {
	//x : ����, r : ����, d : �ڸ���
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		} while (x != 0);
		
		for(int i =0; i < digits/2; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int no, cd, dno, retry; //no : ����, cd : ���, dno : ��ȯ ���� �ڸ���, retry : �ݺ�����
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = scan.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = scan.nextInt();
			} while (cd < 2 || cd > 32);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for(int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�)");
			retry = scan.nextInt();
		} while (retry == 1);
	}
}
