
b=[]
i=0
n=0
a=int(input())
while a!=0:
    e=a%10
    b.append(e)
    a=a//10
    n=n+1

for s in range(0,n):
    h=s+1
    for h in range(h,n):
        if(b[s]>b[h]):
            t=b[s]
            b[s]=b[h]
            b[h]=t
            
for x in range(len(b)): 
    print(b[x],end=" ")