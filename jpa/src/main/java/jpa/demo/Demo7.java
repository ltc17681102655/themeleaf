package jpa.demo;

import java.util.Calendar;

public class Demo7 {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        //设置减1
        instance.set(2018,0,1);
        //取值加1
        System.out.println(instance.get(Calendar.MONTH)+1);
        System.out.println(instance.getTime());
        System.out.println();
    }

}
