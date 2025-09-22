class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer , Integer> a = new HashMap<>();
       int[] ans = new int[2];

       for(int i = 0; i<nums.length ;i++){
        int compliment = target - nums[i];
        if(a.containsKey(compliment)){
            ans[0] = a.get(compliment);
            ans[1] = i;
        }
        a.put(nums[i] , i);
       }

       return ans;
    }
}