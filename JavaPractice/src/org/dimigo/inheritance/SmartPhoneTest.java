/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *org.dimigo.inheritance
 *     _SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 5. 12.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class SmartPhoneTest {

	
	public static void main(String[] args) {
		
		SmartPhone[] test = {
			new IPhone("iPhone7", "애플", 900000),
			new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		
		for(SmartPhone t : test ){
			System.out.println(t.toString());
			t.turnOn();
			t.pay();
			t.useSpecialFuction(t);
			t.turnOff();
			
			
		}
	}	
			
}
