spring boot如何实现热部署
1. 添加devtools支持(推荐)
    Pom.xml中直接添加依赖即可：
    <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-devtools</artifactId>
          <scope>provided</scope>
          <!--optional我没弄明白，都说必须为true，但我测试true，false，不加都可以-->
          <optional>true</optional>
    </dependency>
    在设置完之后, 我们修改完代码只需要使用快捷键Ctrl+Shift+F9, 重新编译即可.

2. springloaded
    Pom.xml中直接在spring-boot插件中添加依赖即可：
    <plugin>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-maven-plugin</artifactId>
      <dependencies>
        <!-- spring热部署 -->
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>springloaded</artifactId>
          <version>1.2.6.RELEASE</version>
        </dependency>
      </dependencies>
      <configuration>
        <mainClass>cn.springboot.Mainspringboot</mainClass>
      </configuration>
    </plugin>
    运行: $ mvn clean spring-boot:run

3. 值得注意的问题
    3-1: devtools会监听classpath 下文件的变动, 并且会立即重启应用(发生在保存时机),
         注意: 因为其采用的虚拟机机制, 该项重启是很快的.

    3-2: devtools可以实现页面的热部署(即页面修改之后会立即生效,
         这个可以直接在application.properties文件中配置)





