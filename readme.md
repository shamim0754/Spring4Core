Spring 4 feature <br /> 
1.Hello world using @configuration way <br />
2.setter & construction DI using @configuration way <br />
3.autowire using pure xml way <br />
4.autowire using anotated and spring 4 way <br />
     @Resource : no optionality,allow byName DI <br />
     @Autowired : have optionality(@Autowired(required="false")),not allow byName DI,allow byType DI <br />
     @Qualifier : useful for the situation where you have more than one bean matching the type of DI <br />