/* ���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �Ʒ� �޼��带 �ۼ��ϼ���.
 * static int sumof(int a, int b)
 * a = 3, b = 5 -> 3 + 4 + 5 = 12 
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_9 {
	static int sumof(int a, int b) {
		int sum = 0;
		if(a >= b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}
		else {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a�� �Է��ϼ���: "); int a = scan.nextInt();
		System.out.print("b�� �Է��ϼ���: "); int b = scan.nextInt();
		System.out.println(a +"�� " + b +"������ ���� : " + sumof(a,b));
	}

}
