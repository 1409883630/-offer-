//��ָ Offer 58 - I. ��ת����˳��
//����һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ַ���˳�򲻱䡣
//Ϊ������������ź���ͨ��ĸһ���������������ַ���"I am a student. "�������"student. a am I"��
class Solution {
    public String reverseWords(String s) {
      //�����������ַ����Կո���
        String[] strings = s.trim().split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        //��β�Ϳ�ʼ����
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].equals("")) {
                continue;
            }
            //��ͷ�ˣ�appendȻ��ȥ�ո�
            if (i == 0) {
                stringBuffer.append(strings[i].trim());
            } else {
                // ���ж���Ŀո�ȥ�����ټ���ȥ
                stringBuffer.append(strings[i].trim()).append(" ");
            }
        }
        //���String ���£����ţ�
        return stringBuffer.toString();

    }
}
