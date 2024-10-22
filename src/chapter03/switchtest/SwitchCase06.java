package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {
		
		int time=(int)(Math.random()*10)+9;
		System.out.println("[현재시간: "+time+ "시]");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9:
			System.out.println("아침먹기 시간~");
			break;
		case 10: case 11: case 12:
			System.out.println("컴퓨터 게임하기!~~~");
			break;
		case 13: case 14:
			System.out.println("점심시간~~~");
			break;
		case 15: case 16: 
			System.out.println("친구들 만나서 놀기");
			break;
		case 18:
			System.out.println("저녁먹기!~~~");
			break;

		default:
			System.out.println("멍때리기!~~~~~");
			break;
		}

	}

}
