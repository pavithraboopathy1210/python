import mysql.connector;

db=mysql.connector.connect(
    host="localhost",
    user="root",
    password="root1",
    database="info",
)
cursor=db.cursor()
cursor.execute("""
               create table details(
               id INT AUTO_INCREMENT PRIMARY KEY,
               name VARCHAR(50),
               age INT,
               city VARCHAR(100)
               );""")
print("Table was created successfully")
db.close()