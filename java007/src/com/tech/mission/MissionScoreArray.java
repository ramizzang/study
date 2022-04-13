package com.tech.mission;

import java.util.Scanner;

public class MissionScoreArray {

   public static void main(String[] args) {

      Scanner s=new Scanner(System.in);

      int [] score= new int[5];

      String[] name= {"이재명","운석열","심상정","안철수","허경영"};

      int sum=0;

      float avg=0.0f;

      for (int i = 0; i < score.length; i++) {

         System.out.println(name[i]+ "의 점수를 입력하시오");

         score[i]=s.nextInt();

         sum =sum + score[i]; //나는 sum을 따로 뺐는데 바로 계산하게 나왔음

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
      avg=(float)sum/score.length; //소수점 보존 해주기 위해서 형변환~

      System.out.println("sum : "+sum);

      System.out.println("avg : "+avg);

      System.out.println("min : "+min);

      System.out.println("max : "+max);

   }


}