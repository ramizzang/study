package com.tech.mission;

import java.util.Scanner;

public class MissionScoreArray {

   public static void main(String[] args) {

      Scanner s=new Scanner(System.in);

      int [] score= new int[5];

      String[] name= {"�����","���","�ɻ���","��ö��","��濵"};

      int sum=0;

      float avg=0.0f;

      for (int i = 0; i < score.length; i++) {

         System.out.println(name[i]+ "�� ������ �Է��Ͻÿ�");

         score[i]=s.nextInt();

         sum =sum + score[i]; //���� sum�� ���� ���µ� �ٷ� ����ϰ� ������

      }

      int min=score[0];

      int max=score[0];

      for (int i = 0; i < score.length; i++) {

         if (min>score[i])

            min=score[i];

         if (max<score[i])

            max=score[i];

      }

//      avg =sum/score.length;
      avg=(float)sum/score.length; //�Ҽ��� ���� ���ֱ� ���ؼ� ����ȯ~

      System.out.println("sum : "+sum);

      System.out.println("avg : "+avg);

      System.out.println("min : "+min);

      System.out.println("max : "+max);

   }


}