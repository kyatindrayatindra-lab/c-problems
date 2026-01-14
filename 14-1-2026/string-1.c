#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char username[50];
    int i, len, valid = 1;

    scanf("%s", username);
    len = strlen(username);

    // Length check
    if (len < 6 || len > 12)
        valid = 0;

    // First character should not be a digit
    if (isdigit(username[0]))
        valid = 0;

    // Only lowercase letters and digits allowed
    for (i = 0; username[i] != '\0'; i++) {
        if (!(islower(username[i]) || isdigit(username[i]))) {
            valid = 0;
            break;
        }
    }

    if (valid)
        printf("Valid");
    else
        printf("Invalid");

    return 0;
}
