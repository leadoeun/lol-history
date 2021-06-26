package org.study.lolhistory;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Iterator<String> it = list.iterator();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Name");
        map.get(1);
        Collection<String> col=map.values();
        Iterator<String> ite=col.iterator();
    }
}
