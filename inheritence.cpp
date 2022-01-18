#include <iostream>
#include <conio.h>
using namespace std;

//inheritence involve base that is (vehicle - 1) and drive that  is ( two whealer and four whealer - 2 ) //

class vehicle

{
    public:
    int f;
    void fuelcapacity()
{
    cout << "enter fuel capacity";
    cin >> f;
}
};

class twowhealer: public vehicle
{
    public:
    void type()
{
    cout << "two wheater";
}    
};
class fourwhealer:public vehicle 
{
    public:
    void type()
{
    cout << "four whealer";
}
};
int main()

{
    twowhealer x;
    x.type ();
    x.fuelcapacity();
    fourwhealer y;
    y.type();
    y.fuelcapacity();

    return 0;

}