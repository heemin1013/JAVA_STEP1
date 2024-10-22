package chapter03.fortest;

public class ForTest02 {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		System.out.println("===1부터 100까지의 합을 출력===");
		
		for(i=1;i<=100;i++) {
			sum+=i;
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("1부터 100까지의 합은 : "+sum+"입니다");
	}

}
