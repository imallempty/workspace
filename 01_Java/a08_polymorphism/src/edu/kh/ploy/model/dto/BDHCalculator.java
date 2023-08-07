package edu.kh.ploy.model.dto;

public class BDHCalculator implements Calculator{

	   @Override
	   public int plus(int a, int b) {
	      return a + b;
	   }

	   @Override
	   public int minus(int a, int b) {
	      return a - b;
	   }

	   @Override
	   public int multi(int a, int b) {
	      return a * b;
	   }

	   @Override
	   public int div(int a, int b) {
	      return a / b;
	   }

	   @Override
	   public int mod(int a, int b) {
	      return a % b;
	   }

	   @Override
	   public double areaOfCircle(double r) {
	      return PI * r * r;
	   }

	   @Override
	   public int pow(int a, int x) {
	      // x가 무조건 양수인 경우
	                        // 재귀 호출
	      return x == 1  ?  a :  a * pow(a, x-1) ;
	   }
}