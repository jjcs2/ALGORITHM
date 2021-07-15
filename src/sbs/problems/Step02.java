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
        //sc.close();
        
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
        
        
        //14681. 사분면 고르기
        //Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        //sc.close();
        
        if(x>0 && y>0){
            System.out.println("1");
        } else if(x<0 && y>0){
            System.out.println("2");
        } else if(x<0 && y<0){
            System.out.println("3");
        } else {
            System.out.println("4");
        }
		
        
        //2884. 알람 시계
        //Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); // 시간
		int M = sc.nextInt(); // 분
		sc.close();
		
		if(M < 45) {
			H--;		
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}

	}

}
