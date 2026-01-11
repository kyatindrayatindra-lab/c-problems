#include <stdio.h>

int main() {
    int a[100], n, i, j = 0;
    scanf("%d", &n);
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);

    for (i = 0; i < n - 1; i++) {
        if (a[i] != a[i + 1])
            a[j++] = a[i];
    }
    a[j++] = a[n - 1];

    for (i = 0; i < j; i++)
        printf("%d ", a[i]);

    return 0;
}
