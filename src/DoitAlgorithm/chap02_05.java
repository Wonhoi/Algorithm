/* 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요.
 * static void rcopy(int[] a, int[] b)
*/

package DoitAlgorithm;

import java.util.*;

public class chap02_05 {
	static void rcopy(int[] a, int[] b) {
		if(a.length != b.length)
			System.out.println("배열의 크기가 맞지 않습니다.");
		else
			for(int i = 0; i < a.length; i++) {
				a[i] = b[a.length - i - 1];
			}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a배열의 크기를 입력하세요: "); int na = scan.nextInt();
		int[] a = new int[na];
		
		System.out.print("b배열의 크기를 입력하세요: "); int nb = scan.nextInt();
		int[] b = new int[nb];
		
		System.out.println("역순으로 복사 전");
		System.out.print("a배열의 요소: ");
		for(int i = 0; i < a.length; i++) { 
			a[i] = rand.nextInt(20);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("b배열의 요소: ");
		for(int i = 0; i < b.length; i++) { 
			b[i] = rand.nextInt(20);
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		rcopy(a, b);
		System.out.println("역순으로 복사 후");
		System.out.print("a배열의 요소: ");
		for(int i = 0; i < a.length; i++) 
			System.out.print(a[i] + " ");
		System.out.println();
		
		System.out.print("b배열의 요소: ");
		for(int i = 0; i < b.length; i++) 
			System.out.print(b[i] + " ");
		System.out.println();
		
	}
}
