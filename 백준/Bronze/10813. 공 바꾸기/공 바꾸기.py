n,m=map(int,input().split())

busket=[(i+1) for i in range(n)]

for k in range(m):
    i,j=map(int,input().split())

    temp=busket[i-1]
    busket[i-1]=busket[j-1]
    busket[j-1]=temp

for l in busket:
    print(l,end=" ")