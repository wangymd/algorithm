package com.algorithm.basic.datastructure.set;

import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] agrs){
        customSort();
    }

     //自定义排序顺序：升序
    public static void customSort(){
        TreeSet<App3> treeSet = new TreeSet<App3>();

        //排序对象：
        App3 app1 = new App3("hello",10);
        App3 app2 = new App3("world",20);
        App3 app3 = new App3("my",15);
        App3 app4 = new App3("name",25);

        //添加到集合：
        treeSet.add(app1);
        treeSet.add(app2);
        treeSet.add(app3);
        treeSet.add(app4);
        System.out.println("TreeSet集合顺序为："+treeSet);
    }
}