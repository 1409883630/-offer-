//剑指 Offer 15. 二进制中1的个数
//编写一个函数，输入是一个无符号整数（以二进制串的形式），
//返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。
//输入必须是长度为 32 的 二进制串 
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
         int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}
