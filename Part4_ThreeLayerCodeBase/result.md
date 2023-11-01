This topic is introduce what is three layer architecture, and why we should apply three layer architecture as the code style.

In the challenge, I have refactor the code from put all together inside the controller file, to put the code to the "Controller", "Service", and "Repository" file based on their function.

In "Repository", there are only the "CRUD" code inside.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/b6aa1844-0d60-4f58-a65b-5650fd9616c4)

In "Service", this layer is to connect the "Repository" and "Controller", so in this layer I put the function code from repository but only without the created list and call the repository for access the list. And also I put the business and decision-making logic inside the "Service".
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/b3677aad-833c-4b80-be04-f002f8428766)

In "Controller", this layer is only manage the model and present the view, so I remove all "CURD" and decision making logic and only keep the "CMV" part.
![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/28ac7699-9334-4c72-a1eb-6be204f2becc)
