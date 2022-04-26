/* 선형 검색의 스캐닝 과정을 상세하게 출력하는 프로그램을 작성하세요.
 * 이때 각 행의 맨 왼쪽에 현재 검색하는 요소의 인덱스를 출력하고,
 * 현재 검색하고 있는 요소 위에 별표 기호 *를 출력하세요.
*/

package DoitAlgorithm;

import java.util.Scanner;
//--- 선형검색(보초법) ---//

public class chap03_02 {
	//---a : 요소배열, n : 요소의 갯수, key : 찾는값 ---//
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
