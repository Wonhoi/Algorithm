/* �����ʰ� ���� ���ʰ� ���ʿ� ���ϴ� ���� �ִ� ����ǥ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 	 | 1  2  3  4  5  6  7  8  9
 * --+--------------------------
 * 1 | 1  2  3  4  5  6  7  8  9
 * 2 | 2  4  6  8 10 12 14 16 18
 * 3 | 3  6  9 12 15 18 21 24 27
 * ...
 * 9 | 9 18 27 36 45 54 63 72 81
*/

package DoitAlgorithm;

public class chap01_12 {
	public static void main(String[] args) {
		int i, j;
		System.out.println("  |  1  2  3  4  5  6  7  8  9");
		System.out.println("--+---------------------------");
		for(i = 1; i <= 9; i++) {
			System.out.print(i +" |");
			for(j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();		
			
		}
	}
}
