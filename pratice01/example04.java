/***
 * 문제 4
 * *     *
 *  *   *
 *    *
 *   *  *
 *  *    *
 * 위와 같이 출력하세요.
 * 
 ***/

package pratice01;

public class example04 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j == 6 || i==j) {
					System.out.print("["+i+","+j+"]");
					System.out.print("*");
				} else {
					System.out.print("     "); // 공백 5개
				}
			}
			System.out.println();
		}
	} // end main
} //end class
