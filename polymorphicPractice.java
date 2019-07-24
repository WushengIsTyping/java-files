public class polymorphicPractice{
    public static void main(String[] args) {
        // 创建一个人的收入样本实例
        // 他有普通收入，工资收入，特殊津贴收入
        // 这几种收入采用不同的计税方式
        // 因为Salary和SpecialAllowance是Income的子类，所以Income类的数组中可以有这两种对象
        Income[] incomes = new Income[]{
            new Income(3000),
            new Salary(7500),
            new SpecialAllowance(1500)
        };

        System.out.println(totalTax(incomes));
    }

    // 这个方法用于计算总税金
    // 这个方法必须是static，否则主函数无法调用
    public static double totalTax(Income[] incomes){
        double total = 0;
        for(Income income : incomes){
            total = total + income.getTex();
        }
        return total;
    }

}

// income类
class Income{
    // income类的字段
    protected double income;

    // income类的构造方法，以使Income可以在new的时候就赋值
    public Income(double income){
        this.income = income;
    }

    public double getTex(){
        return income * 0.1;
    }
}

class Salary extends Income{
    // 这个子类没有新的字段，这个例子只是为了说明多态
    public Salary(double income){
        super(income);
    }

    @Override
    public double getTex(){
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class SpecialAllowance extends Income{
    // 这个子类没有新的字段，这个例子只是为了说明多态
    public SpecialAllowance(double income){
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}