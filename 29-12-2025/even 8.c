#include <stdio.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    if(n % 11 == 0)
        printf("Yes");
    else
        printf("No");

    return 0;
}
