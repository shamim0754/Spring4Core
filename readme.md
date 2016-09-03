Spring 4 feature <br /> 
1.Hello world using @configuration way <br />
2.setter & construction DI using @configuration way <br />
3.autowire using pure xml way <br />
4.autowire using anotated and spring 4 way <br />
 _____ @Resource : no optionality,allow byName DI <br />
 _____ @Autowired : have optionality(@Autowired(required="false")),not allow byName DI,allow byType DI <br />
 _____  @Qualifier : useful for the situation where you have more than one bean matching the type of DI <br />
5. more anotation demo<br />
_____	@Component - marks a java class as a bean so the component-scanning mechanism of spring can pick it up and pull it into the application context<br />
_____	@Repository - is a specialization of the @Component annotation with similar use and functionality. In addition to importing the DAOs into the DI container, it also makes the unchecked exceptions (thrown from DAO methods) eligible for translation into Spring DataAccessException.<br />
_____	@Service(name="test") - The @Service annotation is also a specialization of the component annotation. It doesn’t currently provide any additional behavior over the @Component annotation, but it’s a good idea to use @Service over @Component in service-layer classes because it specifies intent better. Additionally, tool support and additional behavior might rely on it in the future.will be registered in DI container as test name<br />
_____	@Controller -  is a @Component specialization, so beans marked with it are automatically imported into the DI container<br />
_____	@Configuration - Used to mark a bean as Configuration Component.<br />

5. @PropertySource & @Value demo :  it is for read application properties value<br />
6. spring scheduling demo :  executes some tasks periodically <br />
