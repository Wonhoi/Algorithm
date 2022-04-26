/* ���� �˻��� ��ĳ�� ������ ���ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �̶� �� ���� �� ���ʿ� ���� �˻��ϴ� ����� �ε����� ����ϰ�,
 * ���� �˻��ϰ� �ִ� ��� ���� ��ǥ ��ȣ *�� ����ϼ���.
*/

package DoitAlgorithm;

import java.util.Scanner;
//--- �����˻�(���ʹ�) ---//

public class chap03_02 {
	//---a : ��ҹ迭, n : ����� ����, key : ã�°� ---//
	static int seqSearchSen(int[] a, int n, int key) {
		
		int len = ((Integer)n).toString().length();
		System.out.printf("   |");
		for(int i = 0; i < n; i++)
			System.out.printf("%4d", i);
		System.out.print("\n---+");
		for(int i = 0; i < 4*n + 2; i++)
			System.out.print("-");
		System.out.println();
				
		for(int j = 0; j < n; j++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (j * 4) + 3), "");
			System.out.printf("%3d|", j);
			for(int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if(a[j] == key)
				return j;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
