心得：
spring boot autoconfig 中提供了某些特定常用功能(如mysql,lombok,web)的类的自动配置,自动生成默认的bean。其他的类(不包含在spring boot autoconfig中的)还需要自己配置bean,即使spring boot autoconfig中某些类依赖过的jar包中的类也需要自己配置。