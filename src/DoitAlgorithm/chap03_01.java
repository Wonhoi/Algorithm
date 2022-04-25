/* seqSearchSen 메서드를 while문이 아니라 for문을 사용하여 프로그램을 작성하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;
//--- 선형검색(보초법) ---//

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
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}
