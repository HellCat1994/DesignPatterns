package DesignPatterns.适配器模式;
interface Duck {
    public void quack();
    public void fly();
}

class GreenHeadDuck implements Duck {
    @Override
    public void quack() {
        System.out.println(" Ga Ga");
    }
    @Override
    public void fly() {
        System.out.println("I am flying a long distance");
    }
}
interface Turkey {
    public void gobble();
    public void fly();
}
class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        // TODO Auto-generated method stub
        System.out.println(" Go Go");
    }
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("I am flying a short distance");
    }
}
class TurkeyAdapter implements Duck {
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey)
    {
        this.turkey=turkey;
    }
    @Override
    public void quack() {
        // TODO Auto-generated method stub
        turkey.gobble();
    }
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        for(int i=0;i<6;i++)
        {
            turkey.fly();
        }
    }

}
public class 适配器简单示例 {
    public static void main(String[] args) {
        GreenHeadDuck duck=new GreenHeadDuck();
        WildTurkey turkey=new WildTurkey();
        Duck duck2turkeyAdapter=new TurkeyAdapter(turkey);
        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        duck2turkeyAdapter.quack();
        duck2turkeyAdapter.fly();
    }
}
