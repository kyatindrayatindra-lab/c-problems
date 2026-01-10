#include <stdio.h>

int main() {
    int base, exp;
    int result = 1;

    scanf("%d %d", &base, &exp);

    for (int i = 1; i <= exp; i++)
        result *= base;

    printf("%d", result);
    return 0;
}
