package com.mphasis.gs;

import java.util.ArrayList;

public class MisingCharacterPangram {

	final static int MAX_CHAR_LENGTH = 26;

	public static ArrayList<Character> missingCharacter(String str) {

		
		boolean[] isAvail = new boolean[MAX_CHAR_LENGTH];
		ArrayList<Character> charsList = new ArrayList<>();
		if(str==null) {
			for (int i = 0; i < MAX_CHAR_LENGTH; i++) {
				if (isAvail[i] == false)
					charsList.add((char) (i + 'a'));
			}
			return charsList;
		}
		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				isAvail[str.charAt(i) - 'A'] = true;
			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				isAvail[str.charAt(i) - 'a'] = true;
		}

		for (int i = 0; i < MAX_CHAR_LENGTH; i++) {
			if (isAvail[i] == false)
				charsList.add((char) (i + 'a'));
		}
		
		return charsList;

	}

	public static void main(String[] Str) {

		String str = "abcdefghijklmnopqrstuvwxyz";
		ArrayList<Character> missingCharaters =  missingCharacter(str);
		if (missingCharaters.size() >= 1)
	    {
	        for(Character character : missingCharaters)
	        {
	            System.out.print(character);
	        }
	    }
		
	}
}



//abdhijnpquvxyz