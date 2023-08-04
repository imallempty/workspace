package edu.kh.variable;

public class Practice {
	
	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); //2
		// int int = int으로 나오기때문에 2.5에서 0.5부분은 없어짐
		
		System.out.println((int)dNum); //2
		
		System.out.println((double)iNum1); //10.0
		System.out.println(iNum2 * dNum); //10.0
		
		System.out.println((int)fNum); //3
		System.out.println((int)(iNum1 / fNum)); //3
		
		System.out.println(iNum1 / fNum); //3
		System.out.println((double)(iNum1 / fNum));
		
		System.out.println((int)ch); //65
		
		System.out.println(iNum1 + ch);//75
		
		System.out.println((char)(iNum1 + ch)); //K

	}

}
