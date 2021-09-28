row = 1
add = 2
max = 8
val = 1
while(row<max):
    for i in range(1,max-row):
        print(" ",end=" ")
    for j in range(1,row+1):
        print(val,end="   ")
    print("\n")
    val= val+add
    row = row+1

for i in range(1,max,2):
    print(Line )