package com.strings;

public class LongestPalindromicSubstring {

	
	public static String longestPalindrome(String s) {
      int max = Integer.MIN_VALUE;
      String ans = "";
      for(int i=0;i<s.length();i++){
          for(int j = i;j < s.length();j++){
              String subStr = s.substring(i,j+1);
              String revStr = new StringBuilder(subStr).reverse().toString();
              if(subStr.equals(revStr)){
                 // System.out.println(revStr);
                  if(max < revStr.length()){
                      max = revStr.length();
                      ans = subStr;
                  }
              }
          }
      }
      return ans;
  }
	
	public static void main(String[] args) {
	    System.out.println(	longestPalindrome("babad"));
	}
}
