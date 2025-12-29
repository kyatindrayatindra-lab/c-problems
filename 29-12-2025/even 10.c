
#include<stdio.h>
int main() {
    int marks;
    printf("Enter marks: ");
    scanf("%d", &marks);

    if(marks >= 80)
        printf("Grade A");
    else if(marks >=70 )
        printf("Grade B");
    else if(marks >= 40)
        printf("Grade C");
    else if(marks >= 30)
        printf("Grade D");
    else
        printf("Grade F");

    return 0;
}
