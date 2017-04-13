/*
 * main.cpp
 *
 *  Created on: Apr 13, 2017
 *      Author: g33z
 */

#include <iostream>
using namespace std;

int main()
{
	int startA = 2;
	int startB = 1;

	int a = 0, b = 0, c = 1;

	while(startA <= 1000) {
		while(startB <= startA) {
			a = startA;
			b = startB;
			c = 1;

			while(a > 0 && b > 0) {
				if(a < b) {
					b = b - a;
				}
				else {
					a = a - b;
				}
			}

			if(a == 0) {
				c = b;
			} else {
				c = a;
			}

			cout << "ggT von a = " <<
					startA << " und b = " <<
					startB << " ist c = " <<
					c << endl;
			startB++;
		}
		startB = 1;
		startA++;
		cout << "------ " << startA << " ------" << endl;
	}

	return 0;
}
