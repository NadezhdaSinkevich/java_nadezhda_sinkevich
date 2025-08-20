package by.academy.java.lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main (String[] args){
        Map<String,String> map = new HashMap<String,String>();//дженерики

        map.put("key1", "values1");
        map.put("key2", "values2");
        map.put("key3", "values3");
        System.out.println(map);
        Map<String,String> map2 = new HashMap<String,String>();
        map2.put("key4", "values4");
        map2.put("key5", "values5");
        map2.put("key6", "values6");
        System.out.println(map2);
        map.putAll(map2);
        map.remove("key5");
        System.out.println("размер набора данных" + map.size());
        String exists = (map.containsKey("key2"))? "найден":"не найден";
        System.out.println("объект с ключом 'key2'"+exists);
        exists = (map.containsValue("value2")) ? "найден":"не найден";
        System.out.println("Объект со значением 'value2'"+exists);
        Set<Map.Entry<String,String>> set;
        set = map.entrySet();
        for (Map.Entry<String,String> me : set){
            System.out.println("ключ:"+me.getKey()+",значение="+me.getValue());
        }
        map.clear();
    }
}
