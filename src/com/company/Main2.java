package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println('A');
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int result = list.get(i);
            if (map.containsKey(result)) {
                int num = map.get(result);
                num++;
                map.put(result, num);
            } else {
                map.put(result, 1);
            }
        }
        // 获取长
        int hor = -1;
        int ver = -1;
        int last = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();

            int num = entry.getValue();
            if (num == 2 && hor == -1) {
                hor = key;
                continue;
            }
            if (num == 2 && ver == -1) {
                ver = key;
                continue;
            }
            if (last - 1 == key) {
                if (hor == -1) {
                    hor = key;
                    continue;
                }
                if (ver == -1) {
                    ver = key;
                    continue;
                }
            }
            last = key;

        }
        System.out.println(hor*ver);
    }
}
