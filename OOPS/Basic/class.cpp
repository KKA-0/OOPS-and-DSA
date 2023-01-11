#include<iostream>
using namespace std;

class hero
{
	public:
	int a,b;
};
int main()
{
	int c;
	hero karan;
	karan.b = 20;
	karan.a = 10; 
	cout<<karan.a;
	cout<<karan.b;
	c=karan.a+karan.b;
	cout<<c;
}
