import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<String, String>();
            map1.put("a","aaa");
            map1.put("b","bbb");
            map1.put("c","ccc");

        Map<String,String> map2 = new HashMap<String, String>();
            map2.put("b","xyz");
            map2.put("c","ccc");

        Map<String,String> map3 = new HashMap<String, String>();
            map3.put("a","aaa");
            map3.put("c","meh");
            map3.put("d","hi");

        Map<String,String> map4 = new HashMap<String, String>();
            map4.put("a","Hello");
            map4.put("b","World");

        System.out.println(makeTwins(map1).toString());
        System.out.println(makeTwins(map2).toString());
        System.out.println(makeTwins(map3).toString());

        System.out.println(mergeAB(map4).toString());
    }

    static Map<String,String> makeTwins(Map<String,String> map){
        map.remove("c");
        if (map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        return map;
    }

    static Map<String,String> mergeAB(Map<String,String> map){
        if(map.containsKey("a") && map.containsKey("b")){
            String merge = map.get("a").concat(map.get("b"));
            map.put("ab",merge);
        }
        return map;
    }
}
