1.SpringBoot是SpringMVC的升级版,没有必然联系.

2.SpringBoot的特点:

    化繁为简,简化配置

    备受关注,下一代框架

    微服务的入门级微框架

3. springboot
   ^
   springcloud
   ^
   微服务

4. 启动方式:
   a.idea启动
   b.项目目录下:mvn spring-boot:run
   c.项目目录下:mvn install
      项目目录/target:java -jar springbootexample-0.0.1-SNAPSHOT.jar
      or:java -jar springbootexample-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod

5.

    @Controller(处理http请求)

    @RestController(Spring4之后新加的注释,原来返回json需要@ResponseBody配合@Controller)

    @RequestMapping(配置url映射)

    @PathVariable(获取url中的数据)

    @RequestParam(获取请求参数的值)

    @GetMapping(组合注解)    

6.JPA(Java Persistence API)定义了一系列对象持久化的标准,目前实现这一规范的产品有Hibernate. TopLink等.
