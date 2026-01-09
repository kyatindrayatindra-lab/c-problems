#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int i, j;
    char temp;

    scanf("%s", str);

    j = strlen(str) - 1;

    for (i = 0; i < j; i++, j--) {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    printf("%s", str);
    return 0;
}
