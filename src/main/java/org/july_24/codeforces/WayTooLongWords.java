package org.july_24.codeforces;

public class WayTooLongWords {

    public static String wayToLongWords(String s){
        int len = s.length();
        if(len > 10){
            String re = s.charAt(0)+""+(len-2)+""+s.charAt(len-1);
            return new String(re);
        }else{
            return s;
        }
    }
}
