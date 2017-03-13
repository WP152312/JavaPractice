/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 *org.dimigo.basic
 *     _Operator
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 3. 13.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1700000;
		int i1=3;
		int i2=1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 :" +String.format("%,d",i)+"원");
		System.out.printf("점포 내 직원수 : %d명\n",i1);
		System.out.println("점포 수 :"+String.format("%,d",i2)+"개");
		
		System.out.println("연간 인건비 :" +String.format("%,d",i*12l*i1*i2)+"원");
		
		
		
		

	}

}
