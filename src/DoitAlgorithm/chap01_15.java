/* ���� �̵ �ﰢ���� ����ϴ� �κ��� �Ʒ��� ���� ������ �޼���� �ۼ��ϼ���.
 * static void triangleLB(int n) // ���� �Ʒ��� ������ �̵ �ﰢ���� ���
 * static void triangleLU(int n) // ���� ���� ������ �̵ �ﰢ���� ���
 * static void triangleRB(int n) // ������ �Ʒ��� ������ �̵ �ﰢ���� ���
 * static void triangleRU(int n) // ������ ���� ������ �̵ �ﰢ���� ���
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_15 {
	/* ���� �Ʒ��� ������ �̵ �ﰢ��
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */	
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	/* ���� ���� ������ �̵ �ﰢ��
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 */
	static void triangleLU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	/* ������ �Ʒ��� ������ �̵ �ﰢ��
	 *     *
	 *    **
	 *   ***
	 *  ****
	 * *****
	 */
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= (n-i); j++)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	/* ������ ���� ������ �̵ �ﰢ��
	 * *****
	 *  ****
	 *   ***
	 *    **
	 *     *
	 */
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k < i; k++)
				System.out.print(" ");
			for(int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� ��: "); int num = scan.nextInt();
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleLB(num);
		System.out.println();
		
		System.out.println("���� ���� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleLU(num);
		System.out.println();
		
		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleRB(num);
		System.out.println();
		
		System.out.println("������ ���� ������ �̵ �ﰢ���� ����մϴ�.");
		triangleRU(num);
		System.out.println();
	
	}
}
