package demo;

import org.junit.Test;

import java.util.*;

public class MapTest {

    @Test
    public void hashMap(){
        //创建集合
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("张三",18);
        map.put("李四",16);
        map.put("王五",20);

        //遍历方式1，调用entrySet将map集合数据放入Set集合中
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        //通过迭代器遍历set集合
        Iterator<Map.Entry<String,Integer>> iter = set.iterator();
        while (iter.hasNext()){
            //得到map集合中的每一对key和value
            Map.Entry<String,Integer> en = iter.next();
            String name = en.getKey();
            Integer age = en.getValue();
            System.out.println(name+"------->"+age);
        }

        //遍历方式2,获取map中所有的key值
        Set<String> set02 = map.keySet();
        //遍历所有key值
        Iterator<String> iter02 = set02.iterator();
        while(iter02.hasNext()){
            String key = iter02.next();
            Integer age = map.get(key);
            System.out.println(key+"---------->"+age);
        }

    }


    @Test
    public void treeMap(){
        //创建集合
        Map<String,Integer> map = new TreeMap<String,Integer>();
        map.put("张三",18);
        map.put("李四",16);
        map.put("王五",20);
        Set<String> set = map.keySet();
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            String key = iter.next();
            Integer value = map.get(key);
            System.out.println(key+"---------->"+value);
        }

    }

}
