import java.util.Arrays;

class Solution {
    public static int[] sortArrayByParity(int[] A) {
        int[] a=new int[A.length];
        int j=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                a[j]=A[i];
                j++;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0){
                a[j]=A[i];
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a={1,4,2,5,453,3};
        System.out.println(Arrays.toString(sortArrayByParity(a)));
    }
}