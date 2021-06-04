package singleton;

/**
 * Author: yunCrush
 * Date: 2021/6/4 16:05
 * Description: 静态内部类实现单例模式
 * 外部类没有static，在类加载的时候并不会立即加载对象
 * 只有在真正调用getInstance实例时，才会new一个对象,static final保证了instance的线程安全
 */
public class SingletonInnerClass {
    static class Singleton{
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }
    public  SingletonInnerClass(){

    }
    public static  SingletonInnerClass getInstance(){
        return Singleton.instance;
    }
}
