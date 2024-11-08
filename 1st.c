#include<stdio.h>

int x = 21;
extern static int  no;
int main()
{
    printf("%d\n",x);
    printf("%d\n",no);
    return 0;
}