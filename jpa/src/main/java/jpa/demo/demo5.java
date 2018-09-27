package jpa.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class demo5 {

	private static List<User> list = new ArrayList<>();


	public static void main(String[] args) {
		HashMap map = new HashMap<Integer,String>();
		map.put(50000,"50000");
		map.put(100,"100");
		map.put(30000,"30000");

		System.out.println(map);



		//HashMap map2 = new HashMap<Integer,String>();
		////map2.put(0,"0");
		////map2.put(1,"1");
		////map2.put(2,"2");
		////map2.put(3,"3");
		////map2.put(4,"4");
		////map2.put(5,"5");
		//
		//for (Integer i = 100; i < 150; i++) {
		//	Integer a = i ;
		//	map2.put(a,""+i);
		//}
		//
		//
		//System.out.println(map2);

	}
}
