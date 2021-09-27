""" i = list(input())
 itr=0
 for itr<i:
     itr++
     name = input()
     p = input()
     c = input()
     m = input()
     marks.append([name,p,c,m])
   """  
     
marks = [["A",57,67,87],["B",53,87,97],["C",95,98,95],["D",12,89,34],["E",23,12,11],["F",23,52,51],["G",52,52,51],]

distinction= list()
firdiv = list()
secdiv = list()
failed = list()
reappear = list()
passed = 0
for i in marks:
    per = (i[1]+i[2]+i[3])/3 
    if i[1]>=50 and i[2]>=50 and i[3]>=50:
        passed=passed+1
        
        if per >= 80:
            distinction.append([i[0],per])
        elif per>=60 and per<=79:
            firdiv.append([i[0],per])
        elif per>=50 and per<=59:
            secdiv.append([i[0],per])
    elif (i[1]<50 and i[2]<50) or (i[2]<50 and i[3]<50) or (i[1]<50 and i[3]<50):
        failed.append([i[0],per])
    else:
        reappear.append([i[0],per])
print("Failed Students:\n")
print(failed)
print("\n")
print("Reappearing Students:\n")
print(reappear)
print("\n")
print("No. of student passed:")
print(passed)
print("\n")
print("Overall Passing Percentage")
print((passed*100)/len(marks))
print("\n")
print("Distinction:\n")
print(distinction)
print("\n")
print("First Division:\n")
print(firdiv)
print("\n")
print("Second Division:\n")
print(secdiv)
print("\n")