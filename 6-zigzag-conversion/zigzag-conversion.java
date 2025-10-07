class Solution {
    public String convert(String s, int numRows) {
       String [] str=new String[numRows];
       for(int i=0;i<str.length;i++){
        str[i]="";
       }
       int j=0;
       while(j<s.length()){
        for(int i=0;i<numRows && j<s.length();i++){
            str[i]+=s.charAt(j++);
        }
        for(int i=numRows-2;i>0&&j<s.length();i--){
            str[i]+=s.charAt(j++);
        }
       
       }
        String res="";
        for(String st:str){
            res+=st;
        }
        return res.toString();
    }
}
