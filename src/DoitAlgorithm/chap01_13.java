/* ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * chap01_12 ����
*/

package DoitAlgorithm;

public class chap01_13 {
	public static void main(String[] args) {
		int i, j;
		System.out.println("  |  1  2  3  4  5  6  7  8  9");
		System.out.println("--+---------------------------");
		for(i = 1; i <= 9; i++) {
			System.out.print(i +" |");
			for(j = 1; j <= 9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();		
			
		}
	}
}
