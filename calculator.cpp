#include <iostream>
#include <conio.h>
using namespace std;
int main()
{
    int a, b, c;
    cout << "Enter two numbers :";
    cin >> a >> b;

    c = a + b;
    cout << "Addition is : " << c << endl;

    c = a - b;
    cout << "Subtraction is : " << c << endl;

    c = a * b;
    cout << "Multiplation is : "<< c << endl;

    c = a / b;
    cout << "Divition is :" << c << endl;
    
    return 0;
}