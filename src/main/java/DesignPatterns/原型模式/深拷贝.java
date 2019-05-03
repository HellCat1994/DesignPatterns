package DesignPatterns.原型模式;
import lombok.Data;

import java.io.*;

@Data
class Info1 implements Serializable {
    private String name;
}

@Data
class WeeklyLog2 implements Serializable{
    private String name;
    private String data;
    private String content;
    private Info1 info;
    public WeeklyLog2 deepClone() throws ClassNotFoundException,IOException{
        ByteArrayOutputStream byteArrayOutputStream=  new ByteArrayOutputStream();
        ObjectOutputStream  outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(this);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (WeeklyLog2)objectInputStream.readObject();
    }
}

public class 深拷贝 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLog2 weeklyLog = new WeeklyLog2();
        weeklyLog.setContent("信息");
        weeklyLog.setData("时间");
        weeklyLog.setName("王宏观");
        weeklyLog.setInfo(new Info1());
        WeeklyLog2 weeklyLog1 = weeklyLog.deepClone();
        System.out.println(weeklyLog);
        System.out.println(weeklyLog1);
        System.out.println(weeklyLog==weeklyLog1);
        System.out.println(weeklyLog.getInfo()==weeklyLog1.getInfo());
    }
}
