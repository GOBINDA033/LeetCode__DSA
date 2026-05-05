// 237 Delete Node list in Linkedlist
// Time Complexity:  O(n)
// Space Complexity: O(1)
class Solution()
{
    public static deleteNode(ListNode node)
    {
        node.val = node.next.val;
        node.next = node.next.next
    }
}