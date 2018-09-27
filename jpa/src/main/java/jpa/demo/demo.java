package jpa.demo;

import org.aspectj.lang.annotation.Before;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class demo {

	private static List<User> list = new ArrayList<>() ;


	public static void main(String[] args) {
		User user = new User();
		user.setName("ltc");
		user.setMonth(6);

		//User user2 = new User();
		//user2.setName("ltc");
		//user2.setMonth(7);


		User user3 = new User();
		user3.setName("zy");
		user3.setMonth(6);

		User user4 = new User();
		user4.setName("zy");
		user4.setMonth(7);

		list.add(user);
		//list.add(user2);
		list.add(user3);
		list.add(user4);


		Map<String, List<User>> map = list.stream().sorted((a, b) -> b.getMonth().compareTo(a.getMonth())).collect(Collectors.groupingBy(c -> c.getName()));
		System.out.println(map);

		ArrayList<User> users = new ArrayList<>();

		Set<Integer> months = list.stream().map(c -> c.getMonth()).collect(Collectors.toSet());
		System.out.println(months);
		ArrayList<Integer> integers = new ArrayList<>(months);
		List<Integer> collect = integers.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());

		System.out.println(collect);

		collect.forEach(v->{
			map.entrySet().forEach(c->{
				System.out.println("================"+c);
				User u = c.getValue().stream().filter(o-> o.getMonth().equals(v)).findFirst().orElse(null);
				if (u!=null){
					users.add(u);
				}
			});
		});


		System.out.println(users);

		System.out.println(new ArrayList<>(new HashSet<>()));
	}
}
