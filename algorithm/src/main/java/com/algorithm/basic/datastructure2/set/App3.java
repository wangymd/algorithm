package com.algorithm.basic.datastructure2.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class App3 implements Comparable<App3> {
	private String name;
	private Integer age;

	// 自定义比较：先比较name的长度，在比较age的大小；
	public int compareTo(App3 app) {
		// 比较name的长度：
		int num = this.name.length() - app.name.length();
		// 如果name长度一样，则比较年龄的大小：
		return num == 0 ? this.age - app.age : num;
	}

	@Override
	public String toString() {
		return "App{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}