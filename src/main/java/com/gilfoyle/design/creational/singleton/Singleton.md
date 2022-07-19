# Singleton (单例模式)

### 确保一个类在任何情况下只能有一个实例，并且提供一个全局访问点。

``` hql
  "单例模式重点"
    1、'私有化构造器'
    2、'保证线程安全'
    3、'延迟加载'
    4、'防止序列化和反序列化破坏单例'
    5、'防御反射攻击单例'
```


``` 
    例子：
        ServletContext、ServletConfig、ApplicationContext、DBPool

```

 ```  hql
 '单例模式常用写法'
    * '饿汉式单例模式'
        # 1、 简单饿汉式单例 'HungrySingleton'
        # 2、静态饿汉式单例 'HungryStaticSingleton'
    * '懒汉式单例模式'
        # 1、简单懒汉单例 'LazySimpleSingleton'
        # 2、Synchronized简单懒汉单例 'LazySynchronizedSimpleSingleton'
        # 3、双重检测懒汉单例 'LazyDoubleCheckSingleton'
    * '注册式单例模式'
        # 1、枚举单例 'EnumSingleton'
        # 2、类似Spring IOC 单例 'ContainerSingleton'
    * 'ThreadLocal单例模式'
        # 1、ThreadLocal单例模式， 'ThreadLocalSingleton'
    * 'Cas 单例模式'
        # 1、Cas单例模式， 'CasSingleton'    
```


[单例模式 在源码中的使用]
``` hql
 * org.springframework.beans.factory.config.AbstractFactoryBean.getObject
    * org.apache.ibatis.executor.ErrorContext.instance
        * org.apache.ibatis.executor.ErrorContext.LOCAL
```
   