package DesignPatterns.单例模式;

/**
 * 加载类时，就初始化对象
 * 线程不安全
 */
class SingletonOne {
    private static SingletonOne instance = new SingletonOne();
    private SingletonOne (){}
    public static SingletonOne getInstance() {
        return instance;
    }
}
public class 饿汉式 {
    public static void main(String[] args) {
        SingletonOne.getInstance();
    }
}
