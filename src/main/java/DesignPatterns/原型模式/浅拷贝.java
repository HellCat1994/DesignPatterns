package DesignPatterns.原型模式;
import lombok.Data;
@Data
class Info{

}
@Data
class WeeklyLog1 implements Cloneable{
    private String name;
    private String data;
    private String content;
    private Info info;
    @Override
    public WeeklyLog1 clone(){
        Object object = null;
        try {
            object = super.clone();
            return (WeeklyLog1)object;
        }catch (CloneNotSupportedException e){
            System.out.println("无法复制");
            return null;
        }
    }
}

public class 浅拷贝 {
    public static void main(String[] args) {
        WeeklyLog1 weeklyLog = new WeeklyLog1();
        weeklyLog.setContent("信息");
        weeklyLog.setData("时间");
        weeklyLog.setName("王宏观");
        weeklyLog.setInfo(new Info());
        WeeklyLog1 weeklyLog1 = weeklyLog.clone();
        System.out.println(weeklyLog);
        System.out.println(weeklyLog1);
        System.out.println(weeklyLog==weeklyLog1);
        System.out.println(weeklyLog.getInfo()==weeklyLog1.getInfo());
    }
}
