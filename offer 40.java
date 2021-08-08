//剑指offer 40 最小的k个数
//输入整数数组 arr ，找出其中最小的 k 个数。
//例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
class Solution {
    //对原数组从小到大排序后取出前 k 个数即可
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] vec = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; ++i) {
            vec[i] = arr[i];
        }
        return vec;
    }
}
