class Solution {
    public int trailingZeroes(int n) {
        int a =0;
        while(n!=0){
        n/=5;
        a+=n;
    }
        return a;
    }
}

// Time Complexity of this Code is O(logn) & Space Complexity is O(1)

Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

 

Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
Example 3:

Input: n = 0
Output: 0
    
 Here is the link of this probelm:- https://leetcode.com/problems/factorial-trailing-zeroes/
