ls = [["a" , "a@a.com" , 123],["b" , "b@b.com" , 234],["c" , "c@c.com" , 456 , "Street 26", "Goa"],["b" , "b@b.com" , 234]]
users = []

file  = open('data.txt','a+')
file.write("Name,Email,Phone,Add1,Add2")
file.write("\n")

for row in ls:
    for n in range(0,len(row),1):
        # if n == 0:
        #     if row[n] in users:
        #          flag = False
        #     else:
        #          flag = True 
        #          ls.append(row[n])
        # if flag == True:
           
            file.write(str(row[n]))
            if n<len(row)-1:
                file.write(",")
    file.write("\n") 
file.close()
file  = open('data.txt','r')
row = 0
final = []
for line in file:
    if not row == 0:
        # print(row," : ",line)
        ls = line.split(",")
        final.append(ls)
    row+=1
final_tuple = tuple(final)
print(final_tuple)
    
