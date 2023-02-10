package com.strings;

public class StringToInteger {
 
	    public int myAtoi(String s) {
	        
	        

	        int length = s.length();
	        int index = 0;
	        if(length == 0){
	            return 0;
	        }
	        while(index < length && s.charAt(index) == ' '){
	            index++;
	        }

	        boolean isNegative = false;
	        if(index < length){

	        
	        if(s.charAt(index) == '-'){
	            isNegative = true;
	            index++;
	        }
	        else if(s.charAt(index) == '+'){
	             index++;
	        } 
	        }

	        int result  = 0;
	        while(index < length && isDigit(s.charAt(index))){
	           int digit = s.charAt(index) - '0';
	           if(result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && digit > 7 ){
	               return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	           }

	           result = (result * 10) + digit;
	           index++;
	        }
	      
	      return isNegative? -result : result;
	         
	    }

	    boolean isDigit(char ch){
	            return ch >= '0' && ch <= '9';
	    }
	    
	    public static void main(String[] args) {
	    	StringToInteger s1 = new StringToInteger();
	    	s1.myAtoi("   -34");
		}
	}
	

