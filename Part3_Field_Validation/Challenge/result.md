This challenge is base on the "superstore" which in part 2 challenge, in this time I have to set some limit for the input data. 
For example, the name cannot be blank "@NotBlank", the price cannot be negative "@Min", and the time must be in the past "@Past". If the input data cannot fulfill the requirement, the error message would be displayed. 
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/da55f2df-ba0d-4e60-b7aa-31adb3e774aa)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/526ffe63-77dc-4b98-b553-e37bd2115457)

And I have used "BindingResult.rejectValue" to compare the price and discount to make sure the price would always be larger than the discount. 
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/3b980b6f-bd95-4468-8c95-c8fb1539da57)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/7a27c53b-6a85-43bc-b542-bea0217c8a12)
