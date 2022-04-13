package com.tech.one1;

public class Tv {
	
	//필드영역(자동초기화)
	int channel;
	int volume;
	boolean power;
	
	public static void main(String[] args) {
		
		//지역변수는 수동초기화 해준다.
		int num=0;
		boolean bool;
		
		//객체의 생성 : 클래스명 참조변수명 = new 클래스명();
		Tv t=new Tv();
		
		System.out.println(t.channel);
		System.out.println(t.volume);
		System.out.println(t.power);
		
		//필드값 변경(객체의 사용: 참조변수를 통해 사용/ t.)
		//객체의 사용
		t.channel=7;
		t.volume=5;
		t.power=true;
				
		System.out.println("tv channel : "+t.channel);
		System.out.println("tv volume : "+t.volume);
		if(t.power) {
			System.out.println("tv power on");
		}else {
			System.out.println("tv power off");
		}
		
	} // main end
	
	
}
