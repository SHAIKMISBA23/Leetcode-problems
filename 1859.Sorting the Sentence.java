class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        String[] b=new String[ a.length];
        for(String x:a)
        b[x.charAt(x.length()-1)-'1'] = x.substring(0, x.length()-1);
        return String.join(" " , b);
    }
}      
