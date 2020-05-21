class Solution {
    public int trap(int[] height) {
        int left [] = new int[height.length];
        int right = 0;
        int total = 0;
        
        for(int i = 1 ; i< height.length ; i++){
            left[i] = Math.max(height[i-1],left[i-1]);
        }
        
        for(int j = height.length-2 ; j>=0 ; j--){
            right = Math.max(right,height[j+1]);
            int sum = Math.min(right, left[j])-height[j];
            if(sum > 0) total+= sum;
        }
        return total;
    }
}
