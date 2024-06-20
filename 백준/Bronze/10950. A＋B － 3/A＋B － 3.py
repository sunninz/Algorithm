N=int(input())
a = []
b = []
for i in range(0,N):
    x,y=map(int,input().split())
    a.append(x)
    b.append(y)

for j in range(0,N):
    print(a[j]+b[j])
