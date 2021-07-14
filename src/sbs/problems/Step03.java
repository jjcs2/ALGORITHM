package sbs.problems;

import java.util.Scanner;

public class Step03 {

	public static void main(String[] args) {

		//3단계 for문

		//2739.구구단
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        int i = 1;
        for(i=1; i<=9; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
	}

}
