package jpa.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class demo3 {

	private static List<User> list = new ArrayList<>();


	public static void main(String[] args) {

		User user2 = new User();
		user2.setId(100);
		user2.setName(ReportEnum.CITY_MARKET.getName());
		user2.setMonth(6);
		user2.setReportEnum(ReportEnum.CITY_MARKET);

		User user3 = new User();
		user3.setId(30000);
		user3.setName(ReportEnum.CITY_MARKET.getName());
		user3.setMonth(7);
		user3.setReportEnum(ReportEnum.CITY_MARKET);

		User user4 = new User();
		user4.setId(50000);
		user4.setName(ReportEnum.NEW_HOUSE.getName());
		user4.setMonth(7);
		user4.setReportEnum(ReportEnum.NEW_HOUSE);

		list.add(user2);
		list.add(user3);
		list.add(user4);


		Map<Integer, List<User>> collect = list.stream()
				.filter(c -> c.getReportEnum() != null)
				.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
				.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
				//.collect(Collectors.groupingBy(c -> c.getName()));
				//.collect(Collectors.groupingBy(((Function<User, ReportEnum>) User::getReportEnum).andThen(ReportEnum::ordinal),
				//TreeMap::new, toList()));
				.collect(Collectors.groupingBy(User::getId,
						TreeMap::new, toList()));

		//.collect(Collectors.groupingBy(c -> c.getReportEnum().ordinal()));

		System.out.println(collect);


		Map<Integer, List<User>> AA = list.stream()
				.filter(c -> c.getReportEnum() != null)
				.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
				.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
				//.collect(Collectors.groupingBy(c -> c.getName()));
				//.collect(Collectors.groupingBy(((Function<User, ReportEnum>) User::getReportEnum).andThen(ReportEnum::ordinal),
				//TreeMap::new, toList()));
				.collect(Collectors.groupingBy(User::getId));

		//.collect(Collectors.groupingBy(c -> c.getReportEnum().ordinal()));

		System.out.println(AA);


		Map<String, List<User>> collect1 = list.stream()
				.filter(c -> c.getReportEnum() != null)
				.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
				.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
				//.collect(Collectors.groupingBy(c -> c.getName()));
				//.collect(Collectors.groupingBy(((Function<User, ReportEnum>) User::getReportEnum).andThen(ReportEnum::ordinal),
				//		TreeMap::new, toList()));

				.collect(Collectors.groupingBy(c -> c.getName()));

		System.out.println(collect1);








		//List<User> collect = list.stream()
		//		.filter(c -> c.getReportEnum() != null)
		//		.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
		//		.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
		//		.collect(Collectors.toList());
		//
		//System.out.println(collect);


		//Map<Integer, List<User>> collect = list.stream()
		//		.filter(c -> c.getReportEnum() != null)
		//		.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
		//		.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
		//		//.collect(Collectors.groupingBy(c -> c.getName()));
		//		//.collect(Collectors.groupingBy(User::getName, () -> new TreeMap<>(), toList()));
		//		.collect(Collectors.groupingBy(c -> c.getReportEnum().ordinal()));
		//
		//System.out.println(collect);

		//Map<Integer, List<User>> map = list.stream()
		//		.filter(c -> c.getReportEnum() != null)
		//		.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
		//		.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
		//		//.collect(Collectors.groupingBy(c -> c.getName()));
		//		.collect(Collectors.groupingBy(c -> c.getId()));
		//
		//System.out.println(map);


		//List<User> collect = list.stream()
		//		.sorted((a,b)->b.getMonth().compareTo(a.getMonth()))
		//		.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal())).collect(Collectors.toList());
		//System.out.println(collect);
		//
		//Map<String, List<User>> map = list.stream().sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal())).collect(Collectors.groupingBy(c -> c.getName()));
		//System.out.println(map);

	}
}
