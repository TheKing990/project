# project
So I created this using a database called "projectdata". I would suggest using SQL to quickly create a database and table called "users".
Also, be sure to change the password in the "Project.java" file. It's the main file out of the two. "ProjectMenu.java" is the supporting
file. The password should currently have "qwer1234", be sure to change it your appropriate password for SQL access.
With that done, create the columns with "ID" VARCHAR (20), "FirstName" VARCHAR (20), MiddleName VARCHAR (20), LastName VARCHAR (20),
"CurrentBalance" Double, "PIN" INT.
Those are the 6 columns of data I used to keep track of the users and their balances. The ID and PIN are used for logging in.
There's still a bit more to come, but I built the foundation with this. This program can currently withdraw, deposit, log in and register
users. All that information is of course stored in the database file. I want to go ahead and create a current session log method. Don't know
if that'll be with DBMS or perhaps writing a simple text file for that.
