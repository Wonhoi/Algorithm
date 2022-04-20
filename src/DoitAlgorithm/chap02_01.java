/* ��� ���� Ű�� ������ �Է¹޴� ���α׷��� �ۼ��ϼ���.
 * Ű�� �ִ� ���� ���ϴ� �޼��带 �ۼ��ϼ���.
 * static int maxOf(int[] a)
 * 
 * ������
 * Ű�� �ִ��� ���մϴ�.
 * ��� �� : 5
 * Ű ���� �Ʒ��� �����ϴ�.
 * height[0] = 172
 * height[1] = 137
 * height[2] = 168
 * height[3] = 189
 * height[4] = 113
 * �ִ��� 189�Դϴ�.
*/

package DoitAlgorithm;

import java.util.Random;

public class chap02_01 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		int num = rand.nextInt(20);	//0~19
		System.out.println("��� ��: " + num + "��"); 
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			height[i] = rand.nextInt(45) + 150;		//150~194
			System.out.println("height[" + i + "] : " + height[i] + "cm");
		}
		
		System.out.println("�ִ��� " +maxOf(height)+"cm �Դϴ�.");
	}
}
