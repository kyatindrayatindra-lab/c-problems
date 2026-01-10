#include <stdio.h>
#include <math.h>

int main() {
    int n, temp, digits = 0;
    int sum = 0, rem;

    scanf("%d", &n);
    temp = n;

    while (temp != 0) {
        digits++;
        temp /= 10;
    }

    temp = n;
    while (temp != 0) {
        rem = temp % 10;
        sum += pow(rem, digits);
        temp /= 10;
    }

    if (sum == n)
        printf("Armstrong");
    else
        printf("Not Armstrong");

    return 0;
}
