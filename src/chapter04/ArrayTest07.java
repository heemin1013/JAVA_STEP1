package chapter04;

public class ArrayTest07 {

	public static void main(String[] args) {
		
		char[] alpa=new char[26];
		char ch='A';
		/*
		for(int i=0;i<alpa.length;i++) {
			//alpa[i]+=ch+i;
			//alpa[i]=(char)(ch+i);
			alpa[i]=ch;
			ch++;
			System.out.print(ch+i);
			System.out.print("("+alpa[i]+")"+" ");
		}
		*/
		
		for(int i=0;i<alpa.length;i++,ch++) {
			alpa[i]=ch;
			System.out.print("("+alpa[i]+", "+(int)(alpa[i])+")");
		}
	}

}
