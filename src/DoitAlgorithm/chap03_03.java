/* ��ڼ��� n�� �迭 a���� key�� ��ġ�ϴ� ��� ����� �ε�����
 * �迭 idx�� �� �պ��� ������� �����ϰ�, ��ġ�� ��ڼ��� ��ȯ�ϴ� �޼��带 �ۼ��ϼ���.
 * ���� ��� ��ڼ��� 8�� �迭a�� ��Ұ� {1, 9, 2, 9, 4, 6, 7, 9}�̰� key�� 9��
 * �迭 idx�� {1, 3, 7}�� �����ϰ� 3�� ��ȯ�մϴ�.
 * static int searchIdx(int[] a, int n, int key, int[] idx)
*/

package DoitAlgorithm;

import java.util.Scanner;
//--- �����˻�(���ʹ�) ---//

public class chap03_03 {
	//--- a : ��ҹ迭, n : ����� ����, key : ã�°�, idx : key���� ��ġ�ϴ� ��ҵ��� idx�� �����ϴ� �迭 ---//
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		return idx.length;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];
		int[] y = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = scan.nextInt();
		
		int idx = searchIdx(x, num, ky, y);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
