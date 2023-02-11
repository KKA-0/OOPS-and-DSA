#include<iostream>
using namespace std;
int main ()
{
    float a,b,c;
    char d;

    cout<<"Enter the Money You want to Deposit (Example: 1000.0)"<<endl;
    cin>>a;
    cout<<"Enter The Percentage (Example: 3.25)"<<endl;
    cin>>b;
    cout<<"Enter the Months you Want to Deposit (Example: 1)"<<endl;
    cin>>c;
    cout<<endl<<"---------------------------------"<<endl;
    cout<<"-------------Confirm:-------------";
    
    cout<<endl<<"     Money: Rs "<<a<<endl<<"     Percentage: "<<b<<"%"<<endl<<"     Time: "<<c<<" Months";
    cout<<endl<<"---------------------------------";
    b = b/100;
    c = c/12;
    cout<<endl<<"  [Y/N]: ";
    cin>>d;
    
    if (d == 'Y' || d == 'y')
    {
        int t = a*b*c;
        cout<<endl<<"Your Total Interest is:    "<<t<<endl;
        cout<<"Total Monthly Interest is: "<<a*b*0.08<<endl;
        cout<<"Total Money Received is:   "<<t+a<<endl;
        cout<<"---------------------------------";
    }
    
}