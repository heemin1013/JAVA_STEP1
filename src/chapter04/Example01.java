package chapter04;

public class Example01 {

	public static void main(String[] args) {

		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		double avg = 0;
		int count = 0;

		int sum[] = new int[3];
		//for문을 이용 -> 각 행을 가져와서 각행의 열을 읽어서 sum에 누적하고(count++) 
		//평균까지 구하여 출력
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum[i]+=array[i][j];
				count++;
			}
			avg=(double)sum[i]/count;
			System.out.println(i+"행 합계: "+sum[i]);
			System.out.println(i+"행 평균: "+avg);
			System.out.println("-------------");
			count=0; //초기화
		}
		

	}

}
