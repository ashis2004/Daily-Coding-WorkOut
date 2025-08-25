class Solution {
    public int minAddToMakeValid(String s) {
       int r=0,l=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            r++;
        }
        else if(r>0){
            r--;
        }
        else{
            l++;
        }
       }
       return r+l;
        
    }
}