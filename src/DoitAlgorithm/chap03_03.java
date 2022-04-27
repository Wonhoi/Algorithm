/* 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를
 * 배열 idx의 맨 앞부터 순서대로 저장하고, 일치한 요솟수를 반환하는 메서드를 작성하세요.
 * 예를 들어 요솟수가 8인 배열a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}이고 key가 9면
 * 배열 idx에 {1, 3, 7}을 저장하고 3을 반환합니다.
 * static int searchIdx(int[] a, int n, int key, int[] idx)
*/

package DoitAlgorithm;

import java.util.Scanner;
//--- 선형검색(보초법) ---//

public class chap03_03 {
	//--- a : 요소배열, n : 요소의 갯수, key : 찾는값, idx : key값과 일치하는 요소들의 idx를 저장하는 배열 ---//
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		return idx.length;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];
		int[] y = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = scan.nextInt();
		
		int idx = searchIdx(x, num, ky, y);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}
