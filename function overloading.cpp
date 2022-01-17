#include <iostream>
#include <conio.h>
using namespace std;
class itb
{
    public:
    void add(int x, int y)
{
    x = x + y;
    cout<<"result is "<<x<<endl;
}
void add(int a, int b, int c)
{
    a = a + b + c;
    cout<<"result is " << a << endl;
}
void add(int p, int q, int r, int s)
{
    p = p + q + r + s;
    cout <<"result is "<<p;
}
};

int main()
{
    int a, b, c, d, choice;
    itb mayank;
    cout << "press 1 for addition of two numbers" << endl;
    cout << "press 2 for eddition of three numbers" << endl;
    cout << "press 3 for eddition of four numbers" << endl;
    
    cin >> choice;
if (choice == 1)
{
    cout << "enter two numbers";
    cin >> a >> b;
    mayank.add(a,b);
}
else if (choice == 2)
{
    cout << "enter three numbers ";
    cin >> a >> b >> c;
    mayank.add(a,b,c);
}
else if (choice == 3)
{
    cout << "enter four numbers ";
    cin >> a >> b >> c >> d;
    mayank.add(a,b,c,d);
}
else
{
    cout << "error";
}

return 0;
}