class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[]fr1 = new int[256];
        int[]fr2 = new int[256];

        for(int i =0;i<t.length();i++){
            fr1[s.charAt(i)]++;
            fr2[t.charAt(i)]++;
        }
    
        for(int i = 0; i < 256;i++){
            if(fr1[i] != fr2[i]){
                return false;
            }
        }
        return true;
    }
}