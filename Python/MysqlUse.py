import mysql.connector;

con= mysql.connector.connect(password="root")
cur= con.cursor();

# This file uses Mysql module as computer science students and 
# teached to use Mysql module in python so they can learn 
# use of query languages with their programming language 

# Creating database
cur.execute("Create database student_db1;")
# using database 
cur.execute("use student_db1;")
# Creating table

cur.execute("""
Create table student_tb(
    Roll int,
    name varchar(10),
    attendence char(1),
    dob date
);
""")
# Function for entering data 
def insertData():
    roll = str(input("Enter roll number of student: "));
    s_name= str(input("Enter name of student: "));
    if len(s_name) > 10:
        print("Name is too long, try again")
        insertData()
    attendence= str(input("Enter P(Present)/A(Absent):  "));
    dob= f"""{input('Enter year of birth: ')}-{input('Enter month of birth: ')}-{input('Enter date of birth: ')}"""
    insert= f"""insert into student_tb values(
        {roll}, {s_name!r}, {attendence!r}, {dob!r});
    """;
    cur.execute(insert)
    cur.commit()
    selectionMenu()

# Function for showing data
def showData():
    cur.execute("Select * from student_tb;")
    data= cur.fetchall()
    print("|  Roll  |    name    | attendence |    dob     |")
    for row in data:
        print(f"""| {row[0].center(5, ' ')} | {row[1].center(10, ' ')} | {row[2].center(10, ' ')} | {row[3]} |""");
    selectionMenu()
# Function for searching data
def searchData():
    print("Search By:\n1. Roll No.\n2. Student name\n3. Exit\n")
    choice = int(input("Enter your choice: "))
    if choice == 1:
        studentRoll = str(input("Enter roll number of student: "));
        searchByRoll = f"Select * from student_tb where Roll = {studentRoll}";
        cur.execute(searchByRoll)
        data = cur.fetchall()
        print("|  Roll  |    name    | attendence |    dob     |")
        for row in data:
            print(f"""| {row[0].center(5,' ')} | {row[1].center(10, ' ')} | {row[2].center(10, ' ')} | {row[3]} |""");
    elif choice == 2:
        studentName= str(input("Enter name of student: "));
        searchByName= f"Select * from student_tb where name= {studentName!r}"
        cur.execute(searchByName)
        data = cur.fetchall()
        print("|  Roll  |    name    | attendence |    dob     |")
        for row in data:
            print(f"""| {row[0].center(5,' ')} | {row[1].center(10, ' ')} | {row[2].center(10, ' ')} | {row[3]} |""");
    else:
        pass
    selectionMenu()
# Function for deleting data
def deleteData():
    print('Delete By:\n1. Roll No. \n2. Student name \n3. Exit\n')
    choice= int(input("Enter your choice: "))
    if choice == 1:
        studentRoll = str(input("Enter roll number of student: "))
        deleteByRoll = f"Delete from student_tb where Roll= {studentRoll}"
        cur.execute(deleteByRoll)
        cur.commit()
    elif choice == 2:
        studentName= str(input("Enter name of student: "))
        deleteByName= f" Delete from student_tb where name= {studentName!r}"
        cur.execute(deleteByName)
        cur.commit()
    else:
        pass
    selectionMenu()

# Menu Function
def selectionMenu():
    while True:
        print("Select one: 1. Insert Data\n2. Show Data\n3. Search Data\n4. Delete Data\n5. Exit")
        MenuChoice= int(input("Enter your choice: "))
        if MenuChoice == 1:
            insertData();
        elif MenuChoice == 2:
            showData();
        elif MenuChoice == 3:
            searchData();
        elif MenuChoice == 4:
            deleteData()
        elif MenuChoice == 5: break;
        else:
            print("Invalid choice\n")
