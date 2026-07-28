class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int max = 0;
        while (i < j) {
            int length = j - i;
            int breadth = Math.min(height[i], height[j]);
            max = Math.max(max, length * breadth);
            if (height[i] < height[j])
                i++;
            else
                j--;

        }
        return max;
    }
}