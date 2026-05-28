class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomNote_length = ransomNote.length();
        int count = 0;
            if(ransomNote.indexOf(c) == count){
                count++;
                if(count == ransomNote_length){
                    return true;
                }
            }
            else{
              count = 0;  
            }
        return false;
    }
}