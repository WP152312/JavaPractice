/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 *org.dimigo.oop
 *     _Question
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 3. 31.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class Question {

	
	public static void main(String[] args) {
		
		String[] answer = {"김소혜","박보영","체육"};
		String[] question = {"가장 좋아하는 가수는?","가장 좋아하는 배우는?","가장 좋아하는 과목은?"};
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i=0;i<3;i++){
			
			
				System.out.println(question[i]);
				String answer1 = scanner.nextLine();
				if(answer[i].equals(answer1)){
					System.out.println("정답입니다!");
				}
				else
					System.out.println("틀렸습니다!");
			
		}
				
		
		System.out.println("<<결과출력>>");
		for(int i=0; i<3; i++){
			StringBuilder sb = new StringBuilder("가장 좋아하는 ");
			sb.append(question[i] + " ").append(answer[i]).append("입니다.");
			
		System.out.println(sb);
		}
	}
}


				
			
		
		

	


