package jpa.demo_hutool;

import cn.hutool.core.util.RandomUtil;

import java.util.concurrent.ThreadLocalRandom;

public class Demo1 {

    public static void main(String[] args) {
        ThreadLocalRandom random = RandomUtil.getRandom();
        System.out.println(random.nextInt());
//        System.out.println();
    }

}
