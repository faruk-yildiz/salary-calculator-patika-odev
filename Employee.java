public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public void tax(){
        double tax=0;
        if(this.salary<1000)
            tax=0;
        else
            tax=this.salary*0.03;
        System.out.println("Vergi miktarı :"+tax);
    }
    public void bonus(){
        double bonus=0;
        if(this.workHours>40){
            bonus=(this.workHours-40)*30.0;
        }
        System.out.println("Bonus miktarı :"+bonus);
    }
    public void raiseSalary(){
        int diff=2021-this.hireYear;
        double artis=0.0;
        if(diff>20){
            artis=this.salary*0.15;
            this.salary=this.salary+artis;
        }
        else if(diff<20 && diff>10){
            artis=this.salary*0.10;
            this.salary=this.salary+artis;
        }
        else if(diff<10)
        {
            artis=this.salary*0.05;
            this.salary=this.salary+artis;
        }
        System.out.println("Maaş Artışı :"+artis);

    }

    @Override
    public String toString() {
        return "Adı :"+this.name+"\n"+"Maaşı :"+this.salary+"\n"+"Çalışma Saati :"+workHours+"\n"+"Başlangıç Yılı :"+hireYear;
    }
}

