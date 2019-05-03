package DesignPatterns.原型模式;
import lombok.Data;
@Data
class WeeklyLog implements Cloneable{
    private String name;
    private String data;
    private String content;

    @Override
    public WeeklyLog clone(){
        Object object = null;
        try {
            object = super.clone();
            return (WeeklyLog)object;
        }catch (CloneNotSupportedException e){
            System.out.println("无法复制");
            return null;
        }
    }
}
public class 原型模式简单实现 {
    public static void main(String[] args) {
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setContent("信息");
        weeklyLog.setData("时间");
        weeklyLog.setName("王宏观");
        WeeklyLog weeklyLog1 = weeklyLog.clone();
        System.out.println(weeklyLog);
        weeklyLog1.setName("宋非");
        System.out.println(weeklyLog1);
    }
}
