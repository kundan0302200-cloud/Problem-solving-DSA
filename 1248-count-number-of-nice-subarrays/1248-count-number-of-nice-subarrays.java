class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums, k-1);
        
    }
    public int atMost(int[] nums, int k) {
        int left = 0;
        int odd = 0;
        int count = 0;
        for(int right = 0; right < nums.length; right++) {
            if(isOdd(nums[right]))
                odd++;
            while(odd > k) {
                if(isOdd(nums[left]))
                    odd--;
                left++;    
            }   
            count += right - left + 1; 
        }
        return count;
    }
    public boolean isOdd(int num) {
       
       return num % 2 != 0;
    }
}