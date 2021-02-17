#include <iostream>
using namespace std;

int main() 
{
  string a;
  cin>>a;
  int i,count=1, len=a.length();
  
  if(len>20){
  cout<<"Invalid Input";
    return 0;
  }
  else{
  for(i=1;i<=len;i++){
    if(a[i]==a[i-1])
       {
         count++;}
    else{
      cout<<a[i-1]<<count;
      count=1;
  }
    
}}return 0;}