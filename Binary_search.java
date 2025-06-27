public class Binary_search {
    public  int search (int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int result=bs(nums,target,s,e);
        return result;
    }
    public  int bs ( int []nums, int target, int s, int e){
        
        while(s<=e){
            int mid = s+(e-s)/2 ;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                return mid;
            }


        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        Binary_search bs=new Binary_search();
        int ans=bs.search(arr ,5);
        System.out.println(ans);

    }

}
