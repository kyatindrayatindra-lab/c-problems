class Solution {
    public int numFriendRequests(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length,result=0,p1=0,p2=0;
        for(int ind=0;ind<size;ind++){
            if(arr[ind]<15) continue;
            while(p1<size&&arr[p1]<=0.5*arr[ind]+7) p1++;
            while(p2+1<size&&arr[p2+1]<=arr[ind]) p2++;
            result += p2-p1;
        }
       return result; 
    }
}
