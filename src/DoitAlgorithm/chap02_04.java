/* �迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� copy�� �ۼ��ϼ���.
 * static void copy(int[] a, int[] b)
*/

package DoitAlgorithm;

import java.util.*;

public class chap02_04 {
	static void copy(int[] a, int[] b) {
		if(a.length != b.length)
			System.out.println("�迭�� ũ�Ⱑ ���� �ʽ��ϴ�.");
		else
			for(int i = 0; i < a.length; i++) {
				a[i] = b[i];
			}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a�迭�� ũ�⸦ �Է��ϼ���: "); int na = scan.nextInt();
		int[] a = new int[na];
		
		System.out.print("b�迭�� ũ�⸦ �Է��ϼ���: "); int nb = scan.nextInt();
		int[] b = new int[nb];
		
		System.out.println("���� ��");
		System.out.print("a�迭�� ���: ");
		for(int i = 0; i < a.length; i++) { 
			a[i] = rand.nextInt(20);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("b�迭�� ���: ");
		for(int i = 0; i < b.length; i++) { 
			b[i] = rand.nextInt(20);
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		copy(a, b);
		System.out.println("���� ��");
		System.out.print("a�迭�� ���: ");
		for(int i = 0; i < a.length; i++) { 
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("b�迭�� ���: ");
		for(int i = 0; i < b.length; i++) { 
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
	}
}
