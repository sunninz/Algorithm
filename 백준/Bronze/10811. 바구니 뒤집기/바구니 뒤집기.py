n,m=map(int,input().split())
busket=[i+1 for i in range(n)]

for i in range(m):
    x,y = map(int,input().split())
    busket[x-1:y]=reversed(busket[x-1:y])

for j in busket:
    print(j,end=' ')