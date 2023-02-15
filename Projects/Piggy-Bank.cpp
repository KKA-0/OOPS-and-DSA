#include<iostream>
using namespace std;

class FD{
    public:
    float a;
    float b;
    float c;
    char d;

    void fdMoney(){
    cout<<"Enter the Money You want to Deposit in FD (Example: 1000.0)"<<endl;
    cin>>a;
    }

    void fdpercentage(){
    cout<<"Enter The Percentage (Example: 3.25)"<<endl;
    cin>>b;
    }

    void fdMonths(){
    cout<<"Enter the Months you Want to Deposit (Example: 1)"<<endl;
    cin>>c;
    }

    void fdConfirm(){
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

};


int main ()
{
    int i;
    cout<<"Welcome to Your Very Own Piggy Bank"<<endl;
    cout<<"--Developed by Karan Agarwal--"<<endl;
    cout<<"What would you like to do?"<<endl;
    cout<<"1. Check Balance"<<endl<<"2. Deposit Money"<<endl<<"3. Transfer Money"<<endl<<"4. Saved Money"<<endl<<"5. Transactions"<<endl<<"6. FD Calculator"<<endl;
    cin>>i;
    if(i == 1){
        
    }
    else if (i == 2){

    }
    else if (i == 3){

    }
    else if (i == 4){

    }
    else if (i == 5){

    }
    else if (i == 6){
        FD myFD;
        myFD.fdMoney();
        myFD.fdpercentage();
        myFD.fdMonths();
        myFD.fdConfirm();


    }
    else{
        cout << "Invalid Input (please check typo mistakes error (BAD REQUEST))";
    }

    return 0;
    
}