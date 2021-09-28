items = {4,7,1,2,9}
lis = list(items)
print(lis)
i = 0
j = 1
flag = False
while(not flag):
    flag = True
    i=0
    j=1
    while(i<j and j<len(lis)):
        if lis[i]<lis[j]:
            temp = lis[i]
            lis[i] = lis[j]
            lis[j] = temp
            flag = False
        i+=1
        j+=1
print(lis)
        

    