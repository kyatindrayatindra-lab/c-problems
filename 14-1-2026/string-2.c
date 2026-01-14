#include <stdio.h>
#include <string.h>

int main() {
    char email[100];
    char domain[] = "@company.com";

    scanf("%s", email);

    int emailLen = strlen(email);
    int domainLen = strlen(domain);

    if (emailLen >= domainLen &&
        strcmp(email + emailLen - domainLen, domain) == 0)
        printf("Valid");
    else
        printf("Invalid");

    return 0;
}
