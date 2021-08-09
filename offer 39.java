//��ָ Offer 39. �����г��ִ�������һ�������
//��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
//����Լ��������Ƿǿյģ����Ҹ������������Ǵ��ڶ���Ԫ�ء�
class Solution {
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }
}