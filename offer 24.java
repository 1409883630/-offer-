//��ָ Offer 24. ��ת����
//����һ������������һ�������ͷ�ڵ㣬��ת�����������ת�������ͷ�ڵ㡣
class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode prev =null;//����ǰ����㣬��Ȼ����Ϊ��
    ListNode cur = head;//��ǰ���Ϊͷ�ڵ�
    while(cur!=null){
       ListNode next=cur.next;//�����̽��

       cur.next=prev;//�ı�����ָ��Ķ���
       prev=cur;//ǰ��������
       cur=next;//��ǰ������
        
    }
       return prev;//����
    }
}