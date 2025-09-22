class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // This list will store all the final permutations.
        List<List<Integer>> result = new ArrayList<>();
        
        // A boolean array to keep track of which numbers are already used in the current permutation.
        boolean[] used = new boolean[nums.length];
        
        // Start the backtracking process.
        backtrack(result, new ArrayList<>(), nums, used);
        
        return result;
    }

    /**
     * A recursive helper function to generate permutations.
     *
     * @param result      The final list of all permutations.
     * @param currentList The permutation being built in the current recursion path.
     * @param nums        The original input array.
     * @param used        A boolean array to track used numbers.
     */
    private void backtrack(List<List<Integer>> result, List<Integer> currentList, int[] nums, boolean[] used) {
        // 1. Base Case: If the current permutation is complete (its size equals the input array's size).
        if (currentList.size() == nums.length) {
            // Add a copy of the completed permutation to the result list.
            result.add(new ArrayList<>(currentList));
            return; // Stop this path and backtrack.
        }

        // 2. Recursive Step: Iterate through all numbers in the input array.
        for (int i = 0; i < nums.length; i++) {
            // If the number at index 'i' has already been used, skip it.
            if (used[i]) {
                continue;
            }

            // a. Make a choice: Add the number to the current permutation.
            currentList.add(nums[i]);
            used[i] = true; // Mark it as used.

            // b. Recurse: Move to the next position to continue building the permutation.
            backtrack(result, currentList, nums, used);

            // c. Backtrack: Undo the choice to explore other possibilities.
            used[i] = false; // Unmark it as used.
            currentList.remove(currentList.size() - 1); // Remove the last added number.
        }
    }
}