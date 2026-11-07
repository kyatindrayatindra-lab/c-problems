class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust to 0-indexed base-26
            int remainder = columnNumber % 26;
            result.append((char) ('A' + remainder));
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}
