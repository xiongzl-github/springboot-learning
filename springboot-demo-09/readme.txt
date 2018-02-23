springboot之Thymeleaf
1. Thymeleaf是什么?
   Thymeleaf是一款用于渲染XML/XHTML/HTML5内容的模板引擎。

2. 如何使用
    2-1: 引入依赖
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>

    2-2: 编写controller
    @Controller
    @RequestMapping("/learn")
    public class LearnResourceController {
        @RequestMapping("/")
        public ModelAndView index(){
            List<LearnResouce> learnList =new ArrayList<LearnResouce>();
            LearnResouce bean =new LearnResouce("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
            learnList.add(bean);
            bean =new LearnResouce("官方SpriongBoot例子","官方SpriongBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
            learnList.add(bean);
            bean =new LearnResouce("龙国学院","Spring Boot 教程系列学习","http://www.roncoo.com/article/detail/125488");
            learnList.add(bean);
            ModelAndView modelAndView = new ModelAndView("/index");
            modelAndView.addObject("learnList", learnList);
            return modelAndView;
        }
    }

    2-3: 编写html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <title>learn Resources</title>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        </head>
        <body>
            <div style="text-align: center;margin:0 auto;width: 1000px; ">
                <h1>学习资源大奉送，爱我就关注嘟嘟公众号：嘟爷java超神学堂（javaLearn）</h1>
                <table width="100%" border="1" cellspacing="1" cellpadding="0">
                    <tr>
                        <td>作者</td>
                        <td>教程名称</td>
                        <td>地址</td>
                    </tr>
                    <!--/*@thymesVar id="learnList" type=""*/-->
                    <tr th:each="learn : ${learnList}">
                        <td th:text="${learn.author}">嘟嘟MD</td>
                        <td th:text="${learn.title}">SPringBoot干货系列</td>
                        <td><a th:href="${learn.url}" target="_blank">点我</a></td>
                    </tr>
                </table>
            </div>
        </body>
        </html>






















