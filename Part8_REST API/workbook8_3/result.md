In this workbook I have to validate fields from incoming request bodies. In the design, the name and phone number cannot be blank, so I add the validation constraints @NotBlank for the name and phone number, and add @Valid to validate field values.

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/f1478e29-1c24-4ab3-b5ad-154b9b021724)

To handle the invalid field arguments, the global exception handler have to inherit from "ResponseEntityExceptionHandler", and override the method "handleMethodArgumentNotValid", to return the list of errors.

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/f72dba91-0d44-487d-835c-f5c256769308)

![image](https://github.com/JoeYeungCW/SpringBootDevelopmentBootcamp/assets/109426792/449afcf1-828e-4135-9887-359143300c0a)
