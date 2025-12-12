'''
       Student Mark Analysis
       ~~~~~~~~~~~~~~~~~~~~~
       1.Average by Subject and Student
       2.Highest and lowest per subject
       3.Overall class topper
       4.pass count per subject
       5.which subject is difficult
       6.Ranking Student

       
'''





import numpy as np
np.random.seed(40)
marks=np.random.randint(10,101,size=(20,5))
print(marks)
sub_avg=np.mean(marks,axis=0)
stu_avg=np.mean(marks,axis=1)
print("Subject Avg",sub_avg)
print("Student_avg",stu_avg)
highest=np.max(marks,axis=0)
lowest=np.min(marks,axis=0)
print("highest",highest)
print("lowest",lowest)
total=np.sum(marks,axis=0)
print("total:",total)
topper=np.argmax(total)
print("Topper:",topper ,"mark is",total[topper])
pass_fail=marks>=40
#print(pass_fail)
passCount=np.sum(pass_fail,axis=0)
print("pass count in each subject",passCount)
difficult=np.argmin(total)
print("difficult subject is ",difficult," and the avg in that subject is ",total[difficult])
rank=np.argsort(-stu_avg)
print("first rank is ",rank[0]," and the avg is",stu_avg[rank[0]] )
print("First five rank are",rank[:5])

