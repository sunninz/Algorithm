import sys
N=int(input())
line=sys.stdin.readline()
temp=[]
temp.extend(map(int,line.split()))
v=int(input())
count=0

for i in range(len(temp)):
    if temp[i]== v:
        count+=1
print(count)