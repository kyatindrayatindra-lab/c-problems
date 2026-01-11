#include <stdio.h>

int main() {
    char str[100];
    int freq[256] = {0}, i;

    gets(str);

    for (i = 0; str[i] != '\0'; i++)
        freq[str[i]]++;

    for (i = 0; i < 256; i++) {
        if (freq[i] != 0)
            printf("%c%d ", i, freq[i]);
    }
    return 0;
}
