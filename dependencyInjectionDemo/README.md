# DEPENDENCY INJECTION DEMO

STEPS TO RUN THIS APPLICATION.

1. Create a simple Springboot application. (use https://start.spring.io/ or STS - IDE).
2. Simple core project not a web - no dependecies added into your project.
3. Create a class name Banking.class simple method call this class in main class.
4. Using spring container - **ApplicationContext** - create/maintain the beans.
5. SpringBoot not create objects it self we need to tell using Annotation caled - **@Component**
6. Using **@Autowired** Annotation wire the objects from one class to another.
            	@Autowired // FIELD INJECTION
	            private FederalBanking fed;
7. Create an interface for autowiring to achieve loose coupling.
8. We 2 classes implements same interface to call prior class or particular class use **@Primary** Annotation at class level.
9. By method level use **@Qualifier("")**

