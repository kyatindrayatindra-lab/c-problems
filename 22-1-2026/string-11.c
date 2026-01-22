#include <stdio.h>
#include <string.h>

int main() {
    char logMessage[200];

    printf("Enter the log message: ");
    fgets(logMessage, sizeof(logMessage), stdin);

    if (strstr(logMessage, "error") != NULL) {
        printf("The word 'error' exists in the log message.\n");
    } else {
        printf("The word 'error' does not exist in the log message.\n");
    }

    return 0;
}