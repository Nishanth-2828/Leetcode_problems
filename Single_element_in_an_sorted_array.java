public class Single_element_in_an_sorted_array {
    public int singleNonDuplicate(int[] nums) {
        int s=0;
        int e=nums.length-1;
        
        
        while(s<e){
            int mid=s+(e-s)/2;
            if(mid%2==1) mid--;
            if(nums[mid]==nums[mid+1]) s=mid+2;
            else e=mid;
        
        //     if(mid%2==0){
        //         if(nums[mid]==nums[mid+1]){
        //             s=mid+2;
        //         }
        //         else{
        //             e=mid;
        //         }
        //         // if (nums[mid]==nums[mid-1]) {
        //         //    e=mid-2; 
        //         // }
                
        //     }
        //     if(mid%2==1){
        //        if(nums[mid]==nums[mid-1]){
        //             s=mid+1;
        //         }
        //         else{
        //             e=mid;
        //         }

                
        //         // if (nums[mid]==nums[mid-1]) {
        //         //    e=mid-2; 
        //         // } 
        //     }
            
            
        //     if(s==e){
        //         ans=nums[s];
        //     }

        // }
        // return ans;
    }
    return nums[s];
}
}
