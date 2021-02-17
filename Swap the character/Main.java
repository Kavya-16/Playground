s1=input()
s2=input()
s3=input()
for i in s1:
  if i in ('a','e','i','o','u','A','E','I','O','U'):
    s1=s1.replace(i,"$").rstrip()
    
for i in s2:
  if i not in ('a','e','i','o','u','A','E','I','O','U'):
    s2=s2.replace(i,"#").rstrip()
  
print(s1+s2+s3.upper())