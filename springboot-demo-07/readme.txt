配置文件解析
1. 如何读取自定义属性
    1-1: 自定义属性需定义在配置文件中(可以放在application.properties)
        user.name=xiongzl
        user.age=10
    1-2: 如果需要读取name, age属性只需
        @Value("${user.name}")
        private String name;
        @Value("${user.age}")
        private String age;
        这样就可以将值绑定到你想要的的属性上面
    1-3: 如果属性值比较多, 我们也可以建造一个对象
        @Data
        @Configuration
        @ConfigurationProperties(prefix = "user")
        public class User {
            private String name;
            private int age;
        并且在pom文件中加入
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
        </dependency>
        这样就可以将值绑定到对应的属性上了.
    1-4: 如果不想将所有的属性都放置在application.properties中,
         也可以另外新建一个properties, 将其放置在classpath下即可.
         只是在配置的时候需要使用@PropertySource注解指定properties文件的路径所在位置.
         @Data
         @Configuration
         @ConfigurationProperties(prefix = "db")
         @PropertySource("classpath:db.properties")
         public class DataBaseInfo {
             private String name;
             private String password;
