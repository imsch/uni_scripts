#include <iostream>
#include <algorithm>

using namespace std;

void binarySearch(int searchKey, int arr[], int l, int r)
{
    if (r < l) {
        cout << "Array doesn't contain the number your seek!" << endl;
    } else {
        int mid = (l + r) / 2;
        if(searchKey == arr[l] || searchKey == arr[r] || searchKey == arr[mid]) {
            cout << "Found it!" << endl;
        } else if(searchKey < arr[mid]) {
            binarySearch(searchKey, arr, l, mid - 1);
        } else if(searchKey > arr[mid]) {
            binarySearch(searchKey, arr, mid + 1, r);
        } else {
            cout << "Debugging please" << endl;
        }
    }
}

const int SIZE = 100;

int main()
{
    // array with random numbers 0 - 100
    int dict[SIZE] = {};
    for(int i = 0; i < SIZE; i++) {
        int c = rand() % 1000;
        if(c != 0) {
            dict[i] = c;
        }
    }
    // sort
    sort(dict, dict + SIZE);
    cout << "Sorted Array looks like this." << endl;
    for (size_t i = 0; i != SIZE; ++i)
        cout << dict[i] << " ";
    cout << endl << "Array created and sorted. Commencing..." << endl;
    int n = 0;
    cout << "What to search? (0 - 100)" << endl;
    cin >> n;
    // now search
    int l = 0;
    int r = SIZE-1;
    binarySearch(n, dict, l, r);
    return 0;
}