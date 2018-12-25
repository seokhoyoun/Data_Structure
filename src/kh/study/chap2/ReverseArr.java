package kh.study.chap2;

public class ReverseArr {

	public static void main(String[] args) {
		int[] iar = {5,10,73,2,-5,42};
		for(int i = 0; i < iar.length/2; i++) {
			int tmp = iar[i];
			iar[i] = iar[iar.length-1-i];
			iar[iar.length-1-i] = tmp;
			System.out.println("a["+i+"]과(와) a["+(iar.length-1-i)+"] 위치 변경");
			for(int j = 0; j < iar.length; j++) {
				System.out.print(iar[j]+"  ");
			}System.out.println();
		}
		
	}

}
