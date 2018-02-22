使用profile实现多环境配置
1. 一般开发环境有多个, 比如开发环境, 生产环境
   开发环境和生产环境的配置一般会有一些不同, 这个时候我们可以使用两个配置文件(application-dev/pro.properties)
   当部署不同的环境的时候, 使用不同的properties.
   java -jar xxx.jar --spring.profiles.active=dev/pro









