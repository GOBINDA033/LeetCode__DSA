// 1109-Defang-IP-Address
// Time complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
