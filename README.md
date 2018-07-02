# pattern-demo
##2018-07-02 抽象工程模式
####路径：com.junge.demo.pattern.create.abstractfactory
####资料参考：http://www.cnblogs.com/java-my-life/archive/2012/03/28/2418836.html
####在什么情况下应当使用抽象工厂模式
* 1.一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节，这对于所有形态的工厂模式都是重要的。
* 2.这个系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
* 3.同属于同一个产品族的产品是在一起使用的，这一约束必须在系统的设计中体现出来。（比如：Intel主板必须使用Intel CPU、Intel芯片组）
* 4.系统提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于实现。

####抽象工厂模式的优点
#####分离接口和实现
* 客户端使用抽象工厂来创建需要的对象，而客户端根本就不知道具体的实现是谁，客户端只是面向产品的接口编程而已。也就是说，客户端从具体的产品实现中解耦。

#####使切换产品族变得容易
* 因为一个具体的工厂实现代表的是一个产品族，比如上面例子的从Intel系列到AMD系列只需要切换一下具体工厂。

####抽象工厂模式的缺点
#####不太容易扩展新的产品
* 如果需要给整个产品族添加一个新的产品，那么就需要修改抽象工厂，这样就会导致修改所有的工厂实现类。