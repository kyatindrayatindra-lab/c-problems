#include <stdio.h>

int main() {
    int n, i, count = 0;
    int arr[100];

    // Read number of elements
    scanf("%d", &n);

    // Read array elements
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Count even numbers
    for(i = 0; i < n; i++) {
        if(arr[i] % 2 == 0) {
            count++;
        }
    }

    // Print result
    printf("%d", count);

    return 0;
}
