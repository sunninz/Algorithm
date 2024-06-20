numbers=[]
maxVal=0
index=0

for i in range(9):
    x=(int(input()))
    numbers.append(x)
    if numbers[i] > maxVal:
        maxVal=numbers[i]
        index=i

print(maxVal)
print(index+1)