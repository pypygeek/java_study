/***
 * 문제 3
 *      *
 *     *
 *    *
 *   *
 *  *
 * 위와 같이 출력하세요.
 * 
 ***/


package pratice01;

public class example03 {

	public static void main(String[] args) {
		for(int i = 1; i <=5; i++) {
			for(int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	} // end main
} // end class
