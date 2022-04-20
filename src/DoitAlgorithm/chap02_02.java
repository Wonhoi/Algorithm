/* 배열 요소를 역순으로 정렬하는 과정을 하나 하나 나타내는 프로그램을 작성하세요.
 * 모범출력
 * 5 10 73 2 -5 42
 * a[0]과(와) a[5]를 교환합니다.
 * 42 10 73 2 -5 5
 * a[1]과(와) a[4]를 교환합니다.
 * 42 -5 73 2 10 5
 * a[2]과(와) a[3]를 교환합니다.
 * 42 -5 2 73 10 5
 * 역순 정렬을 마쳤습니다.
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
			System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
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
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}
