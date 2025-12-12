import mysql.connector;
db=mysql.connector.connect(
    host="localhost",
    username="root",
    password="root1",
    database="info"
)
cursor=db.cursor()
sql="insert into details(name,age,city)values(%s,%s,%s)"
values=[
    ("ram",13,"madurai"),
    ("Ravi",19,"Madras")
]
cursor.executemany(sql,values)
db.commit()
print("Inserted successfully")
db.close()