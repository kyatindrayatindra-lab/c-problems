class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double left = 0.0, right = 1.0;

        while (left < right) {
            double mid = left + (right - left) / 2.0;
            
            int count = 0;
            int maxNumerator = 0;
            int maxDenominator = 1;
            int j = 1;

            for (int i = 0; i < n - 1; i++) {
                while (j < n && arr[i] > mid * arr[j]) {
                    j++;
                }
                count += (n - j);

                if (j < n && maxNumerator * arr[j] < arr[i] * maxDenominator) {
                    maxNumerator = arr[i];
                    maxDenominator = arr[j];
                }
            }

            if (count == k) {
                return new int[]{maxNumerator, maxDenominator};
            } else if (count < k) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return new int[]{};
    }
}
