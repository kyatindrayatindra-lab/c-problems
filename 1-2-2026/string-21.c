#include <stdio.h>

long long factorial(int n) {
    long long fact = 1;

    for (int i = 1; i <= n; i++) {
        fact *= i;
    }

    return fact;
}

int main() {
    int num;
    scanf("%d", &num);

    if (num < 0) {
        printf("Factorial is not defined for negative numbers");
    } else {
        printf("%lld", factorial(num));
    }

    return 0;
}
