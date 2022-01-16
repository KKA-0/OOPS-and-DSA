#include <iostream>
#include <conio.h>
using namespace std;
int main()
{
    int a;
    cout << "Enter you're Marks: ";
    cin >> a;
    if (a > 33)
    {
        cout << "You passed the exam :)";
    }
    else
    {
        cout << "You failed the exam :( Try harder next time!!";
    }

    return 0;
}