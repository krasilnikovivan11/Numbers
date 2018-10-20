package ru.krasilnikovivan11;

import java.util.HashMap;

public class Numbers {
private HashMap<String,String> numbers;
public Numbers() {
	numbers = new HashMap<String,String>();
}
public void add(String number,String name ) {
	numbers.put(number, name);
}
public void get(String name) {
	StringBuilder sb = new StringBuilder();
	if(numbers.containsValue(name)) {
		for(String str : numbers.keySet()) {
			if(name.equals(numbers.get(str))) {
				sb.append(str + " ");
			}
		}
		System.out.print(sb.toString());
	}
	else System.out.print("The member doesnt exist");
}
}
