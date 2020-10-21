class Solution {
    public int removeDuplicates(int[] nums) {
        
              if (nums == null || nums.length == 0)
            return 0;

        if (nums.length <= 2)
            return nums.length;

        int prev = 0, curr = 1, tracker = 1;
        boolean flag = false;
        
        

        while(curr< nums.length){
           
           if(nums[curr]==nums[prev]){
               if(!flag){
                   flag =true;
                   nums[tracker]=nums[curr];
                   curr++;
                   tracker++;
               }
               else{
                   curr++;
               }
           }
           else{
               prev = curr;
               nums[tracker]=nums[curr];
               curr++;
               tracker++;
               flag = false;

           }
        }

        return tracker;
    }
}