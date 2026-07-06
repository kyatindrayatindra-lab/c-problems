#include <stdio.h>

int fact(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++)
        f *= i;
    return f;
}

int main() {
    int n, temp, sum = 0, rem;

    scanf("%d", &n);
    temp = n;

    while (temp != 0) {
        rem = temp % 10;
        sum += fact(rem);
        temp /= 10;
    }

    if (sum == n)
        printf("Strong");
    else
        printf("Not Strong");

    return 0;
}
