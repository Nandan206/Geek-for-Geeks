class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return reverse;
    }
}