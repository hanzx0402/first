1、创建一个maven web工程：服务的提供者
2、创建一个实体bean查询的结果
3、提供一个服务器接口：xxx
4、实现这个服务器接口：xxxImpl
5、配置dubbo服务器提供者的核心配置文件
    1)声明dubbo服务器提供者的名称：保证唯一
    2)声明dubbo使用的协议和端口号
    3)暴露服务，使用直连方式
6、添加监听器