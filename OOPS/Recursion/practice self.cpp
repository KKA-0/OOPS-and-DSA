#include<iostream>
using namespace std;
void fun(int n)
{
	if(n==0)
	{
		return;
	}
	cout<<n;
	fun(n-1);
}

int main()
{
	int n=7;
	fun(n);
	return 0;	
}
