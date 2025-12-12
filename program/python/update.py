import mysql.connector

db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="root1",
    database="hii"
)

cursor = db.cursor()

cursor.execute("""
UPDATE students
SET age = 30
WHERE id = 1;

""")
cursor.execute("""
UPDATE students
SET age = 25
WHERE id = 5;

""")

db.commit()
print("Record updated successfully!")
db.close()