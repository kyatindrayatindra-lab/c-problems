#include <stdio.h>

int main() {
    int n, temp, rem, rev = 0;
    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while(temp != 0) {
        rem = temp % 10;        // Extract digit
        rev = rev * 10 + rem;   // Reverse number
        temp = temp / 10;       // Reduce number
    }

    if(n == rev)
        printf("Palindrome");
    else
        printf("Not Palindrome");

    return 0;
}

