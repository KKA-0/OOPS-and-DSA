#include<iostream>
using namespace std;

bool palindrome (string str, int start,int end)
{
    if (start >= end)
    {
        return true;
    }
    if (str[start]!=(str[end]))
    { 
        return false;
    }
    
}

int main(){
    string str = "lol";
    palindrome();
    return 0;
}

