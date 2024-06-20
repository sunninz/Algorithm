n,x=map(int,input().split())
numbers=list(map(int,input().split()))
answer=[]
for i in range(len(numbers)):
    if numbers[i] < x:
        answer.append(numbers[i])
for j in answer:
    print(j,end=" ")