class Solution {
    public int trap(int[] arr) {
       int start=0,end=arr.length-1,lMax=0,rMax=0; 
       int count=0;
       while(start<end){
        if(arr[start]<arr[end]){
            if(lMax<arr[start]) lMax=arr[start];
            count+=lMax-arr[start];
            start++;
        }else{
            if(rMax<arr[end]) rMax=arr[end];
            count+=rMax-arr[end];
            end--;
        }
       }
       return count;
    }
}
