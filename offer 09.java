//��ָ Offer 09. ������ջʵ�ֶ���
//������ջʵ��һ�����С����е��������£���ʵ����������
//���� appendTail �� deleteHead ���ֱ�����ڶ���β��������������
//����ͷ��ɾ�������Ĺ��ܡ�(��������û��Ԫ�أ�deleteHead?�������� -1 )
class CQueue {

    LinkedList<Integer> A, B;
    public CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }
    public void appendTail(int value) {
        A.addLast(value);
    }
    public int deleteHead() {
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty()) return -1;
        while(!A.isEmpty())
            B.addLast(A.removeLast());
        return B.removeLast();

    }
}

