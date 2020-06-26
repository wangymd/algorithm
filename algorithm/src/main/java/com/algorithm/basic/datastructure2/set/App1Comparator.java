package com.algorithm.basic.datastructure2.set;

import java.util.Comparator;

//自定义App类的比较器：
public class App1Comparator implements Comparator<App1> {

    //比较方法：先比较年龄，年龄若相同在比较名字长度；
    public int compare(App1 app1, App1 app2) {
        int num = app1.getAge() - app2.getAge();
        return num == 0 ? app1.getName().length() - app2.getName().length() : num;
    }
}