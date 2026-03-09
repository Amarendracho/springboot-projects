# DEPENDENCY INJECTION DEMO

STEPS TO RUN THIS APPLICATION.

1. Create a simple Springboot application. (use https://start.spring.io/ or STS - IDE).
2. Simple core project not a web - no dependecies added into your project.
3. Create a class name Banking.class simple method call this class in main class.
4. Using spring container - **ApplicationContext** - create/maintain the beans.
5. SpringBoot not create objects it self we need to tell using Annotation caled - **@Component**
6. Using **@Autowired** Annotation wire the objects from one class to another.\n
            	@Autowired // FIELD INJECTION
	            private FederalBanking fed;

