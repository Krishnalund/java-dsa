//leetcode 2--ADD TWO NUMBERS
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode tail=null;
        int carry=0;
        ListNode newNode;
        while(l1!=null || l2!=null || carry!=0){
            int x, y;
            if(l1==null){
                x=0;
            }else{
                x=l1.val;
                l1=l1.next;
            }
            if(l2==null){
                y=0;
            }else{
                y=l2.val;
                l2=l2.next;
            }
            int sum=x + y + carry;
            newNode=new ListNode(sum%10);
            carry=sum/10;
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        return head;
    }
}