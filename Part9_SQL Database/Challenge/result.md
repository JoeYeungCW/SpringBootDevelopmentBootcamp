In the challenge, I have created a many to many table for the grade submission application. In the one to many and many to one relationship, the "many" one should own the association, which mean in the "many" side, there is a joincolumn. In the application, the foreign key "student" and "course" will appear in "grade" table.

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/deeda742-3cc0-4b8f-bc78-5afc11ebd6e7)

But in the many to many relationship, the join column is live inside the join table, so no matter who own the association.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/e9a46ef6-bf42-4f4e-8303-4505e5c4184d)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/16c55dfd-790c-4b63-acab-383541d7d374)

After create the many to many table, I have finish the methods of adding the student to course.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/1e4d155c-c692-4803-a184-673fd6643e95)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/2c147425-3255-464f-b24a-8939d1c895de)

