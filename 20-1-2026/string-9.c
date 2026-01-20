#include <stdio.h>

int main() {
    char str[200];

    // Read a line including spaces
    fgets(str, sizeof(str), stdin);

    // Capitalize first character if it is lowercase
    if (str[0] >= 'a' && str[0] <= 'z') {
        str[0] = str[0] - 32;
    }

    printf("%s", str);
    return 0;
}
