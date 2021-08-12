//剑指 Offer 50. 第一个只出现一次的字符
//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
class Solution {
    public char firstUniqChar(String s) {
       for (int i = 0; i < s.length(); i++) {
           char ch=s.charAt(i);
           
           //首次出现的位置是当前位置，且后面没有再出现这个字符
            if(s.indexOf(ch)==i&&s.indexOf(ch,i+1)==-1)
                return s.charAt(i);
        }
        return ' ';
    }
}