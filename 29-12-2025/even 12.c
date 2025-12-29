#include <stdio.h>
int main() {
    int num;
    scanf("%d", &num);

    if(num >= 0 && num <= 9)
        printf("Single Digit");
    else
        printf("Not Single Digit");

    return 0;
}
