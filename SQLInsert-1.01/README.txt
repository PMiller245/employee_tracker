To run the project, run the bat file.

The program will prompt you for three things:

1. Database connection. You will need to provide a database URL, and a user/password. 
The connection will be checked before the program advances to make sure you can connect.

2. The table name that you wish to insert into.

3. The file path for the path that will be read in. The program is designed to read in a csv, where each line is the data you wish inserted into the table. Every column 
in the specific table you are inserting into should be represented(except for your primary key), if you wish to insert a null value the two commas should be adjacent. 
(eg. Sally,,Smith, if the second column should be null)

Currently, the program only supports integers, numerics, varchars, dates, and bools. A column with a type of serial is assumed to be the primary key of the table and is 
ignored. I'd be happy to add support for more data types and update the program, please just let me know. Also, the program was written with PostgreSQL in mind, so it was not 
tested for other SQL drivers.
