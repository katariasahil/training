tup = (1,2,5,(1,5,(5,1)))
itr = 0
while(itr<len(tup) and isinstance(tup[itr],tuple)==False):
    temp = tup[itr] 
    ind = itr+1
    
    while(ind<len(tup)):
        tupcheck = isinstance(tup[ind],tuple)
        if tupcheck==True:
            temptup = tup[ind]
            for i in range(0,len(temptup)-1,1):
                if temp == temptup[i] :
                    print(temp)
                    # print("\n")
                    print(" "+str(temp))
                    found = True
            if isinstance(temptup[i],tuple)==True:
                temptup=temptup[i]
        ind+=1
    itr+=1
    
    