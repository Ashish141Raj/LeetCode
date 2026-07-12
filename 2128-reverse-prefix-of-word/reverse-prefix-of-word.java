class Solution {
    public String reversePrefix(String word, char ch) {
       int index = word.indexOf(ch);

       char[]arr = word.toCharArray();

       if(index == -1){
        return word;
       } 

       int s = 0;
       int e = index;

       while(s < e){
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        s++;
        e--;
       }
       return new String(arr);
    }
}