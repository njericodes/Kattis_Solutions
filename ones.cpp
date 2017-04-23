#include <iostream>
#include <string>

using namespace std;
int main(){
    int n;
    while(cin>>n){
        int ones = 1;
        long mul = 1;
        while(mul%n != 0){
            mul = ((mul*10)+1) % n;
            ones++;
        }
        cout << ones << endl;
    }
    return 0;
}
