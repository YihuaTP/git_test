package com.kong.java.base;

import java.util.ArrayList;
import java.util.List;

public class demo {

    public static List<Integer> num() {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(num());
    }
}

