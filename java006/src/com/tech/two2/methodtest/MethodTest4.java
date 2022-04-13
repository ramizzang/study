package com.tech.two2.methodtest;

public class MethodTest4 {
	//	void : return 값이 없다,타입이 없다 (반환받는 값이 없다)
	// 함수를 사용하는 이유 : 동일한 코드가 여러번 쓰일 때 호출만 해서 사용할 수 있도록 (코드사용이유리)

	// sum을 만들기 위한 함수 makeSum
	// makeSum(타입명 변수, 타입명 변수)-> 호출시 대입할 값 넣으면 식에 대입하여 계산해줌
	public int makeSum(int start, int end) { // return 값을 받으려면 void 말고 반환받을 타입 적어줌

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	} // makeSum end

	public static void main(String[] args) {

		MethodTest4 m2 = new MethodTest4(); // 객체생성
		int sum = m2.makeSum(1, 100);// return을 여기서 받아서 출력
		int sum2 = m2.makeSum(8, 80);

		System.out.println("sum = " + sum);
		System.out.println("sum2 = " + sum2);

	} // main end

} // class end
