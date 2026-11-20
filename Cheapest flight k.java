
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] price = new int[n];
        Arrays.fill(price, 100000000);
        price[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] temp = price.clone();

            for (int[] f : flights) {
                int u = f[0], v = f[1], w = f[2];

                if (price[u] != 100000000) {
                    temp[v] = Math.min(temp[v], price[u] + w);
                }
            }
            price = temp;
        }

        return price[dst] == 100000000 ? -1 : price[dst];
    }
}
