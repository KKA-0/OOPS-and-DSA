#include<iostream>
using namespace std;
//recursion using base case to stop loop without break
void rec1(int n)
{	
	if(n==0)
	{
		return;
	}
	cout<<"karan ";
	rec1(n-1);
}

int main()
{	
	cout<<"hello ";
	rec1(2);
	return 0;
}
