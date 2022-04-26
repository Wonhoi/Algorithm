/* ��� ��ȯ ������ �ڼ��� ��Ÿ���� ���α׷��� �ۼ��ϼ���.
 * ������
 * 10������ ��� ��ȯ�մϴ�.
 * ��ȯ�ϴ� ���� �ƴ� ����: >59
 * � ������ ��ȯ�ұ��?(2-36): >2
 * 
 * 2|     59
 *  +--------
*/

package DoitAlgorithm;

import java.util.*;

public class chap02_07 {
	//x : ����, r : ����, d : �ڸ���
	static int cardConv(int x, int r, char[] d) {
		//---x---//
		int n = ((Integer)x).toString().length();
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		
		/* String Ŭ������ format �޼ҵ�� ������ ��ġ�� ������ ���� ���ڿ� �������� ��ȯ�ϴ� �޼ҵ��Դϴ�.
		 * ������ C�� Java�� printf�� �����ϰ� %d, %s, %f���� ������ ����մϴ�.
		 * ���� ���, String.format("%3d, %2d", 10, 20)�� ���
		 * �� ĭ�� Ȯ���ϰ� �����ʺ��� 10�� �Է�, �� ĭ�� Ȯ���ϰ� �����ʺ��� 20�� �Է��Ͽ� 10, 20�� �� ���Դϴ�.
		 * %%�� format���� '%'���ڸ� �ǹ��մϴ�. format���� '%'��� ���ڸ� ����ϰ� ������ %% �ι� ���� �˴ϴ�.
		 * String.format("%%2d, %%%dd, %%d", n)
		 * %%�� ���� ġȯ�ϸ� %2d, %%dd, %d�� �˴ϴ�. ���⼭ ��� %d�ڸ��� n(=2)���� �����մϴ�.
		 * �׷��� %2d, %2d, %d�� �˴ϴ�. �̰��� ���ڿ��� ��ȯ�մϴ�.
		 * String.format("%%2d, %%%dd, %%d", n) <<==>> "%2d, %2d, %d" (String ������ ��)
		 */
		
		// System.out.printf("%2d | %nd",r, x);
		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do {
			System.out.printf("   +");
			for(int i = 0; i < n+2; i++)
				System.out.print("-");
			System.out.println();
			
			if(x / r !=0)
				System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), r, x / r, x % r);
				//System.out.printf("%d", r + "|    %d �� %d",x/r, x%r);
			else
				System.out.printf(String.format("     %%%dd    ... %%d\n", n), x / r, x % r);
				//System.out.printf("              %d �� %d",x/r, x%r);
			
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for(int i = 0; i < digits/2; i++) {
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
			
			System.out.print("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�) : ");
			retry = scan.nextInt();
		} while (retry == 1);
	}
}
