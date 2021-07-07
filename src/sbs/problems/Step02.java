package sbs.problems;

import java.util.Scanner;

public class Step02 {

	public static void main(String[] args) {
		//2단계 if문
		
		//1330. 두 수 비교하기
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        //sc.close();
        
        if(a>b){
            System.out.println(">");
        } else if(a<b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
		
		
        //9498. 시험성적 
        //Scanner sc = new Scanner(System.in);
        int sco = sc.nextInt();
        //sc.close();
        
        if(sco >= 90){
            System.out.println("A");
        } else if(sco >= 80){
            System.out.println("B");
        } else if(sco >= 70){
            System.out.println("C");
        } else if(sco >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        
        //2753. 윤년
        //Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        
        if(year%4 == 0){
            if(year%400 == 0){
                System.out.println("1");
            } else if(year%100 == 0){
                System.out.println("0");
            } else {
                System.out.println("1");
            }  
        } else {
            System.out.println("0");
        }
		
        if(year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
        	System.out.println("1");
        } else {
        	System.out.println("0");
        }
		

	}

}
