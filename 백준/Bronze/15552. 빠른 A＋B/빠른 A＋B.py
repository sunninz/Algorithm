import sys
t= int(input())
answer=[]
for i in range(t):
    a,b=map(int, sys.stdin.readline().split())
    answer.append(a+b)
for j in range(t):
    print(answer[j])