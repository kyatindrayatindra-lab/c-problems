#include <stdio.h>

/* Function declarations */
int add(int a, int b);
int subtract(int a, int b);
int multiply(int a, int b);
int divide(int a, int b);

int main() {
    int a, b;

    /* Test case style input */
    scanf("%d %d", &a, &b);

    printf("%d\n", add(a, b));
    printf("%d\n", subtract(a, b));
    printf("%d\n", multiply(a, b));
    printf("%d\n", divide(a, b));

    return 0;
}

/* Function definitions */

int add(int a, int b) {
    return a + b;
}

int subtract(int a, int b) {
    return a - b;
}

int multiply(int a, int b) {
    return a * b;
}

int divide(int a, int b) {
    return a / b;   // assuming exact division as per question
}
