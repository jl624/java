import java.util.*;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * Collection、Map的使用
 * @Date: 2021/4/4
 * @Time: 16:42
 **/
public class TestMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            StringBuffer ret = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);  //'a'
                String tmp = ret.toString();
                if (!tmp.contains(ch+"")){  //"a"
                    ret.append(ch);
                }
            }
            System.out.println(ret);
        }
    }



    public static void main2(String[] args) {

        //哈希表在打印数据的时候，打印的顺序不一定是存储的顺序
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王老板");
        map.put("及时雨", "宋江");
        System.out.println(map);
        String s = map.getOrDefault("及时雨1","jl");
        System.out.println(s);
        System.out.println(map.containsKey("及时雨"));
        System.out.println(map.containsValue("宋江"));
        System.out.println("================================");
        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry<String,String> entry:set) {
            System.out.println(entry.getKey() + "=>"+ entry.getValue());
        }
    }


    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("bit");
        collection.add("java");
        collection.add("jl");
        collection.add("laozhang");
        collection.add("laojin");
        collection.add("houjian");
        System.out.println(collection);

//        collection.clear();
//        System.out.println(collection);
        System.out.println(collection.isEmpty());
        collection.remove("java");
        System.out.println(collection);
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
