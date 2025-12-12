import mysql.connector

db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="root1",
    database="info"
)

cursor = db.cursor()

cursor.execute("""
INSERT INTO details(name, age,city)
VALUES ('John', 25,'chennai');
""")

db.commit()
print("Record inserted successfully!")
db.close()