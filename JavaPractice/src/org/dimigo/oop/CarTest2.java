/**
 * 
 */
package org.dimigo.oop;

import java.awt.print.Book;

/**
 * <pre>
 *org.dimigo.oop
 *     _CarTest
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 3. 23.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car2 car2= new Car2();
		
//		car.setCompany("현대자동차");
//		car.setModel("제네시스");
//		car.setColor("검정색");
//		car.setMaxSpeed(225);
//		car.setPrice(50000000);
		
		car2 = new Car2("현대자동차","제네시스","검정색",225,50000000);
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 :"+ car2.getCompany());
		System.out.println("모델명 :"+ car2.getModel());
		System.out.println("색상:"+ car2.getColor());
		System.out.println("최대속도:"+car2.getMaxSpeed()+"km");
		System.out.printf("가격:"+String.format("%,d",car2.getPrice())+"원\n\n");
		
car2 = new Car2("기아자동차","K7","흰색",224,40000000);
		
		
		System.out.println("제조사명 :"+ car2.getCompany());
		System.out.println("모델명 :"+ car2.getModel());
		System.out.println("색상:"+ car2.getColor());
		System.out.println("최대속도:"+car2.getMaxSpeed()+"km");
		System.out.printf("가격:"+String.format("%,d",car2.getPrice())+"원\n\n");
		
car2 = new Car2("삼성자동차","SM7","회색",200,38000000);
		
		
		System.out.println("제조사명 :"+ car2.getCompany());
		System.out.println("모델명 :"+ car2.getModel());
		System.out.println("색상:"+ car2.getColor());
		System.out.println("최대속도:"+car2.getMaxSpeed()+"km");
		System.out.printf("가격:"+String.format("%,d",car2.getPrice())+"원\n\n");
		
//		car.setCompany("기아자동차");
//		car.setModel("K7");
//		car.setColor("흰색");
//		car.setMaxSpeed(264);
//		car.setPrice(40000000);
		
	
		
		
//		car.setCompany("삼성자동차");
//		car.setModel("SM7");
//		car.setColor("회색");
//		car.setMaxSpeed(200);
//		
//		car.setPrice(38000000);
		
		
		

	}

}
