#include <stdio.h>
int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    if(num > 0)
        printf("Positive number");
    else
        printf("Negative number");

    return 0;
}
