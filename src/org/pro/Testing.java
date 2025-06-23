package org.pro;

public class Testing {
	
	public static void main(String[] args) {
		
		
		String s = "Manojkumar@5";
		
		StringBuilder sb = new StringBuilder(s);
		
		StringBuilder rev = sb.reverse();
		
	    System.out.println("Reverse order of String:"+rev);
		
		String s2 = s.replaceAll("[0-5]", "");
		
		System.out.println("Numeric removed:"+s2);
		
		
		
		
		
		
	}
	
	

}
