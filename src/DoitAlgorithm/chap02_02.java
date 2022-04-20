/* �迭 ��Ҹ� �������� �����ϴ� ������ �ϳ� �ϳ� ��Ÿ���� ���α׷��� �ۼ��ϼ���.
 * ������
 * 5 10 73 2 -5 42
 * a[0]��(��) a[5]�� ��ȯ�մϴ�.
 * 42 10 73 2 -5 5
 * a[1]��(��) a[4]�� ��ȯ�մϴ�.
 * 42 -5 73 2 10 5
 * a[2]��(��) a[3]�� ��ȯ�մϴ�.
 * 42 -5 2 73 10 5
 * ���� ������ ���ƽ��ϴ�.
*/

package DoitAlgorithm;

import java.util.*;

public class chap02_02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]��(��) a[" + (a.length - i - 1) + "]�� ��ȯ�մϴ�.");
			swap(a, i, a.length - i - 1);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();

		int[] a = new int[rand.nextInt(5) * 2 + 1];	
		for(int i = 0; i < a.length; i++) { 
			a[i] = rand.nextInt(20);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		reverse(a);
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
}
