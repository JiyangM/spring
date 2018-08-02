#### BeanPostProcessor
BeanPostProcessor接口作用是：如果我们需要在Spring容器完成Bean的实例化、配置和其他的初始化前后添加一些
自己的逻辑处理，我们就可以定义一个或者多个BeanPostProcessor接口的实现，然后注册到容器中。

参考：
http://uule.iteye.com/blog/2094549


另外，不要将BeanPostProcessor标记为延迟初始化。因为如果这样做，Spring容器将不会注册它们，自定义逻辑也就无法得到应用。假如你在<beans />元素的定义中使用了'default-lazy-init'属性，请确信你的各个BeanPostProcessor标记为'lazy-init="false"'。



#### java对象的创建过程：
https://blog.csdn.net/justloveyou_/article/details/72466416

实际上，如果我们对实例变量直接赋值或者使用实例代码块赋值，那么编译器会将其中的代码放到类的构造函数中去，并且这些代码会被放在对超类构造函数的调用语句之后(还记得吗？Java要求构造函数的第一条语句必须是超类构造函数的调用语句)，构造函数本身的代码之前。