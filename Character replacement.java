class Solution {
    public static int characterReplacement(String txt, int k) {
        int max = 0, maxfreq = 0, start = 0;
        int[] arr = new int[26];
        Map<Character,Integer> heap = new HashMap<>();
        for(int end=0;end<txt.length();end++){
            int index = txt.charAt(end)-'A';
            arr[index]++;
            maxfreq = Math.max(arr[index],maxfreq);
            char key = txt.charAt(end);
            heap.put(key, heap.getOrDefault(key, 0)+1);
            maxfreq = Math.max(heap.get(key),maxfreq);
            while((end-start+1)-maxfreq>k){
                arr[txt.charAt(start)-'A']--;
                char sKey = txt.charAt(start);
                heap.put(sKey, heap.get(sKey)-1);
                start++;
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}
