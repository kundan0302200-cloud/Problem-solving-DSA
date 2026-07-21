class Solution {
    public int shipWithinDays(int[] weights, int days) {
          int low = getMax(weights);
        int high = getSum(weights);
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(canShip(weights, days,mid)) {
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public int getMax(int[] weights){
        int max = 0;
        for(int w : weights) {
            max = Math.max(max,w);
        }
        return max;
    }
    public int getSum(int[] weights) {
        int sum =0;
        for(int w: weights){
            sum += w;
        }
        return sum;
    }
    public boolean canShip(int[] weights, int days, int capacity)  {
        int dayCount = 1, currLoad = 0;
        for(int w: weights) {
            if(currLoad + w > capacity) {
                dayCount++;
                currLoad = 0;
            }
            currLoad += w;
            if(dayCount > days) {
                return false;
            }
           
        }
         return true;
    }
}