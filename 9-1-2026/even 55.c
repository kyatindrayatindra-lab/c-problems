#include <stdio.h>

int main() {
    char str[200];
    int i = 0, count = 0;

    printf("Enter string: ");
    gets(str);

    while (str[i] != '\0') {
        if (str[i] == ' ') {
            count++;
        }
        i++;
    }

    printf("Number of spaces: %d", count);
    return 0;
}
