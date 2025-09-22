class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 0;
        int b = 0;
        while(a < nums1.length && b < nums2.length){
            if(nums1[a] < nums2[b]){
                arr.add(nums1[a]);
                a++;
            }else{
                arr.add(nums2[b]);
                b++;
            }
        }

        while(a < nums1.length){
            arr.add(nums1[a]);
            a++;
        }
        while(b < nums2.length){
            arr.add(nums2[b]);
            b++;
        }

        int n = arr.size();
        double med = 0;
        if(n%2 == 0){
            med = (double)(arr.get(n/2 - 1) + arr.get(n/2)) / 2;
        }else{
            med = (double)arr.get(n/2);
        }
        return med;
    }
}