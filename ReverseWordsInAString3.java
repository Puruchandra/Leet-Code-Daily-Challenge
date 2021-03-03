Link -- https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        
        String[] array = s.split(" ");
        String newStr = "";
        
        for(String token : array){
            
           newStr += reverseTheToken(token);
           newStr += " ";
            
        }
        
        return newStr.trim();
    }
    
    public static String reverseTheToken(String s){
   
        String rev="";  
        for(int i=s.length();i>0; --i){  
            rev=rev+(s.charAt(i-1));   
        }  
        return rev;  
    }
    
}
