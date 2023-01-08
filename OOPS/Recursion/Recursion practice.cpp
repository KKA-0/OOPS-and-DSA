#include<iostream>
using namespace std;
void fun(int n)
{
	if(n==0)
	{
		return;
	}
	fun(n/2);
	cout<<(n%2);
}
// 13/2 = 6 , 6/2 = 3/2 = 1, 1/2 = 0 
// 13 = 1, 6 = 0, 3 = 1, 1 = 1 (reverse)
// Output = 1101
int main()
{
	fun(13);
	return 0;
}
