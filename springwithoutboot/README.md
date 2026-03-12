# SPRING APPLICATION WITH OUT SPRING BOOT

STEPS TO RUN THIS APPLICATION.

1. Create a simple Maven project using any (IDE ECLIPSE/STS/INTELIJ/VS CODE). maven quickstart project.
2. To Create springcontainer inport the dependency called **ApplicationContext**. add into pom.xml
                   https://mvnrepository.com/artifact/org.springframework/spring-context/7.0.5
3. Create an xml file inside resources folder src/main/java - create a directory resources - inside create file called **spring.xml**
4. Create beans inside xml file.
               <bean id="hospital" class="com.amar.springwithoutboot.Hospital"></bean>
5. Create a object and call with spring container bean
               Hospital h = (Hospital) context.getBean("hospital");

6. Create setter and constructor injection.
      **CONSTRUCTOR INJECTION** - init parameterized constructor based on variables.
       **SETTER INJECTION**




































