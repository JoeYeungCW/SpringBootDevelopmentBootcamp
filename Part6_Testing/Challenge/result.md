In this challenge, I have try to write the integration testing for check the repository function. And I have mock some data for the testing.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/e1c08015-1159-4a75-9fdf-5b1bd6e2ce8f)

In "getContactByIdTest", the application response should return 200 OK, and the value should be equals to the mock data. Hence the return data type should be JSON, so I use "content().contentType" to check it. Base on it, I use "jsonPath" to query the JSON type data.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/4a3926a9-f919-4ab3-9939-25614a8aba17)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/9dca2388-fd6c-4f8b-9675-b6973de0a566)

In "getAllContactsTest", the application response should return 200 OK, and check the total number of the data.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/9b00f6fb-519f-4514-874e-afded1444376)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/5b29707d-936e-47d8-a605-2d359f7065d2)

In "contactNotFoundTest", the application response should return 404 not found.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/d3be36cd-2485-4f40-9037-f80e9a1d113e)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/9798eaee-4bc2-451c-ad58-2769f6249cb2)

In "validContactCreation", the application response should return 201 created.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/7964261e-15fa-4d28-af33-4557cb21e1b5)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/f384a588-cd5e-4d81-8945-a9a5f97ec080)

In "invalidContactCreation", the application response should return 400 bad request.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/68a5dbdd-d343-48ce-9c04-aa6293b85f6a)
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/fc1388b5-3073-48b2-bbfe-b8aaf9b9894b)
