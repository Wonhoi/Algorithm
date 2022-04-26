/* 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요.
 * 모범출력
 * 10진수를 기수 변환합니다.
 * 변환하는 음이 아닌 정수: >59
 * 어떤 진수로 변환할까요?(2-36): >2
 * 
 * 2|     59
 *  +--------
*/

package DoitAlgorithm;

import java.util.*;

public class chap02_07 {
	//x : 정수, r : 진수, d : 자릿수
	static int cardConv(int x, int r, char[] d) {
		//---x---//
		int n = ((Integer)x).toString().length();
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		
		/* String 클래스의 format 메소드는 지정된 위치에 대입한 값을 문자열 형식으로 반환하는 메소드입니다.
		 * 형식은 C나 Java의 printf와 동일하게 %d, %s, %f등의 서식을 사용합니다.
		 * 예를 들어, String.format("%3d, %2d", 10, 20)의 경우
		 * 세 칸을 확보하고 오른쪽부터 10을 입력, 두 칸을 확보하고 오른쪽부터 20을 입력하여 10, 20이 될 것입니다.
		 * %%는 format에서 '%'문자를 의미합니다. format에서 '%'라는 문자를 사용하고 싶으면 %% 두번 쓰면 됩니다.
		 * String.format("%%2d, %%%dd, %%d", n)
		 * %%를 전부 치환하면 %2d, %%dd, %d가 됩니다. 여기서 가운데 %d자리에 n(=2)값을 대입합니다.
		 * 그러면 %2d, %2d, %d가 됩니다. 이것을 문자열로 반환합니다.
		 * String.format("%%2d, %%%dd, %%d", n) <<==>> "%2d, %2d, %d" (String 형식이 됨)
		 */
		
		// System.out.printf("%2d | %nd",r, x);
		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do {
			System.out.printf("   +");
			for(int i = 0; i < n+2; i++)
				System.out.print("-");
			System.out.println();
			
			if(x / r !=0)
				System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), r, x / r, x % r);
				//System.out.printf("%d", r + "|    %d … %d",x/r, x%r);
			else
				System.out.printf(String.format("     %%%dd    ... %%d\n", n), x / r, x % r);
				//System.out.printf("              %d … %d",x/r, x%r);
			
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for(int i = 0; i < digits/2; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int no, cd, dno, retry; //no : 정수, cd : 기수, dno : 변환 후의 자릿수, retry : 반복여부
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = scan.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = scan.nextInt();
			} while (cd < 2 || cd > 32);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for(int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
			retry = scan.nextInt();
		} while (retry == 1);
	}
}
