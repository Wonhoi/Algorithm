/* �� ���� �ּڰ��� ���ϴ� min3 �޼��带 �ۼ��ϼ���.
 * static int min3(int a, int b, int c)
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_2 {

	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: "); int a = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: "); int b = scan.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���: "); int c = scan.nextInt();
		System.out.println("�ּڰ��� : "+min3(a,b,c)+" �Դϴ�.");
	}

}
