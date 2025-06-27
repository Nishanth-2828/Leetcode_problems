public class Search_in_rotated_sorted_array {
    //  [4,5,6,7,8,0,1,2]
    public int  search(int[] nums, int target) {
        int p;
        int ans;
        if(nums[0]>nums[nums.length-1]) {
            p=pivot(nums);
            if(nums[p]==target) return p;
            if(target>nums[nums.length-1]) ans= bs(nums,target,0,p-1);
            else ans=bs(nums,target,p+1,nums.length-1);
        } 
        else{
            ans =bs(nums,target,0,nums.length-1);
        }return ans;
        
    }

     int pivot (int[]nums){
        int s=0;
        int e=nums.length-1;
        while (s<e) {
            int mid=s+(e-s)/2;

            if(mid<nums.length-1 && nums[mid]>nums[mid+1]) return mid;
            if(nums[mid]>=nums[0]) s=mid+1;
            else e=mid;
            
            
        }
        return s;
    }
    int bs(int nums[],int target,int s,int e){

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
}