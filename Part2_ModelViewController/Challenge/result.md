In this challenge, I have to use the create a superstore which can let the user to input the information of an item, allow them to check it in the invertory table and update it
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/0accdfbb-e8d8-4836-b267-c0b9d2559e33)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/b4152330-15f1-4118-95cd-ea5a312b46ce)

I use "UUID" to generate a random id for every new item, and check the id by using "@RequestParam" and set the required to false to check the id.
After I set @RequestParam(required = false), it accept the page include the id or not, if the user create a new item, there is not id, if the user are updating the item information, the id will show in the url.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/c1ce6dad-7120-4ce0-90a5-0c30573c10e1)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/9b417611-d0e1-47fc-856b-bdd98dee3c93)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/ca59052a-e521-4f51-a9e5-032587312698)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/ccf2d508-4e56-4631-9b9f-529465097650)

In the html file, I use thymeleaf to let the frontend to bind the data from the java file.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/696c16fb-6705-49c3-a9c3-d74176f8c69d)

In the inventory page, it upload the information which store in the "Item" arraylist.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/211a48a9-e387-4c65-a442-118768fda05f)

In the html file, the action of upload button is link to the default page and add the id in the url.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/4f7b36f0-ff13-45a0-9e15-022d93b8372d)

About the POST part, I add a handle for add the item and change the value when the id is already exist, I use "FlashAttributes" to check the data that survives a redirect.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/165435c2-b190-492f-8314-222649916d76)

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/c96be8aa-aed7-4835-9998-313e4f90fb69)

if the changed date are larger than 5 days, the status will change to failed and show "You failed to submit the item.".
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/edf1b489-d912-4604-825f-54c4e15d0fdd)

Otherwise, it will show "You successfully submited the item!"
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/16700604-a151-4fba-8a67-9f23ca0c0dbf)
