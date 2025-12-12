import mysql.connector

db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="root1",
    database="hii"
)

cursor = db.cursor()

cursor.execute("DELETE FROM students WHERE id = 1")

db.commit()
print("Record deleted successfully!")
db.close()