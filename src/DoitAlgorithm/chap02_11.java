/* 서기 년월일을 필드로 갖는 클래스를 만드세요.
 * 다음과 같이 생성자(constructor)와 메서드를 정의해야합니다.
 * 생성자(주어진 날짜로 설정)
 * YMD(int y, int m, int d)
 * n일 뒤의 날짜를 반환
 * YMD after(int n)
 * n일 앞의 날짜를 반환
 * YMD before(int n)
*/

package DoitAlgorithm;

import java.util.Scanner;

class YMD {
	int y;		//년
	int m;		//월(1~12)
	int d;		//일(1~31)
	
	//---생성자---//
	YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	//---각 월의 일수 ---//
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		//평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		//윤년
	};
	
	//---윤년인지 검사하는 메서드---//
	static int isLeap(int y) {
		return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 1 : 0;
	}
	
	
	//---n일 후의 날짜를 반환---//
	YMD after(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		if(n < 0)
			return before(-n);
		
		temp.d += n;
		
		while(temp.d > mdays[isLeap(y)][temp.m -1]) {
			temp.d -= mdays[isLeap(y)][temp.m -1];
			if(++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}			
		}
		return temp;
	}
	
	//---n일 전의 날짜를 반환---//
	YMD before(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		if(n < 0)
			return after(-n);
		
		temp.d -= n;
		while(temp.d < 1) {
			if(--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(y)][temp.m -1];
		}
		return temp;
	}
}

public class chap02_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요.");
		System.out.print("년 : "); int y = scan.nextInt();
		System.out.print("월 : "); int m = scan.nextInt();
		System.out.print("일 : "); int d = scan.nextInt();
		YMD date = new YMD(y, m, d);
		
		System.out.print("며칠 전/후의 날짜를 구할까요? : ");
		int n = scan.nextInt();
		
		YMD d2 = date.before(n);
		System.out.printf("%d일 전의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
		
		YMD d1 = date.after(n);
		System.out.printf("%d일 후의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);
	}
}
