package ex02variable;

public class E01JunsuType {
	/*
	정수자료형
	-byte, short, int, long 타입(형)이 있다.
	-각 자료형의 표현범위는 교안을 참조한다.
	-일반적으로 CPU(중앙처리장치)는 정수형 연산을 가장 빠르게 
	처리하는 특징이 있다. 즉 int에 최적화 되어있다.
	-따라서 정수형 변수를 사용할때에는 대부분 int형을 사용하면된다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int형 변수를 선언 후 초기값을 할당 
		int int1 = 100;
		int int2 = 200;
		//300의 결과가 result1에 할당된다.
		int result1 = int1 + int2;
		System.out.println("int1 + int2 ="+ result1);
		
		/*
		100/200의 결과는 0이 나오게된다. Java에서는 정수와
		정수를 연산하면 정수의 결과가 반환된다. 만약 실수의 결과를
		반환받고 싶다면 형변환(Type casting)을 해야한다.*/
		result1 = int1 / int2;
		System.out.println("int1 / int2 = "+ result1);
		
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2;
		System.out.println("byte1 + byte2 = "+ result2);
		
		
	}
}