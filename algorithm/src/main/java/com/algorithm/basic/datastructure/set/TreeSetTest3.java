package com.algorithm.basic.datastructure.set;

import java.util.TreeSet;

public class TreeSetTest3 {
	
    public static void main(String[] agrs){
    	customComparatorSort();
    }

    //自定义比较器：升序
    public static void customComparatorSort(){
        TreeSet<App1> treeSet = new TreeSet<App1>(new App1Comparator());
        
        //排序对象：
        App1 App11 = new App1("hello",10);
        App1 App12 = new App1("world",20);
        App1 App13 = new App1("my",15);
        App1 App14 = new App1("name",25);
        
        //添加到集合：
        treeSet.add(App11);
        treeSet.add(App12);
        treeSet.add(App13);
        treeSet.add(App14);

        System.out.println("TreeSet集合顺序为："+treeSet);
    }
}