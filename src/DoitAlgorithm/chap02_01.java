/* 사람 수와 키를 난수로 입력받는 프로그램을 작성하세요.
 * 키의 최대 값을 구하는 메서드를 작성하세요.
 * static int maxOf(int[] a)
 * 
 * 모범출력
 * 키의 최댓값을 구합니다.
 * 사람 수 : 5
 * 키 값은 아래와 같습니다.
 * height[0] = 172
 * height[1] = 137
 * height[2] = 168
 * height[3] = 189
 * height[4] = 113
 * 최댓값은 189입니다.
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
		
		System.out.println("키의 최댓값을 구합니다.");
		int num = rand.nextInt(20);	//0~19
		System.out.println("사람 수: " + num + "명"); 
		System.out.println("키 값은 아래와 같습니다.");
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			height[i] = rand.nextInt(45) + 150;		//150~194
			System.out.println("height[" + i + "] : " + height[i] + "cm");
		}
		
		System.out.println("최댓값은 " +maxOf(height)+"cm 입니다.");
	}
}
