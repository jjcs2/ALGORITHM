package sbs.problems;

import java.util.Scanner;

public class Step01 {

	public static void main(String[] args) {
		
		//깃허브 연동 테스트
		System.out.println("깃허브 연동 test");
		
		//////////01. 입출력과 사칙연산//////////
		
		//2557. Hello World! 출력
		System.out.println("Hello World!");
		
		
		//10718. 강한친구 대한육군 출력
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		int i;
        for(i=0; i<2; i++){
            System.out.println("강한친구 대한육군");
        }
		
        
        //10171. 고양이 출력 __ \출력할때 \\ 주의
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
        
        
        //10172. 개 출력 __ " 출력할 때 \"
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
        
        
        //1000. 입력받은 a+b
        //import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //sc.close();
        
        System.out.println(a+b);
		   
        //1001. 입력받은 a-b
        System.out.println(a-b);
              
        //10998. 입력받은 axb 
        System.out.println(a*b);
                
        //1008. 입력받은 a/b
        System.out.println(a/b);
                
        //10869. a+b a-b axb a/b a%b
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        
        //10430. 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        int c = sc.nextInt();
        //sc.close();
        
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
        
        
        //2588. 곱셈 (상세문제 검색)
        /*ex 123 * 456 일때
         *   123 * (6)값 --> 456%10 --> 10으로 나누어 일의자리 6 나머지를 얻어냄
         *   123 * (5)값 --> 456%100/10 --> 100으로 나누어 나머지 56 --> 56/10 = (십의자리) 5
         *   123 * (4)값 --> 456/100 --> 100으로 나누어 (백의자리) 4
         */
  
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        sc.close();
        
        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
        
        
        
	}
	
	
}
