#include <stdio.h>

int main() {
    char str[100];
    int i, j = 0;

    // Read input (including spaces)
    fgets(str, sizeof(str), stdin);

    // Remove spaces
    for (i = 0; str[i] != '\0'; i++) {
        if (str[i] != ' ' && str[i] != '\n') {
            str[j++] = str[i];
        }
    }
    str[j] = '\0';

    // Output result
    printf("%s", str);

    return 0;
}
