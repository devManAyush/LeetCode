public class Solution{
    public int removeDuplicates(int[] arr){
        int n=arr.length;
        if (n==0){
            return 0;
        }
        int uniquePosition=1;
        for (int i=0;i<n;i++){
            if(arr[i]!=arr[uniquePosition-1]){
                arr[uniquePosition]=arr[i];
                uniquePosition++;
            }
        }
        return uniquePosition;
    }
    public static void main(String[] args){
        int[] nums={0,0,0,1,2,3,3,4};
        Solution obj=new Solution();
        int answer=obj.removeDuplicates(nums);
        System.out.println(answer);
        
    }
}