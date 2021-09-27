row = 0
itr=0
mat = []


sum = []
add = 0
print("Part 1:")
for i in range(1,7,2):
    row+=1
    added  = 0
    add=0
    temp = []
    for j in range(0,4-row,1):
        print(" ",end=" ")
    itr=0
    curr=i
    
    while(itr<row):
        print(curr,end="   ")
        temp.append(curr)
        added+=1
        add+=curr
        curr+=1
        itr+=1
    while(added<3):
        temp.append(0)
        added+=1
    print("\n")
    mat.insert(0,temp)
    sum.append(add)
row = 0
final=0
print("\n")
print("Part 2:")
while(row<3):
    print("Line",row+1,": ",sum[row])
    row+=1
    final+=sum[row-1]

print("Line 4 : ",final)

print("\n")
print("Part 3:")

for a in range(0,3,1):
    for b in range(0,3,1):
        print((mat[a])[b],end=" ")
        (mat[a])[b] = (mat[a])[b] *(mat[a])[b]
    print("\n")    
    print("\n")
print("Part 4:")
for a in range(0,3,1):
    for b in range(0,3,1):
        print((mat[a])[b],end=" ")
        
    print("\n")   
