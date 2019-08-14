#include<bits/stdc++.h>
using namespace std;
int main()
{
    string num;//input the number as a string
    cout<<"Enter the number:";
    cin>>num;
    string copy;//make a copy string to store that number
    copy=num;
    reverse(num.begin(),num.end());//use reverse method of string to reverse the given string
    if(copy==num)
     {
         cout<<"\nThe given number is a pallidrome"<<endl;//if the number is pallindrome
     }
     else
     {
         cout<<"The given number is not a pallindrome"<<endl;//if number is not a pallindrome
     }
     return 0;
}
