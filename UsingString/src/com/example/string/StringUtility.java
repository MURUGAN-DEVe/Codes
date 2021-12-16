package com.example.string;

public class StringUtility {
	
	public static String getSubstring(String args) {
		return args.substring(2);
		
		
	}
    public  boolean checkContains(String args) {
    	
    	return args.contains(args);
		
	}
    public static char checkPositionofChar(String args) {
		return args.charAt(0);
		
	}
    public static String jionTwoString(String str1,String str2) {
		return str1.concat(str2);
		
	}
    public static String replaceString(String originalString) {
    	System.out.println(originalString.replace("ll", "h"));
		return originalString.replace("l", "0");	
	}
    public static String Split(String wrd) {
		String[] word= wrd.split(" ");
		for(String i:word) {
			System.out.println(i);
		}
		return null;
    }
    public  String splitReg(String wrd,int val) {
		for(String i:wrd.split(" ", val)) {
			System.out.println(i);
		}
		return null;
    }
    
    public String trim(String trm) {
    	
		return trm.trim();
    	
    }

}


