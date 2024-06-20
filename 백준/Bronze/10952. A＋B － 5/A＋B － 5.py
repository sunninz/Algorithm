import sys
answer=[]
while(1):
    a,b=map(int,sys.stdin.readline().split())
    if(a==0 and b==0):
        break
    answer.append(a+b)

for i in range(len(answer)):
    print(answer[i])