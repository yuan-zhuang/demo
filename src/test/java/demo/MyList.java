package demo;

import org.junit.Test;

import java.util.*;

public class MyList {

    @Test
    public void list(){
        //创建ArrayList
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add(1,"ddd");
        list.set(2,"fff");

        //判断集合中元素是否存在
        if(list.contains("eee")){
            System.out.println("数据存在!");
        }

        for(int i=0;i<list.size();i++){
            String str = list.get(i);
            System.out.println(str);
        }

    }

    @Test
    public void link(){
        //创建linkedList
        List<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        link.add("d");

        for(String li: link){
            System.out.println(li);
        }
    }

    @Test
    public void set(){
        //创建集合
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        //创建迭代器
        Iterator<String> iter = set.iterator();
        //对集合元素进行迭代，如果还有元素可以迭代，则返回true
        while(iter.hasNext()){
            //next()返回迭代的下一个元素。
            String str = iter.next();
            System.out.println(str);
        }
        //方式2foreach输出
        for(String str: set){
            System.out.println(str);
        }
    }

    @Test
    public void treeSet(){
        //创建集合
        Set<Integer> set = new TreeSet<Integer>();
        for(int i = 0;i<10;i++){
            set.add(i);
        }
        //通过迭代器查询集合元素
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            int a = iter.next();
            System.out.println(a);
        }
        //通过foreach查询集合元素
        for(Integer in: set){
            System.out.println(in);
        }
    }

    @Test
    public void queue(){
        //创建集合
        Queue<String> queue = new LinkedList<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while (queue.size()>0){
            String str = queue.poll();
            System.out.println(str);
        }

    }
}
