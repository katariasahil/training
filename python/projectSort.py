


class Project:
    def __init__(self,id,name):
                                self.id = id
                                self.name = name
                                self.users = []
    def addUser(self , uid , usalary):
        self.users.append([uid , usalary])
         
class Users(Project):
    def __init__(self,id,name,salary,P):
        self.id = id
        self.name = name
        self.salary = salary
        P.addUser(self.id , self.salary)

p1 = Project("p1","Project 1")
u1 = Users("u1","User 1",50000,p1)
u2 = Users("u2","User 2",40000,p1)
u3 = Users("u3","User 3",70000,p1)
u4 = Users("u4","User 4",45000,p1)


p2 = Project("p2","Project 2")
u1 = Users("u1","User 1",70000,p2)
u2 = Users("u2","User 2",30000,p2)
u3 = Users("u3","User 3",15000,p2)
u4 = Users("u4","User 4",45000,p2)

p3 = Project("p3","Project 3")
u1 = Users("u1","User 1",20000,p3)
u2 = Users("u2","User 2",40000,p3)
u3 = Users("u3","User 3",10000,p3)
u4 = Users("u4","User 4",5000,p3)

p4 = Project("p4","Project 4")
u1 = Users("u1","User 1",70000,p4)
u2 = Users("u2","User 2",30000,p4)
u3 = Users("u3","User 3",15000,p4)
u4 = Users("u4","User 4",45000,p4)


def sort(p):
    i = 0
    j = 1
    flag = False
    while( not flag == True):
        flag = True    
        i=0
        j=1
    
        while (i<j and j<len(p.users)): 
       
            if (p.users[i])[1]>(p.users[j])[1]:
         
                temp0 = (p.users[i])[0]
                temp1 = (p.users[i])[1]
                (p.users[i])[0]= (p.users[j])[0] 
                (p.users[i])[1]= (p.users[j])[1] 
                (p.users[j])[0]= temp0
                (p.users[j])[1]= temp1 
            
                flag = False
            i+=1
            j+=1
    return p.users
result = {"key":[]}
result.clear()
result["p1"] = sort(p1)
result["p2"] = sort(p2)
result["p3"] = sort(p3)
result["p4"] = sort(p4)

print(result["p2"])


