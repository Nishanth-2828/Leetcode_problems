public class Find_peak_element {
    public int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            if(nums.length==1) return s;
            int mid=s+(e-s)/2;
            if(mid==0 && nums[mid+1]<nums[mid])  return mid; 
            if(mid==nums.length-1 && nums[mid]>nums[mid-1])  return mid;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])  return mid;
            else if(nums[mid+1]>nums[mid])s=mid+1;
            else e=mid-1;
        }
        return s;
    }
}
