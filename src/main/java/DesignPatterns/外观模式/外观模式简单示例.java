package DesignPatterns.外观模式;

public class 外观模式简单示例 {
    public static void main(String[] args) {
        HomeTheaterFacade mHomeTheaterFacade=new HomeTheaterFacade();
        mHomeTheaterFacade.ready();
        mHomeTheaterFacade.play();
    }
}
