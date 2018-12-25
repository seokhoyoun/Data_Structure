package kh.study.chap1;

public class Chart99 {

	public static void main(String[] args) {
		for(int i  = 1; i < 10; i++) {
			if(i == 1) {
				for(int p = 0; p < 10; p++) {
					if(p == 0) {
						System.out.print("   |\t");continue;
					}
					System.out.print(i*p+"\t");
				}System.out.println("\n---+-----------------------------------------------------------------------");
			}
			for(int j = 1; j < 10; j++) {
				if(j == 1) {
					System.out.print(i+"  |\t");
				}
				System.out.print(i*j+"\t");
			}System.out.println();
		}
	}

}
