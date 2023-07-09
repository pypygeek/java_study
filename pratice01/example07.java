/***
 * 문제 7
 * *****
 * ******
 * *******
 * ********
 * *********
 * 위와 같이 출력하세요.
 * 
 ***/

package pratice01;

public class example07 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if(j-i <= 4) {
					System.out.print("["+i+","+j+"]");
					System.out.print("*");
				} else {
					System.out.print("     "); // 공백 5개
				}
			}
			System.out.println();
		}
	} // end main
}
