package chapter05;

import java.util.Scanner;

public class Method {
	//메서드의 오버로딩
	public void makeBread() {
		System.out.println("빵을 만듭니다.");
	}
	
	void makeBread(int cnt) {
		for(int i=1;i<=cnt;i++) {
			System.out.println("빵"+i+"개");
		}
		System.out.println("빵"+cnt+"개가 완성 되었습니다");
	}
	void makeBread(int cnt, String str) {
		for(int j=1;j<=cnt;j++) {
			System.out.println(str+"빵 "+j+"개");
		}
		System.out.println("요청하신"+cnt+"개의 "+str+"빵이 완성 되었습니다");
	}
	
	//-----------------------------
	void order() {
		
		boolean run=true;
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>> ");
			
			int input_num=Integer.parseInt(scan.nextLine());
			
			switch (input_num) {
			case 1:
				System.out.print("빵 개수를 입력: ");
				int cnt1=Integer.parseInt(scan.nextLine());
				makeBread(cnt1);
				break;
			case 2:
				System.out.println("빵 개수와 종류 선택을 선택하셨습니다");
				System.out.print("빵 개수 : ");
				int cnt2=Integer.parseInt(scan.nextLine());
				System.out.print("빵 종류 : ");
				String str=scan.nextLine();
				makeBread(cnt2, str);
				break;
			case 3:
				System.out.println("프로그램 종료");
				run=false;
				break;
			default:
				System.out.println("숫자를 다시 입력해주세요");
				break;
			}
			
		}
	}
}
