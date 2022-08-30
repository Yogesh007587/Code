class Solution {
    public void reverseString(char[] s) {
        int l=0 , h=s.length-1;
        char k;
        while(l<h){
            k=s[l];
            s[l++]=s[h];
            s[h--]=k;
        }    
    }
}
