package main.java.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String dictionary[] ={"red","blue","green","yellow","the","i","like","bells","grey"};
		String input = "ilikeredyellowbluebells";
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		char[] ch;
		String first;
		
		
		for (String value : dictionary){
			List<String> temp = new ArrayList<String>();
			ch  = value.toCharArray();
			first = Character.toString(ch[0]) ;
			
			if( !map.containsKey(first)){
				for (String match : dictionary){
					if(match.startsWith(first)){
						temp.add(match);
					}
				}
				map.put(first, temp);
			}
			
		}
		
		for (String s : map.keySet()){
			System.out.println(s + " : " + map.get(s));
		}
		
		char[] inputStringChar = input.toCharArray();
		System.out.print(inputStringChar);
		System.out.println();
		for (char c : inputStringChar){
			//System.out.println("Char is : " + c);
				List check = map.get(Character.toString(c));
				if(null != check){
				//	System.out.println(check);
					for (Object match : check){
						if(input.contains(match.toString()));
							System.out.println("match found: " + match.toString());
						
					}
				}
				
		}
		
	
		
	
	}

}
