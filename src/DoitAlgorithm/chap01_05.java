/* �߾Ӱ��� ���ϴ� �޼���� ������ ���� �ۼ��� ���� �ֽ��ϴ�. �׷��� �ǽ� 1C-1��
 * med3 �޼��忡 ���� ȿ���� �������µ�, �� ������ �����ϼ���.
 * ->  ó�� if ���� �Ǵ�
����  if ((b >= a && c<= a) || (b <= a && c >= a)
 �� �ָ��մϴ�. 
  ���⼭ b >= a �� b <= a�� �Ǵ��� ������ �Ǵ�
  (���������� ������ �Ǵ�)��, ����Ͽ�  else ���Ŀ���
���� else if ((a > b && c < b) || (b <= a && c > b)
  �� ����˴ϴ�. ��, ó�� if�� �������� �ʴ� ���,
  2��° if������ (���������� ) ���� �Ǵ��� �����ϹǷ�,
  ȿ���� �������ϴ�.
*/

package DoitAlgorithm;

import java.util.Scanner;

public class chap01_05 {

	static int med3(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: "); int a = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: "); int b = scan.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���: "); int c = scan.nextInt();
		System.out.println("�߾Ӱ��� : "+med3(a,b,c)+" �Դϴ�.");
	}

}
