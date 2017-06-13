/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *org.dimigo.collection
 *     _MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 :2017. 6. 13.
 *</pre>
 *
 * @author : ajszl
 * @version : 1.0
 */
public class MelonGenreChart {
	


private static void print(Map<String, List<Music>> map ) {
		
	
	int i=1;
	
	for( String key : map.keySet()){
		System.out.println("["+key+"]");

		for(Music s : map.get(key)){
			System.out.println(i + ". " + s);
			i++;
		}
		i=1;
				
		
	}
}
		
	public static void main(String[] args) {
		
		List<Music> list = new ArrayList<Music>();
		List<Music> list2 = new ArrayList<Music>();
		Map<String, List<Music>> map = new HashMap<>();
		
		System.out.println("--<<멜론 장르별 차트>>--");
		map.put("발라드",list);
		list.add(new Music("팔레트","아이유"));
		map.put("댄스", list2);
		list2.add(new Music("I LUV IT","PSY"));
		list2.add(new Music("맞지?","언니쓰"));
		print(map);
		System.out.println();
		
		System.out.println("--<<댄스 2위 곡 변경>>--");
		list2.set(1, new Music("SIGANL","트와이스"));
		print(map);
		System.out.println();
		
		System.out.println("--<<댄스 1위곡 삭제>>--");
		list2.remove(0);
		print(map);
		
		System.out.println();
		
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
		print(map);

	}

}
