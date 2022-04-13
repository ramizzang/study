package com.tech.two2.methodtest;

public class MethodTest3 {
//	void : return 값이 없다 (반환받는 값이 없다)

	// sum을 만들기 위한 함수 makeSum
	// makeSum(타입명 변수, 타입명 변수)-> 호출시 대입할 값 넣으면 식에 대입하여 계산해줌

	public void makeSum(int start, int end) { //파라미터값을 입력 받아 계산

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	} // makeSum end

	public static void main(String[] args) {

		MethodTest3 m2 = new MethodTest3(); // 객체생성
		m2.makeSum(1, 100);// makesum 함수 호출
		m2.makeSum(2, 50);
		m2.makeSum(5, 20);
		m2.makeSum(1, 80);

	} // main end

} // class end
