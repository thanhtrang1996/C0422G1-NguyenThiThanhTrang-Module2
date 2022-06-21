package ss10_stack_queue.bai_tap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountNumberTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string :");
        String str = scanner.nextLine();
        Map<String,Integer> treeMap = new java.util.TreeMap<>();
         str = str.trim().toLowerCase();
        String []str1 = str.split(" ");
        for (String s : str1) {
            if (!s.equals("")) {
                if (treeMap.containsKey(s)) {
                    treeMap.put(s, treeMap.get(s) + 1);
                }else {
                    treeMap.put(s, 1);
                }
            }
        }
        Set<String> keySet = treeMap.keySet();
        for (String key:keySet) {
            System.out.println(key + "  : xuat hien   " + treeMap.get(key) + " lan");

        }
    }
}
