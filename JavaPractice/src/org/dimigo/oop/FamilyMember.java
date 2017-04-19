/**
 * 
 */
package org.dimigo.oop;

import java.util.jar.Attributes.Name;

/**
 * <pre>
 *org.dimigo.oop
 *     _FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 4. 19.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class FamilyMember {
	
	
	private static int memberCnt = 0;
	private String memberName;
	
	public FamilyMember(String memberName){
			this.memberName = memberName;
			memberCnt++;
	}
	public String getMemberName(){
		return memberName;
	}
	public static void printMemberName(){
		System.out.println("가족 총 인원 수"+":"+ memberCnt+"명");
		
		
	}

}
