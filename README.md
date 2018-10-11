# MyBatis 逆向工程
 - GeneratorHandler
 - generatorConfig.xml
 
 ### 使用说明
 ```mysql
    /**
      1. 修改 generatorConfig.xml 配置文件的以下属性 
          jdbcConnection 数据库连接信息
          table 需要操作的表信息
                多个表   
                  <table schema="" tableName="user_table1" domainObjectName="UserTable1" />
                  <table schema="" tableName="user_table2" domainObjectName="UserTable2" />
                  ......
          其他属性可选择性修改
      2. 运行 GeneratorHandler 类, 生成对应数据库表的实体类、mapper映射文件及接口文件等                   
    */

```