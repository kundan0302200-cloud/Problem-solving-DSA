class Solution {
    public int smallestAbsent(int[] nums) {
        int x = 0;
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            x += i;
            set.add(i);

        }
        int n = nums.length;
        int avg = x/n;

        int ans;
        if(avg > 0){
            ans = avg+1;
        }
        else {
            ans = 1;
        }
        while(set.contains(ans)){
            ans++;
        }
        return ans;

    }
}