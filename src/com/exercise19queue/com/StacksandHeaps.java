package com.exercise19queue.com;
import java.util.Stack;
public class StacksandHeaps {

	public static void main(String[] args) {
		String cad = "Lorem ipsum dolor sit amet consectetur adipiscing elit nam neque, consequat justo massa hac convallis litora lobortis tempus dignissim, placerat eu natoque sociis mi magnis a bibendum. Accumsan cras blandit torquent aptent porta venenatis dis, sapien volutpat cum senectus quam quisque leo faucibus, nulla tortor conubia nibh aliquam morbi. Massa fusce curae rutrum posuere ante quis consequat, torquent habitasse sociosqu tincidunt ultrices tellus bibendum class, lacus suscipit mollis fringilla nullam malesuada.";
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();	
		
		for(Character c : lettersArray) {
			if(Character.toLowerCase(c)=='a') {
				letters.push(c);
			}
		}
		while(!letters.isEmpty()) {
			System.out.println(letters.pop());
		}
	}

}
