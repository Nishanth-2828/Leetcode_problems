class First_and_last_position_on_sorted_array{
    public int[] searchRange(int[] nums, int target) {
        int []arr={-1,-1};
        int start=search(nums, target, true);
        int end=search(nums, target, false);
        arr[0]=start;
        arr[1]=end;
        return arr;
        
    }
    public int search(int[]nums,int target,boolean firstIndex){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                ans=mid;
                if(firstIndex){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }return ans;

    }

}