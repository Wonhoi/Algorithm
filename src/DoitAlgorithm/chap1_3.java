/* �� ���� �ּڰ��� ���ϴ� min4 �޼ҵ带 �ۼ��ϼ���.
 * static int min4(int a, int b, int c, int d)
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_3 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: "); int a = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: "); int b = scan.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���: "); int c = scan.nextInt();
		System.out.print("�׹�° ���ڸ� �Է��ϼ���: "); int d = scan.nextInt();
		System.out.println("�ּڰ��� : "+min4(a,b,c,d)+" �Դϴ�.");
	}

}
