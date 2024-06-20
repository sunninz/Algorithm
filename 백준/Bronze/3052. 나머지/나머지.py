busket=[]

for k in range(10):
    num=int(input())
    mod = num % 42
    if mod not in busket:
        busket.append(mod)

print(len(busket))