#include<iostream>
using namespace std;
// here when child finish it's work parent has nothing to do.
// so, it directly closes hence saving memory and time
void fun(int n){
	if(n==0)
	{
		return ;
	}
	cout<<n;
	fun(n-1);
}

int main()
{
	fun(5);
	return 0;	
}

