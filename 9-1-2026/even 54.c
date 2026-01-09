#include <stdio.h>

int main() {
    char str[100];
    int i = 0;

    printf("Enter string: ");
    gets(str);   // acceptable for exams, not for real projects

    while (str[i] != '\0') {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            str[i] = str[i] + 32;
        }
        i++;
    }

    printf("Lowercase string: %s", str);
    return 0;
}
