/* while���� ����� �� ���� i���� n+1�� ���� Ȯ���ϼ���.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap1_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���ϼ���.");
		System.out.print("n�� ���� �Է��ϼ���: "); int num = scan.nextInt();
		
		int sum = 0, i = 1;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("1���� "+num+"������ ��: "+sum);
		System.out.println("i�� ��: "+i);
	}

}
