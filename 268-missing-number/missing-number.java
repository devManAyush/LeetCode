class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean[] arr=new boolean[n+1];
        for(int i=0;i<n;i++){
            arr[nums[i]]=true;
        }
        for(int j=0;j<=n;j++){
            if(!arr[j]){
                return j;
            }
        }return -1;
    }
    public static void main(String[] args){
        int[] array={1,4,2,3,5,0,7};
        Solution obj=new Solution();
        int output=obj.missingNumber(array);
        System.out.println(output);
    }
}