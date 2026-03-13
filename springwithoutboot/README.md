# SPRING APPLICATION WITH OUT SPRING BOOT

STEPS TO RUN THIS APPLICATION.

1. Create a simple Maven project using any (IDE ECLIPSE/STS/INTELIJ/VS CODE). maven quickstart project.
2. To Create springcontainer inport the dependency called **ApplicationContext**. add into pom.xml
                   https://mvnrepository.com/artifact/org.springframework/spring-context/7.0.5
3. Create an xml file inside resources folder src/main/java - create a directory resources - inside create file called **spring.xml**
4. Create beans inside xml file. Every Bean is an Object.
               <bean id="hospital" class="com.amar.springwithoutboot.Hospital"></bean>
5. Create a object and call with spring container bean
               Hospital h = (Hospital) context.getBean("hospital");
6. How to call properties/variables inside a class ? class must have private variables we cannot call directly private variables.
   So use GETTER AND SETTERS to call private variables. **Encapsulation property  **
7. To inject the values for the properties use 
       USE ANY OF ONE BELOW
            **SETTER INJECTION** - init getter and setter methods
            **CONSTRUCTOR INJECTION** - init parameterized constructor based on variables.
8. If you choose SETTER INJECTION. create setters and getters inside the class. Then open spring.xml file inside bean class default tag
     (property) has name and value. **<property name="patientName" value="ARON"/>** If you have multiple variables create multiple
      properties.  


























































