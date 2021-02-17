s=input()
set1={'break', 'case', 'continue', 'default', 'defer', 'else', 'for', 'func', 'goto', 'if', 'map', 'range', 'return', 'struct', 'type', 'var'}
if s in set1:
  print(s,"is a keyword")
else:
  print(s,"is not a keyword")