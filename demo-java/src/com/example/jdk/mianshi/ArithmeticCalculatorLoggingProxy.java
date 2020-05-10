package com.example.jdk.mianshi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorLoggingProxy {

    //要代理的对象
    private ArithmeticCalculator target;

    public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
        super();
        this.target = target;
    }

    //返回代理对象
    public ArithmeticCalculator getLoggingProxy() {
        ArithmeticCalculator proxy = null;

        ClassLoader classLoader = target.getClass().getClassLoader();   // 获取类加载器，一般用户定义的类的类加载器都是同一个
        Class[] interfaces = new Class[]{ArithmeticCalculator.class};
        InvocationHandler handler = new InvocationHandler() {
            /**
             * proxy: 代理对象。 一般不使用该对象
             * method: 正在被调用的方法
             * args: 调用方法传入的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                String methodName = method.getName();
                //打印日志
                System.out.println("[before] The method " + methodName + " begins with " + Arrays.asList(args));

                //调用目标方法返回的结果
                Object result = null;

                try {
                    result = method.invoke(target, args);
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }

                //打印日志
                System.out.println("[after] The method ends with " + result);

                return result;
            }
        };

        /**
         * loader: 代理对象使用的类加载器。
         * interfaces: 指定代理对象的类型. 即代理代理对象中可以有哪些方法.
         * h: 当具体调用代理对象的方法时, 应该如何进行响应, 实际上就是调用 InvocationHandler 的 invoke 方法
         */
        proxy = (ArithmeticCalculator) Proxy.newProxyInstance(classLoader, interfaces, handler);

        return proxy;
    }
}