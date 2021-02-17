
import math 

s=int(input())
n=int(input())
m=int(input())

ans = math.pow(s,n);
ans = ans%10;
ans = math.pow(ans,m);
ans = ans%1000000007;
print(int(ans))
