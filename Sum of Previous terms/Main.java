n1=int(input())
term1=0
def term(n):
	if(n==1):
		term1=1
	elif(n==2):
		term1=2
	elif(n>=100):
		term1="Invalid Input"
	else:
		term1=term(n-1)+term(n-2)
	return term1        
   
print(term(n1))
   