package ss11_map.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTreeMapLinkedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Lewis",20);
        hashMap.put("Cook",31);
        System.out.print("Display entries in hashmap:");
        System.out.println(hashMap );
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.print("Display entries in treemap :");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("LinkedHashMap :" + linkedHashMap);
        System.out.println("Lewis is " + linkedHashMap.get("Lewis"));
    }
}
