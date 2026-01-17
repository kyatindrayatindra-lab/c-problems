#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char otp[20];
    int i, valid = 1;

    printf("Enter OTP: ");
    scanf("%s", otp);

    // Check length
    if (strlen(otp) != 6) {
        valid = 0;
    }

    // Check each character is a digit
    for (i = 0; otp[i] != '\0'; i++) {
        if (!isdigit(otp[i])) {
            valid = 0;
            break;
        }
    }

    if (valid)
        printf("Valid\n");
    else
        printf("Invalid\n");

    return 0;
}
