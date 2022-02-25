package reflect;

/**
 * 使用当前类测试反射机制
 */
public class Person {
    private String name = "张三";
    private int age = 22;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println(name+":"+"hello!");
    }
    public void sayHi(){
        System.out.println(name+":"+"hi!");
    }
    public void sayGoodBye(){
        System.out.println(name+":"+"bye!");
    }
    public void dosome(String thing){
        System.out.println(name+":正在"+thing);
    }
    public void dosome(String thing,int sum){
        for(int i=0;i<sum;i++) {
            System.out.println(name + ":正在" + thing);
        }
    }
    private void secret(){//secret:秘密
        System.out.println(name+":这是我的私有方法!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}






