package chapter03.whiletest;

public class WhileTest07 {

	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		
		do {
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println("1부터 10까지의 합 : "+sum);

	}

}
