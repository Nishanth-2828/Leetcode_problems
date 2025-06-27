public class Find_minimum_in_rotated_sorted_array {
    public int findMin(int[] nums) {
        
        if(nums[0]>nums[nums.length-1]){
            int ans=pivot(nums);
            return nums[ans+1];
        }else{
            
            return nums[0];
        }


    }
    int pivot(int []arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            // int mid=s+(e-s)/2;
            // if(mid<arr.length-1 && arr[mid]>arr[mid+1]) return mid;
            // else if(arr[mid]>=arr[0]) s=mid+1;
            // else e=mid;
            int mid=s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]) return mid;
            if(mid>s && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[mid]<arr[s])  e=mid-1;
            else s=mid+1;

        }
        return s;
        
        
    }


}
