一. spring boot之返回json数据(fastJson)
    由于spring boot返回数据默认采用的是Jackson, 如果我们想要将其换成fastJson, 那该怎么办了?

二. 有两种方法
    1.
        1-1. 启动类继承extends WebMvcConfigurerAdapter
        1-2. 覆盖方法configureMessageConverters(具体可以参考Main.java)

    2.
        2-1. 使用bean注入HttpMessageConverters(具体可以参考AppStarts.txt)



