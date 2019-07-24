/**
 * This file is for java concepts practice.
 * Including class, method, public, private...
 */

public class conceptPractice{
    public static void main(String[] args) {

        Person Wusheng = new Person();
        Wusheng.setName("Wusheng");
        Wusheng.setBirth(1997);
        System.out.println(Wusheng.getAge());


        Girlfriend Wusheng2 = new Girlfriend("Wusheng", 130);
        System.out.println("Wusheng weights " + Wusheng2.getWeight() + ".");

        Son Yuchen = new Son("Yuchen", 1996, 160);
        System.out.println("My son is " + Yuchen.getName() + ", he is " + Yuchen.height + "cm.");
    }
    
}

// 3. 面向对象
class Person{
    private String name;
    private int birth;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBirth(){
        return this.birth;
    }

    public void setBirth(int birth){
        this.birth = birth;
    }

    private int calcAge(int currentYear){
        return currentYear-this.birth;
    }

    public int getAge(){
        return calcAge(2019);
    }
}

// 4. 构造函数
class Girlfriend{
    private String name;
    private int weight;

    // 构造函数需与类同名
    public Girlfriend(String name, int weight){
        this.name = name;
        if (weight < 120 & weight > 80) {
            this.weight = weight;
        }else{
            System.out.println("Bullshit.");
            this.weight = 100;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

}


// 5. 继承
class Father{
    protected String name;
    protected int birth;

    public Father(String name, int birth){
        this.name = name;
        this.birth = birth;
    }

    public String getName(){
        return this.name;
    }

    public int getBirth(){
        return this.birth;
    }
    
}

class Son extends Father{
    protected int height;
    // protected Father father1; //子类可用持有父类的实例

    public Son(String name, int birth, int height){
        super(name, birth);
        this.height = height;
    }

}


