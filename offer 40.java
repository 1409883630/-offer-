//��ָoffer 40 ��С��k����
//������������ arr ���ҳ�������С�� k ������
//���磬����4��5��1��6��2��7��3��8��8�����֣�����С��4��������1��2��3��4��
class Solution {
    //��ԭ�����С���������ȡ��ǰ kk ��������
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] vec = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; ++i) {
            vec[i] = arr[i];
        }
        return vec;
    }
}