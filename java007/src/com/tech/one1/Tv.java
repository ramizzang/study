package com.tech.one1;

public class Tv {
	
	//�ʵ念��(�ڵ��ʱ�ȭ)
	int channel;
	int volume;
	boolean power;
	
	public static void main(String[] args) {
		
		//���������� �����ʱ�ȭ ���ش�.
		int num=0;
		boolean bool;
		
		//��ü�� ���� : Ŭ������ ���������� = new Ŭ������();
		Tv t=new Tv();
		
		System.out.println(t.channel);
		System.out.println(t.volume);
		System.out.println(t.power);
		
		//�ʵ尪 ����(��ü�� ���: ���������� ���� ���/ t.)
		//��ü�� ���
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
