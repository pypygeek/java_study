/***
 * 문제 6
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 위와 같이 출력하세요.
 * 
 ***/

package pratice01;

public class example06 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(6 <= i+j && i+j <= 10) {
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
