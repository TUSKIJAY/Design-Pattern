package Cha07;
//实现想转换成的类型接口
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    //取得要适配的对象引用
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    //实现接口中的所有方法
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0;i < 5;i++){
            turkey.fly();
        }
    }
}
