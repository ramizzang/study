package com.tech.one1;

public class ForGuguExample2 {
	public static void main(String[] args) {
		//������ 1�ܾ� ���ι������� ���
		//2*1=2 2*2=4 2*3=6...
		//3*1=3 3*2=6 ......
		for(int i=2;i<10;i++) { //����ó�� �������� �갡 ���� ����!
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d \t",i,j,i*j); // '\t' �� ���� ������
			}
			System.out.println(); //�ٹٲ�
		}
		//���� for���� �ٱ� for���� ���� ������ ���� for���� ���ǽ� ��ŭ ���� ����
		//���� for���� ����� �ٹٲ��� �Ͼ�� ���ִ°�!
		
		
	} // main end

} // class end
