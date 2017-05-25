/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 *org.dimigo.interfaces
 *     _DBTest
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 5. 25.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class DBTest {

	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
	
	public static void main(String[] args) {
		System.out.println("<변경 전 >");
		IDBManager a = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(a);
		System.out.println();
		System.out.println("<변경 후 >");

		IDBManager b  = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(b);

	}

}
