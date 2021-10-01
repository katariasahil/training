


class Project:
    def __init__(self,id,name):
                                self.id = id
                                self.name = name
                                self.users = []
    def addUser(self , uid , usalary,effort):
        self.users.append([uid , usalary,effort])
         
class Users(Project):
    def __init__(self,id,name,salary,designation,plist):
        self.id = id
        self.designation = designation
        self.name = name
        self.salary = salary
        self.message = "NA"
        total = 0
        for P in plist:
            total+=P[1]
            P[0].addUser(self.id , self.salary,P[1])
        if total < 50:
            self.message = "UNDER UTILISED"
        elif total>100:
            self.message = "OVER UTILISED"
        

p1 = Project("p1","Project 1")
p2 = Project("p2","Project 2")
p3 = Project("p3","Project 3")
p4 = Project("p4","Project 4")

u1 = Users("u1","User 1",50000, "Assosciate", [[p1,50],[p2,50]])
u2 = Users("u2","User 2",40000,"Senior Assosciate", [[p1,70],[p2,30],[p3,10]])
u3 = Users("u3","User 3",70000,"Manager", [[p2,20],[p3,20]])
u4 = Users("u4","User 4",45000,"Lead Assosciate", [[p4,70]])

userSet = {"key":"message"}
userSet.clear()

userSet["u1"] = u1.message
userSet["u2"] = u2.message
userSet["u3"] = u3.message
userSet["u4"] = u4.message
print(userSet)