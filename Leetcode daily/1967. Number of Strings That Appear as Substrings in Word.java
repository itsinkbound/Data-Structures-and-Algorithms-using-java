// we can simply iterate thru the patterns and use the built in method to verify the existence of the pattern

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pattern : patterns){
            if(word.contains(pattern)){
                count++;
            }
        }
        return count;
    }
}