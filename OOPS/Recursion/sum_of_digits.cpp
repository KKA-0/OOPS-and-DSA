#include<iostream>
using namespace std;

int sum(int n){
    if(n == 0){
        return 0;
              }
    else{
	return sum(n/10) + n%10;
        // n/10 remove the last digit
        // n%10 gives the last digit
        //
        }
}

int main(){

int n = 123;
cout<<sum(n);
          }