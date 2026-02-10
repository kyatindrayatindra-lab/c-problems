#include <stdio.h>

int main() {
    int class, age;
    int fare = 0;

    scanf("%d", &class);
    scanf("%d", &age);

    switch (class) {
        case 1:  
            fare = 300;

            if (age < 12) {
                fare = fare / 2;     
            } else if (age >= 60) {
                fare = fare - (fare / 3);
            }
            break;

        case 2:  
            fare = 1000;

            if (age < 12) {
                fare = fare / 2;  
            }
            break;

        default:
            printf("Invalid Class");
            return 0;
    }

    printf("Fare %d", fare);
    return 0;
}
