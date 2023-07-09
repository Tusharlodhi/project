public class Account{
    private long accnum;
    private double balance;
    private String accholder;

    public Account(){
        super();
    }

    public Account(long accnnum , double balance , String accholder){
        super();
        this.accum = accnum;
        this.balance = balance;
        this.accholder = accholder;

    }

    public long getaccnum(){
        return accnum;
    }

    public void setaccnum(long accnum){
        this.accnum = accnum;
    }

    public double getbalance(){
        return balance;
    }

    public void setbalance(){
        this.balance = balance;
    }

    public getaccholder(){
        return accholder;
    }

    public void setaccholder(accholder){
        this.accholder = accholder;
    }
    public void deposite(double amt){
        if(accholder.getname().equal("ram"))
        {
            balance=balance+amt;
        }

    }
    public void withdraw(double amt){
        if(accholder.getname().equal("sham"))
        {
            balance = balance - amt;
        }
    }

    public void display(){
        System.out.println(name + accholder.getage()+accnum + balance);
    }
}


public class Accountdemo{
    public static void main(String[]args){
        Account[]acc1 = new savingaccount[2];
        acc1[0] = new savingaccount(1001,2000.0,newperson("ram,20"));
        acc1[1] = new savingaccount(1002,3000.0,newperson("sham,33"));

        System.out.println("beforw any transaction");
        acc1[0].display();
        System.out.println("***************");
        acc1[1].display();
        System.out.println("***************");

        acc1[0].deposite(2000.0);
        acc1[1].withdraw(2000.0);
        System.out.println("after updation");

        acc1[0].display();
        System.out.println("****************");
        acc[1].display();
        System.out.println("****************");
        acc[1].withdraw(900.0);

    }   
}


public class CurrentAaccount extends Account{
    final double overdraftlimit = 20,000;

    public void draw(double amt){
        if(amt < overdraftlimit){
            System.out.println("you can withdraw");
        }
        else{
            System.out.println("you cant withdraw");
        }
    }
}