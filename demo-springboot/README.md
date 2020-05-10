***本地开发***
当此项目用maven进行构建时，需要使用如下的命令：
clean install -Dmaven.test.skip=true

当在本地使用IDE运行demo-springboot时，需要使用如下的虚拟机参数：
-DLOG_DIR=/var/opt/Example/DemoSpringBoot/
-DLOG_FIL=DemoSpringBoot.log
-DLOG_LEVEL=INFO

***服务器运行***
当在Linux Server上部署时，需要使用如下的虚拟机参数：
-DLOG_DIR=/var/opt/Example/DemoSpringBoot/
-DLOG_FIL=DemoSpringBoot.log
-DLOG_LEVEL=INFO
