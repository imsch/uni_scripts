/*
 * main.c
 *
 *  Created on: Apr 13, 2017
 *      Author: g33z
 */

#include <stdio.h>

int main() {

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

				printf("ggT von a = %d und b = %d ist c = %d \n", startA, startB, c);
				startB++;
			}
			startB = 1;
			startA++;
			printf("------ %d ------ \n", startA);
		}

		return 0;
}
