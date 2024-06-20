n,m=map(int,input().split())
bucket =[0 for i in range(n)]

for j in range(m):
    x,y,z=map(int,input().split())
    for k in range(x-1,y):
        if bucket[k]!=0:
            bucket[k]=0
        bucket[k]+=z

for l in bucket:
    print(l,end=" ")