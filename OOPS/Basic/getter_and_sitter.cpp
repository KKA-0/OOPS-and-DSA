//setter and getter
#include<iostream>
using namespace std;
class solution{
	
		int a,b,c,d;
		
		public:
			int geta(){
				return a;
			}
			void seta(int e)
			{
				a = e;
			}
		
};

int main()
{
	solution Hero;
	Hero.geta = '1';
	cout<<Hero.geta();
}
