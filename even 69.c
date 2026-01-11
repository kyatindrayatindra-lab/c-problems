#include <stdio.h>
#include <string.h>

int main() {
    char str[100], word[20], small[20], large[20];
    int i = 0, j = 0;

    gets(str);

    while (1) {
        if (str[i] != ' ' && str[i] != '\0')
            word[j++] = str[i];
        else {
            word[j] = '\0';
            if (strlen(word) > strlen(large))
                strcpy(large, word);
            if (small[0] == '\0' || strlen(word) < strlen(small))
                strcpy(small, word);
            j = 0;
        }
        if (str[i] == '\0') break;
        i++;
    }

    printf("Largest: %s\nSmallest: %s", large, small);
    return 0;
}
