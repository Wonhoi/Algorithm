/* n�� 7�̸� '1+2+3+4+5+6+7=28'�� ����ϴ� ���α׷��� �ۼ��ϼ���.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���ϼ���.");
		System.out.print("n�� ���� �Է��ϼ���: "); int num = scan.nextInt();
		
		int sum = 0, i = 1;
		
		System.out.print(i);
		while(i < num) {
			sum += i;
			System.out.print(" + " +(i+1));
			i++;
		}
		
		System.out.print(" = "+(sum+i));
	}

}
