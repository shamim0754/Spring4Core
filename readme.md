Spring 4 feature <br /> 
1.Hello world using @configuration way <br />
2.setter & construction DI using @configuration way <br />
3.autowire using pure xml way <br />
4.autowire using anotated and spring 4 way <br />
 _____ @Resource : no optionality,allow byName DI <br />
 _____ @Autowired : have optionality(@Autowired(required="false")),not allow byName DI,allow byType DI <br />
 _____  @Qualifier : useful for the situation where you have more than one bean matching the type of DI <br />
5. more anotation demo<br />
_____	@Repository - Used to mark a bean as DAO Component on persistence layer<br />
_____	@Service - Used to mark a bean as Service Component on business layer<br />
_____	@Controller - Used to mark a bean as Controller Component on Presentation layer<br />
_____	@Configuration - Used to mark a bean as Configuration Component.<br />
_____	@Component - General purpose annotation, can be used as a replacement for above annotations   <br />  