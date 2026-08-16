#include <stdio.h>
#include <ctype.h>

int main() {
    char name[100];
    int i;

    scanf("%s", name);

    // First character uppercase
    name[0] = toupper(name[0]);

    // Remaining characters lowercase
    for (i = 1; name[i] != '\0'; i++) {
        name[i] = tolower(name[i]);
    }

    printf("%s", name);

    return 0;
}
