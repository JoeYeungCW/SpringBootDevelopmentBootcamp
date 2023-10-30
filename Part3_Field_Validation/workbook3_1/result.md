In this workbook, I have to create a form with the field validation, in the form it allow user to input their name, email and day of birth, the field validation would check the input data
I use @NotBlank to make sure the input name cannot be blank, @Size for check the minimun size of name, @Past for check the day of birth must be at past, and @Email for check the vaild email.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/491c2b97-7707-4234-ba72-31e75ab10733)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/d7f540ac-c196-483f-811b-f5354222ae51)

In the java file, it need to add @Valid to check the validation of input data, and use BindingResult to check the data wherther the data has error or not, if the data has error, it will return to the form page.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/53a97d1b-ceca-4c41-9392-5046cd54b0a6)


If the data are valid, it will add into the arraylist and show in the result page
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/4d0d9f9e-9790-470e-ae88-6c80dd6c0c1a)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/300d3161-c5a5-44fa-ad59-67744adb7fb5)

For the goal of the workbook, it only need me to show the "success" in the result page, but I think I need to practice more, so I just apply the knowledge which I learnt and show the table and update function,
but I haven't learnt the frontend web design, so I just use stylesheet from previous workbook and change some value to show the topnav and table
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/8488c057-0e14-4fee-909a-19e80475cde9)
