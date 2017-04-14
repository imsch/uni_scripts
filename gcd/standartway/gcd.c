#include <stdio.h>

int main() {

	int startA = 2;
	int startB = 1;

		int a = 0, b = 0, c = 1, i = 1;

		while(startA <= 1000) {
			while(startB <= startA) {
				a = startA;
				b = startB;
				c = 1;
        i=1;

				while(i <= startB) {
          if(startA % i == 0 && startB % i == 0)
              c = i;
          i = i + 1;
				}
        startB++;
				printf("ggT von a = %d und b = %d ist c = %d \n", startA, startB, c);
			}
			startB = 1;
			startA++;
			printf("------ %d ------ \n", startA);
		}

		return 0;
}
