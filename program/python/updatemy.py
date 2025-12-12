import mysql.connector
db=mysql.connector.connect(
host="localhost",
username="root",
password="root1",
database="info"
)
cursor=db.cursor()
sql=""" update details 
set city=case
when id=2 then "India"
when id=3 then "USA"
when id=5 then "UK"
END 
where id in(2,3,5)
"""
cursor.execute(sql)
db.commit()
print("updated successfully")
db.close()


