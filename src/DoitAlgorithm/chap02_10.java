/* 시력 분포를 그래프로 출력하도록 바꾸어 프로그램을 작성하세요.
 * 기호 문자 *를 사람 수만큼 반복하여 나타내세요.
*/

package DoitAlgorithm;

public class chap02_10 {
	
	//--- 시력 분포(0.0에서 0.1 단위로 21개)
	static final int VMAX = 21;

	static class PhyscData {
		String name;		//이름
		int height;			//키
		double vision;			//시력
		
		
		//--- 생성자 ---//
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	//--- 키의 평균을 구하는 메서드---//
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i = 0; i < dat.length; i++)
			sum += dat[i].height;
		
		return sum / dat.length;
	}
	
	//--- 시력 분포를 구하는 메서드---//
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		
		dist[i] = 0;
		for(i = 0; i < dat.length; i++)
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
	}
	
	public static void main(String[] args) {
		
		PhyscData[] x = {
			new PhyscData("박현규", 162, 2.0),
			new PhyscData("함진아", 173, 2.0),
			new PhyscData("최윤미", 175, 2.0),
			new PhyscData("홍연의", 171, 1.5),
			new PhyscData("이수진", 168, 0.4),
			new PhyscData("김영준", 174, 1.2),
			new PhyscData("박용규", 169, 0.8),
		};
		
		int[] vdist = new int[VMAX];
		
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름      키  시력");
		System.out.println("-----------------");
		for(int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n",
								x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for(int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f ~ : ", i / 10.0);
			for(int j = 0; j < vdist[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
