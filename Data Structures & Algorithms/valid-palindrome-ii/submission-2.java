class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

      //  if(s.length() == 1) return true;
        while(l < r){
             if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
                
            }else{
               return isPallindrome(s , l+1 , r) || isPallindrome(s , l , r-1);
            }      
       }
       return  true;
}

public boolean isPallindrome(String s, int l , int r){
    while(l < r){

        if(s.charAt(l) != s.charAt(r)){
                return false;
        }
        l++;
        r--;
    }
    return true;
}

}
