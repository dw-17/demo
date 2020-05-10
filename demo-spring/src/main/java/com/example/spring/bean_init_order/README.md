 ##spring bean初始化结论##
1.spring的xml文件创建bean按照顺序自上而下，如果有依赖的bean，那么将先创建依赖的bean。
2.若创建的bean里面有初始化方法，并且初始化方法执行完了后，才能创建下一个bean。
3.初始化方法执行的顺序为：Constructor > @PostConstruct >InitializingBean > init-method。
4.若初始化方法里面有其他线程的参与，那么初始化方法将不会等待其他线程处理完毕，而是仅仅看本线程是否处理完毕。


##测试启动步骤##
BeanInitOrderTest.java文件--->Run As