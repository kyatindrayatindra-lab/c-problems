#include <stdio.h>

int main() {
    int n, i;
    int a[100];
    int sum = 0;
    float avg;

    scanf("%d", &n);
    for(i = 0; i < n; i++) {
        scanf("%d", &a[i]);
        sum += a[i];
    }

    avg = (float)sum / n;
    printf("%.0f", avg);

    return 0;
}
