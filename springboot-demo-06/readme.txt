springboot-定时任务
1. 在springboot 的主类加入@EnableScheduling注解, 启用定时任务配置

2. 创建定时任务实现类 @Scheduled(fixedRate = 5000), 指定执行频率

3. @Scheduled的使用
   3-1: @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行

   3-2: @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行

   3-3: @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次

   3-4: @Scheduled(cron="*/5 * * * * *") ：通过cron表达式定义规则(每五秒执行一次)
        cron表达式中的*号依次表达的是: 秒, 分, 时, 日, 月, 星期, 年(可选)

3. 详情可参见http://blog.csdn.net/winter_chen001/article/details/78508421









