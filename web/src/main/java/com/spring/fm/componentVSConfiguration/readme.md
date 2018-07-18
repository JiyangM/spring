@Configuration 和 @Component区别：

参考https://blog.csdn.net/isea533/article/details/78072133

@Configuration 标记的类必须符合下面的要求：

配置类必须以类的形式提供（不能是工厂方法返回的实例），允许通过生成子类在运行时增强（cglib 动态代理）。

配置类不能是 final 类（没法动态代理）。

配置注解通常为了通过 @Bean 注解生成 Spring 容器管理的类，

配置类必须是非本地的（即不能在方法中声明，不能是 private）。

任何嵌套配置类都必须声明为static。

@Bean 方法可能不会反过来创建进一步的配置类（也就是返回的 bean 如果带有 @Configuration，也不会被特殊处理，只会作为普通的 bean）。


#### 被@Configuration注解的类，会被cglib代理 

#### 被@Component注解的类，不会被代理