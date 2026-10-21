class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int size = arr.length;
        int[] res = new int[size];
        Stack<Integer> stk = new Stack<>();
        for (int ind = 0; ind < size; ind++) {
            while (!stk.isEmpty() && arr[ind] > arr[stk.peek()]) {
                int pIn = stk.pop();
                res[pIn] = ind - pIn;
            }
            stk.push(ind);
        }
        return res;
    }
}
