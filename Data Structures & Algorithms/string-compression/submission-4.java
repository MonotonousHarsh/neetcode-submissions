class Solution {
    public int compress(char[] chars) {
        int scan = 0;
        int write = 0;

        if(chars.length == 1){
            return 1;
        }

        while(scan + 1 < chars.length){
            int count = 1;
            while(scan + 1 < chars.length && chars[scan] == chars[scan + 1]){
                scan++;
                count++;
            }
            chars[write] = chars[scan];
            write++;
            if(count != 1){
            // Convert the count integer into a string (e.g., 11 becomes "11")
            String countStr = String.valueOf(count);
            

            // Loop through each character of the string and add it to the list
            for (char c : countStr.toCharArray()) {
            chars[write] = c;
            write++;
            }

            }          

                    scan++;
                    

        }
        if(scan < chars.length){
            chars[write] =chars[scan];
            write++;
        }
        
            
         return write ;
    }

   
}