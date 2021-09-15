package com.hashtable;

public class MyHashMapTest {
	public static void findFrequency() {
		String sentance = "To be or not to be";
		MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
		String[] words = sentance.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHashMap.get(word);
			if(value == null) value = 1;
			else value = value + 1;
			myHashMap.add(word,value);
		}
		int f = myHashMap.get("be");
		System.out.println(myHashMap);
		System.out.println("Frequency of be is "+f);

	}
	
	public static void main(String[] args) {
		findFrequency();
		
	}

}
