import mysql.connector
db=mysql.connector.connect(
    host="localhost",
    username="root",
    password="root1",
    database="info"
)
cursor=db.cursor();
cursor.execute("delete from details where id between 3 and 5" )
db.commit()
print("deleted successfully")
db.close()