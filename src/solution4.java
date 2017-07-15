/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class solution4 {
    public ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode preNode = null;//前一节点
        ListNode nextNode = null;//后一节点
        //当前节点为head
        while(head != null){
            //先把下一节点保存
            nextNode = head.next;
            //然后把当前节点的下一节点设置为前一节点
            head.next = preNode;
            //然后把当前节点给前一节点
            preNode = head;
            //然后再把当前节点指向下一节点
            head = nextNode;
        }
        return preNode;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        solution4 s = new solution4();
        ListNode ns = s.ReverseList(node1);
        System.out.println(ns.val);
    }
}