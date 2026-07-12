class Solution {
    public void reverseString(char[] s) {
       int n = s.length;
        int st = 0;
        int en = n-1;

        while(st < en){
            char temp = s[st];
            s[st] = s[en];
            s[en] = temp;

            st++;
            en--;
        }
    }
}