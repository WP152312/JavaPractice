/**
 * 
 */
package org.dimigo.basic;

import java.util.Scanner;
import java.util.Random;

/**
 * <pre>
 *org.dimigo.basic
 *     _Loop
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 3. 15.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		int choice;
		int num=100;
		int i=10;
		String []rand={"마법사","영주","기사","농민"};
		
		
		do{
			System.out.println("<<게임 메뉴>>");
			System.out.println("1.공격력 증가");
			System.out.println("2.공격력 감소");
			System.out.println("3.캐릭터 설정");
			System.out.println("9.종료");
			System.out.println("------------");
			System.out.printf("메뉴 입력 =>");
			
			choice = scanner.nextInt();
		
		switch(choice){
		
		case 1:
			num=num+i;
			System.out.printf("공겨력이 증가되었습니다. 현재 공격력 :%d\n",num);
			break;
		case 2:
			num=num-i;
			System.out.printf("공격력이 감소되었습니다. 현재 공격력 %d\n",num);
			break;
		case 3:
			int Rand = new Random().nextInt(4);
			System.out.println(rand[Rand]+"(으)로 설정되었습니다.");
			break;
		case 9:
			System.out.println("이제 공부하세요!");
			break;
		default :
			System.out.println("없던 메뉴입니다!!");
		
		}
		}
		while(choice!=9);
		scanner.close();

	}

}
