/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 *org.dimigo.interfaces
 *     _IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 5. 25.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public interface IDBManager {

	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	public static IDBManager getDBObject(String database){
		
		if(database.equals(ORACLE_DATABASE)){
			return new OracleDB ();
		}
		else if(database.equals(SYBASE_DATABASE)){
			return new SybaseDB();
		}
		return null;
	}
	
}
