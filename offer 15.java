//��ָ Offer 15. ��������1�ĸ���
//��дһ��������������һ���޷����������Զ����ƴ�����ʽ����
//����������Ʊ��ʽ������λ��Ϊ '1' �ĸ�����Ҳ����Ϊ ��������).����
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