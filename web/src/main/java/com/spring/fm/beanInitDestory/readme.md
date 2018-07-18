spring bean 的初始化和销毁


我们在 @Configuration 注解定义的 bean 方法中可以直接调用方法，不需要 @Autowired 注入后使用。


PostConstruct 在构造函数初始化 完成之后执行
