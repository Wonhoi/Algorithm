/* �� ���� �ִ밪�� ���ϴ� max4 �޼��带 �ۼ��ϼ���. 
	static int max4(int a, int b, int c, int d)
	�ۼ��� �޼��带 �׽�Ʈ �ϱ� ���� main �޼��带 ������ ���α׷��� �ۼ��ؾ� �մϴ�.
	������ ������ ���������Դϴ�.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_1 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� :"); int a = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� :"); int b = scan.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ��� :"); int c = scan.nextInt();
		System.out.print("�׹�° ���ڸ� �Է��ϼ��� :"); int d = scan.nextInt();
		
		System.out.println("�ִ��� : "+max4(a, b, c, d)+" �Դϴ�.");

	}

}
