#include <stdio.h>
#include <string.h>

int main() {
    char s1[50], s2[50];
    int f1[256] = {0}, f2[256] = {0}, i;

    gets(s1);
    gets(s2);

    if (strlen(s1) != strlen(s2)) {
        printf("Not Anagram");
        return 0;
    }

    for (i = 0; s1[i]; i++) {
        f1[s1[i]]++;
        f2[s2[i]]++;
    }

    for (i = 0; i < 256; i++) {
        if (f1[i] != f2[i]) {
            printf("Not Anagram");
            return 0;
        }
    }

    printf("Anagram");
    return 0;
}
