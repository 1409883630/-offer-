//剑指 Offer 24. 反转链表。
//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode prev =null;//定义前驱结点，虽然现在为空
    ListNode cur = head;//当前结点为头节点
    while(cur!=null){
       ListNode next=cur.next;//定义后继结点

       cur.next=prev;//改变引用指向的对象
       prev=cur;//前驱结点后移
       cur=next;//当前结点后移
        
    }
       return prev;//返回
    }
}
