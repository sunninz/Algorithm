N=int(input())
b=list(map(int,input().split()))
v=int(input())
count=0
for i in range(len(b)):
    if b[i]== v:
        count+=1
print(count)