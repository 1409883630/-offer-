//��ָ Offer 50. ��һ��ֻ����һ�ε��ַ�
//���ַ��� s ���ҳ���һ��ֻ����һ�ε��ַ������û�У�����һ�����ո� s ֻ����Сд��ĸ��
class Solution {
    public char firstUniqChar(String s) {
       for (int i = 0; i < s.length(); i++) {
           char ch=s.charAt(i);
           
           //�״γ��ֵ�λ���ǵ�ǰλ�ã��Һ���û���ٳ�������ַ�
            if(s.indexOf(ch)==i&&s.indexOf(ch,i+1)==-1)
                return s.charAt(i);
        }
        return ' ';
    }
}