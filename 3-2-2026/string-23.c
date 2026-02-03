#include <stdio.h>

float calculateAttendance(int attended, int total) {
    return ((float)attended / total) * 100;
}

int main() {
    int attended, total;
    float percentage;

    printf("Enter classes attended: ");
    scanf("%d", &attended);

    printf("Enter total classes: ");
    scanf("%d", &total);

    if (total <= 0) {
        printf("Invalid total classes\n");
        return 0;
    }

    percentage = calculateAttendance(attended, total);
    printf("Attendance Percentage = %.0f%%\n", percentage);

    return 0;
}
