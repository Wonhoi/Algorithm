/* �� ���� ��� ���� 13������ ��� ���տ� ���� �߾Ӱ��� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_4 {

	static int med3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)	
				return b;
			else if(a >= c)	//a>b, c>b//
				return c;
			else //a>b, c>b, c>a -> c>a>b//
				return a;
		else if(a >= c) //b>a//
			return a;
		else if(b >= c) //b>a, c>a//
			return c;
		else //b>a, c>a, c>b -> c>b>a//
			return b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: "); int a = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: "); int b = scan.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���: "); int c = scan.nextInt();
		System.out.println("�߾Ӱ��� : "+med3(a,b,c)+" �Դϴ�.");
	}

}
