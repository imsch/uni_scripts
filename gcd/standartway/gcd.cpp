#include <iostream>
using namespace std;

int main()
{
	int startA = 2;
	int startB = 1;

	int a = 0, b = 0, c = 1, i = 1;

	while(startA <= 1000) {
		while(startB <= startA) {
			a = startA;
			b = startB;
			c = 1;
      i = 1;

      while(i <= startB) {
        if(startA % i == 0 && startB % i == 0)
            c = i;
        i = i + 1;
      }

			cout << "ggT von a = " <<
					startA << " und b = " <<
					startB << " ist c = " <<
					c << endl;
          startB++;
		}
		startB = 1;
		cout << "------ " << startA << " ------" << endl;
    startA++;
	}

	return 0;
}
