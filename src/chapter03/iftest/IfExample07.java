package chapter03.iftest;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String ID = "soldesk";
		int PW = 240910;
		System.out.print("ID : ");
		String id = scan.nextLine();

		if (ID.equals(id)) { // String에서는 equals를 쓴다.
			// 비밀번호
			System.out.print("password : ");
			int pass = scan.nextInt();
			if (PW == pass) {
				System.out.println(ID + "님 환영합니다");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}

		} else {
			System.out.println("일치하는 아이디가 없습니다");
		}

		
	}

}
