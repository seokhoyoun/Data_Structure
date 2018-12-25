package kh.study.chap1;

import java.util.Scanner;

public class StarPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("크기 입력 : ");
//		TriangleLB(sc.nextInt());
//		TriangleLU(sc.nextInt());
//		TriangleRU(sc.nextInt());
//		TriangleRB(sc.nextInt());
//		spira(sc.nextInt());
		npira(sc.nextInt());
	}
	

	static void StarSquare(int count) {		//  입력 받은 숫자 크기만큼 사각형을 만들어 출력
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count; j++) {
				System.out.print("★");
			}System.out.println();
		}
	}
	
	static void TriangleLB(int count) {		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < i+1; j++) {		// 별의 수가 하나씩 늘어나도록 구현
				System.out.print("★");
			}System.out.println();
		}
	}
	
	static void TriangleLU(int count) {
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count-i; j++) {	//	별의 수가 하나씩 줄어들도록 구현 
				System.out.print("★");
			}System.out.println();
		}
	}
	
	static void TriangleRU(int count) {
		for(int i = 0; i < count; i++) {	
			for(int k = 0; k < i; k++) {	// 	공백 문자가 하나씩 늘어나면서 별보다 먼저 출력 
				System.out.print("☆"); // 공백 문자
			}
			
			for(int j = 0; j < count-i; j++) {	//	별의 수가 하나씩 줄어들도록 구현
				System.out.print("★");
			}System.out.println();
		}
	}
	
	static void TriangleRB(int count) {
		for(int i = 0; i < count; i++) {
			for(int k = 0; k < count-(i+1); k++) {	// 공백 문자가 하나씩 줄어들면서 별보다 먼저 출력.
				System.out.print("☆");
			}
			
			for(int j = 0; j < i+1; j++) {	// 별의 수가 하나씩 늘어나도록 구현
				System.out.print("★");
			}System.out.println();
		}
	}
	
	static void spira(int count) {
		for(int i = 0; i < count; i++) {
			for(int k = 0; k < count-(i+1); k++) {
				System.out.print("☆");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("★");
			}
			for(int n = 0; n < count-(i+1); n++) {
				System.out.print("☆");
			}System.out.println();
		}
	}
	
	static void npira(int count) {
		{
			for(int i = 1; i <= count; i++) {
				for(int k = 0; k < count-i; k++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (i-1)*2+1; j++) {
					System.out.print(i);
				}
				for(int n = 0; n < count-i; n++) {
					System.out.print(" ");
				}System.out.println();
			}
		}
	
	}
}
