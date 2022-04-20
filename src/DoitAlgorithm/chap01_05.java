/* 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다. 그러나 실습 1C-1의
 * med3 메서드에 비해 효율이 떨어지는데, 그 이유를 설명하세요.
 * ->  처음 if 문의 판단
　　  if ((b >= a && c<= a) || (b <= a && c >= a)
 에 주목합니다. 
  여기서 b >= a 및 b <= a의 판단을 뒤집은 판단
  (실질적으로 동일한 판단)이, 계속하여  else 이후에서
　　 else if ((a > b && c < b) || (b <= a && c > b)
  로 수행됩니다. 즉, 처음 if가 성립하지 않는 경우,
  2번째 if에서도 (실질적으로 ) 같은 판단을 수행하므로,
  효율이 나빠집니다.
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
		System.out.print("첫번째 숫자를 입력하세요: "); int a = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요: "); int b = scan.nextInt();
		System.out.print("세번째 숫자를 입력하세요: "); int c = scan.nextInt();
		System.out.println("중앙값은 : "+med3(a,b,c)+" 입니다.");
	}

}
