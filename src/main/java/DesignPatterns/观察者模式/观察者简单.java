package DesignPatterns.观察者模式;
import lombok.Data;
import java.util.ArrayList;
/**
 * 观察者接口
 */
interface Observer{
    void operate(String msg);
}
/**
 * 具体观察者的操作
 */
@Data
class ConObserver implements Observer{
    private String name;
    public ConObserver(String name) {
        this.name = name;
    }
    @Override
    public void operate(String msg) {
        System.out.println(name+"收到消息："+msg);
    }
}
/**
 * 目标对象
 */
abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList();
    /**
     * 观察者集合中添加观察者
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 观察集合中移除观察者
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知方法
     * @param msg
     */
    public abstract void know(String msg);
}

/**
 * 具体目标对象
 */
class ConSubject extends Subject{
    @Override
    public void know(String msg) {
        for(Observer observer:observers){
            observer.operate(msg);
        }
    }
}
public class 观察者简单 {
    public static void main(String[] args) {
        ConObserver O1 = new ConObserver("观察者1号");
        ConObserver O2 = new ConObserver("观察者2号");
        Subject conSubject = new ConSubject();
        conSubject.attach(O1);
        conSubject.attach(O2);
        conSubject.know("下午开会");

    }
}
