lis = [0,1,2,5] 
step = 1
st = {lis[0]}
temp = lis[0]
for i in range(lis[0],lis[len(lis)-1],step):
    st.add(i)
for n in lis:
    st.discard(n)
lis = list(st)
for n in range(0,len(lis),1):
    print(lis[n])
print(" are missing")
