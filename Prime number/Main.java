

b=int(input())
for i in range(1,b+1):
    if i==1 or i==0 :
        continue
    flag =1
    for j in range(2,int(i//2)+1):
        if i%j==0 :
            flag=0
            break
    if flag==1 :
        print(i,end=' ')
