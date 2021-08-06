//剑指 Offer 17. 打印从1到最大的n位数
//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
//比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
class Solution {
    public int[] printNumbers(int n) {
        //定义一个string字符串s存放最大数
        String s = "";
        for (int i = 1; i <= n; i++) {
            s+=9;
        }
        //将字符串s转为int类型
        int i1 = Integer.parseInt(s);
        //创建长度为i1的int数组并通过for循环初始化
        int[] nums = new int[i1];
        for (int i = 0; i < i1; i++) {
            nums[i] = i+1;
        }
        return nums;
    }
}