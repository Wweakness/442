

class Solution1 {
    public static int pivotIndex(int[] nums) {
        int sum=0;
        int l =0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        for(int j=0;j<nums.length;j++){
            if(l==sum-l-nums[j]){
                return j;
            }
            l=l+nums[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n={1,2,3};
        System.out.println(pivotIndex(n));
    }
}