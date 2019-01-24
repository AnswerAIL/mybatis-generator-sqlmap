# MyBatis 逆向工程
 - GeneratorHandler
 - generatorConfig.xml
 
 ### 使用说明
 ```mysql
    /**
      1. 修改 generatorConfig.xml 配置文件的以下标签 
          jdbcConnection 数据库连接信息
          table 需要操作的表信息
                多个表   
                  <table schema="" tableName="user_table1" domainObjectName="UserTable1" />
                  <table schema="" tableName="user_table2" domainObjectName="UserTable2" />
                  ......
          其他标签可选择性修改
      2. 运行 GeneratorHandler 类, 生成对应数据库表的实体类、mapper映射文件及接口文件等                   
    */

```

***
### 如果觉得该项目对你有帮助， 请随意打赏， 谢谢支持
##### [微信](https://github.com/AnswerAIL/answer-ai-repositories/blob/master/pay/wx.jpg)
<img src="https://github.com/AnswerAIL/answer-ai-repositories/blob/master/pay/wx.jpg"  height="230" width="240">

&nbsp;

##### [支付宝](https://github.com/AnswerAIL/answer-ai-repositories/blob/master/pay/zfb.png)
<img src="https://github.com/AnswerAIL/answer-ai-repositories/blob/master/pay/zfb.png"  height="230" width="240">
