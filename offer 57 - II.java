//��ָ Offer 57 - II. ��Ϊs��������������
//����һ�������� target ��������к�Ϊ target ���������������У����ٺ�������������
//�����ڵ�������С�������У���ͬ���а����׸����ִ�С�������С�
class Solution {
    public int[][] findContinuousSequence(int target) {
      int i = 1; // �������ڵ���߽�
    int j = 1; // �������ڵ��ұ߽�
    int sum = 0; // �������������ֵĺ�
    List<int[]> res = new ArrayList<>();

    while (i <= target / 2) {
        if (sum < target) {
            // �ұ߽������ƶ�
            sum += j;
            j++;
        } else if (sum > target) {
            // ��߽������ƶ�
            sum -= i;
            i++;
        } else {
            // ��¼���
            int[] arr = new int[j-i];
            for (int k = i; k < j; k++) {
                arr[k-i] = k;
            }
            res.add(arr);
            // ��߽������ƶ�
            sum -= i;
            i++;
        }
    }
    return res.toArray(new int[res.size()][]);
    }
}