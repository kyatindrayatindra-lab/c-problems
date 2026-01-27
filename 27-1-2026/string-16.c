#include <stdio.h>

float calculateBill(int units)
{
    float bill = 0;

    if (units <= 100)
    {
        bill = units * 1.5;
    }
    else if (units <= 200)
    {
        bill = (100 * 1.5) + (units - 100) * 2.5;
    }
    else
    {
        bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;
    }

    return bill;
}

int main()
{
    int units;
    printf("Enter units consumed: ");
    scanf("%d", &units);

    printf("Total Electricity Bill = %.2f\n", calculateBill(units));

    return 0;
}
