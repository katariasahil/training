row = 0
itr=0
print("Part 1\n")
for i in range(1 , 7, 2 ):

    row+=1
    for j in range(0,4-row):
        print(" ",end=" ")
        curr = i
        itr=0

    while(itr<row):
            print(curr,end="   ")
            itr+=1
            curr+=1
    print("\n")    

    print("Part 2\n") 
           

