/* seqSearchSen �޼��带 while���� �ƴ϶� for���� ����Ͽ� ���α׷��� �ۼ��ϼ���.
*/

package DoitAlgorithm;

import java.util.Scanner;
//--- �����˻�(���ʹ�) ---//

public class chap03_01 {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		
		for(i = 0; i < n; i++) {
			if(a[i] == key)
				break;
		}
		
		return i == n ? -1 : i;
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
