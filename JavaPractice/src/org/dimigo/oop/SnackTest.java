/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *     _SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 4. 5.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Snack[] snack = {
				
			new Snack("새우깡","농심",1100,2),
			new Snack("콘칲","크라운",1200,1),
			new Snack("허니버터칩","해태",1500,4)
					
		};
		
		int sum=0;
		
		for(int i=0; i<3;i++){
			System.out.println(snack[i]);
			sum+=snack[i].calcPrice();
		}
		
		System.out.println("총 구매 금액:"+String.format("%,d",sum)+"원");
		
		
		
		
//		snack.setName("새우깡");
//		snack.setCompany("농심");
		
//		snack.setPrice(1100);
//		snack.setNumber(2);
//		
//		System.out.println("이름:"+snack.getName());
//		System.out.println("제조사:"+snack.getCompany());
//		System.out.println("가격"+snack.getPrice()+"원");
//		System.out.println("개수:"+snack.getNumber()+"개\n");
//		
//		snack.setName("콘칲");
//		snack.setCompany("크라운");
//		snack.setPrice(1200);
//		snack.setNumber(1);
//
//		System.out.println("이름:"+snack.getName());
//		System.out.println("제조사:"+snack.getCompany());
//		System.out.println("가격"+snack.getPrice()+"원");
//		System.out.println("개수:"+snack.getNumber()+"개\n");
//		
//		
//		
//		snack.setName("허니버터칩");
//		snack.setCompany("해태");
//		snack.setPrice(1500);
//		snack.setNumber(4);
//		
//
//		System.out.println("이름:"+snack.getName());
//		System.out.println("제조사:"+snack.getCompany());
//		System.out.println("가격"+snack.getPrice()+"원");
//		System.out.println("개수:"+snack.getNumber()+"개\n");
		
		
		
		
		
		
		
		
		
		
		

	}

}
