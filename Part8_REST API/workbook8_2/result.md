In workbook 8.1, I have learnt exception can prevent the crash of the application, but in last workbook I need to throws, try, and catch in each function which require the user to input the id, it is really annoying and very easy to make a mistake when we need to change the code.

So in this workbook I learnt the unchecked exception (run time exception) can choose to not throw and use a handler to handle the run time exception.

First of all, I have create a custom unchecked exception, than I create an exception handler and it will only handle the exception type which I have customed. When the find index from id cannot find the same id from the list, it will throw the exception.

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/6c781f59-f8e9-4503-8762-ef6e04e6d5dd)

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/2da7f1e8-be18-4797-8df8-1b92ef3e9ec4)

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/8cd5deae-52d7-42fb-b389-b19b9df5d4e0)

When I input the id which does not in the list, it will show the 404 error and the not found message.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/4916a463-8f8c-4056-98a5-be70936a1d61)

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/000748ab-c718-43ff-9a91-02d9e9dc180d)

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/b2238a4f-e7bd-4c1b-a4b4-dc74510491b4)
