/* �� ���� a, b�� ������ �Է��ϰ� b-a�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ��, b���� a������ �����̸� �ٽ� �Է��ϼ���. 
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.print("a�� �Է��ϼ���: ");
		a = scan.nextInt();
		do {
			System.out.print("b�� �Է��ϼ���: ");
			b = scan.nextInt();
			if(a >= b)
				System.out.println("a���� ū ���� �Է��ϼ���.");
			else
				break;
		} while(true);
		
		System.out.println("b - a�� " + (b-a) + "�Դϴ�.");
		
	}

}
