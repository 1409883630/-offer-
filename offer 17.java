//��ָ Offer 17. ��ӡ��1������nλ��
//�������� n����˳���ӡ���� 1 ������ n λʮ��������
//�������� 3�����ӡ�� 1��2��3 һֱ������ 3 λ�� 999��
class Solution {
    public int[] printNumbers(int n) {
        //����һ��string�ַ���s��������
        String s = "";
        for (int i = 1; i <= n; i++) {
            s+=9;
        }
        //���ַ���sתΪint����
        int i1 = Integer.parseInt(s);
        //��������Ϊi1��int���鲢ͨ��forѭ����ʼ��
        int[] nums = new int[i1];
        for (int i = 0; i < i1; i++) {
            nums[i] = i+1;
        }
        return nums;
    }
}