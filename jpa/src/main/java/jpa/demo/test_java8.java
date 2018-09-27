package jpa.demo;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class test_java8 {

    public static void main(String[] args) {
        ArrayList<User> list = Lists.newArrayList();

        User user2 = new User();
        user2.setTags(Lists.newArrayList("hello","word"));
        user2.setId(100);
        user2.setName(ReportEnum.CITY_MARKET.getName());
        user2.setMonth(6);
        user2.setReportEnum(ReportEnum.CITY_MARKET);

        User user3 = new User();
        user3.setId(30000);
        user3.setName(ReportEnum.CITY_MARKET.getName());
        user3.setMonth(7);
        user3.setReportEnum(ReportEnum.CITY_MARKET);
        user3.setTags(Lists.newArrayList("hello","shijie"));


        User user4 = new User();
        user4.setId(50000);
        user4.setName(ReportEnum.NEW_HOUSE.getName());
        user4.setMonth(7);
        user4.setReportEnum(ReportEnum.NEW_HOUSE);
        user4.setTags(Lists.newArrayList("hello","java"));

        list.add(user2);
        list.add(user3);
        list.add(user4);

        ArrayList<Object> list1 = Lists.newArrayList();
        list.stream().forEach(c -> {
            String a = null ;
            c.getTags().stream().forEach(d->{
                if (d!=null) {
                    list1.add(d);
                }
            });
        });

        System.out.println(list1);

        List<String> collect2 = list.stream().flatMap(c -> c.getTags().stream()).collect(Collectors
                .toList
                        ());

        System.out.println(collect2);


//        List<R> collect1 = list.stream().flatMap(c -> c.getName()).collect(Collectors.toList());
//        System.out.println(collect1);




    }

}
