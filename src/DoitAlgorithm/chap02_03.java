/* �迭 a�� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ��ϼ���.
 * static int sumOf(int[] a)
*/

package DoitAlgorithm;

import java.util.*;

public class chap02_03 {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();

		int[] a = new int[5];	
		for(int i = 0; i < a.length; i++) { 
			a[i] = rand.nextInt(20);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("�迭 a�� ��� ����� �հ�: " +sumOf(a));
		
	}
}
