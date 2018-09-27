package jpa.demo;

import java.util.*;
import java.util.stream.Collectors;

public class demo2 {

	private static List<User> list = new ArrayList<>();


	public static void main(String[] args) {

		User user2 = new User();
		user2.setName(ReportEnum.CITY_MARKET.getName());
		user2.setMonth(6);
		user2.setReportEnum(ReportEnum.CITY_MARKET);

		User user3 = new User();
		user3.setName(ReportEnum.CITY_MARKET.getName());
		user3.setMonth(7);
		user3.setReportEnum(ReportEnum.CITY_MARKET);

		User user4 = new User();
		user4.setName(ReportEnum.NEW_HOUSE.getName());
		user4.setMonth(7);
		user4.setReportEnum(ReportEnum.NEW_HOUSE);

		list.add(user2);
		list.add(user3);
		list.add(user4);

		List<User> collect = list.stream()
				.filter(c -> c.getReportEnum() != null)
				.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
				.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
				.collect(Collectors.toList());

		System.out.println(collect);


		Map<String, List<User>> map2 = list.stream()
				.filter(c -> c.getReportEnum() != null)
				.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
				.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
				.collect(Collectors.groupingBy(c -> c.getName()));
				//.collect(Collectors.groupingBy(c -> c.getReportEnum().ordinal()));

		System.out.println(map2);

		Map<Integer, List<User>> map = list.stream()
				.filter(c -> c.getReportEnum() != null)
				.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
				.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
				//.collect(Collectors.groupingBy(c -> c.getName()));
				.collect(Collectors.groupingBy(c -> c.getReportEnum().ordinal()));

		System.out.println(map);


		Map<Integer, List<User>> map55 = new ArrayList<User>().stream()
				.filter(c -> c.getReportEnum() != null)
				.sorted((a, b) -> b.getMonth().compareTo(a.getMonth()))
				.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal()))
				//.collect(Collectors.groupingBy(c -> c.getName()));
				.collect(Collectors.groupingBy(c -> c.getReportEnum().ordinal()));
		System.out.println("===================");
		System.out.println(map55);


		//List<User> collect = list.stream()
		//		.sorted((a,b)->b.getMonth().compareTo(a.getMonth()))
		//		.sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal())).collect(Collectors.toList());
		//System.out.println(collect);
		//
		//Map<String, List<User>> map = list.stream().sorted((a, b) -> Integer.valueOf(a.getReportEnum().ordinal()).compareTo(b.getReportEnum().ordinal())).collect(Collectors.groupingBy(c -> c.getName()));
		//System.out.println(map);

	}
}
