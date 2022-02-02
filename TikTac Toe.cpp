#include<iostream>
#include<conio.h>
using namespace std;

char board [3][3] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

void drawboard()
{
    cout <<  " " << board [0] [0] << " / " << board [0] [2] << endl;
    cout << "-----------\n";
}

int main()
{
    cout << "Hello World!" << endl;
    return 0;
}