package Main;

public class Person {
    String Lname, Fname;
    int age;
    double Height, Weight;
    String PersonType;
    public Person(){}
    public Person(String Lname, String Fname, int age, double Height, double Weight, String PersonType)
    {
        this.Lname= Lname;
        this.Fname= Fname;
        this.age=age;
        this.Height= Height;
        this.Weight= Weight;
        this.PersonType= PersonType;
    }
    public String getLname() {
        return Lname;
    }
    public String getFname() {
        return Fname;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return Height;
    }
    public double getWeight() {
        return Weight;
    }
    public String getPersonType() {
        return PersonType;
    }
    public double getBMI()
        {

            double meter = this.Height /100;
            double BMI = this.Weight /(meter*meter);
            return BMI;
        }
    public String getFullname()
    {

        return this.Lname+this.Fname;
    }
    @Override
    public String toString()
    {
        return String.format("Name: %s, %s\tAge: %d\t\tHeight: %s\tWeight: %s\tBody Mass Index: %f\tType: %s", this.Lname, this.Fname, this.age,this.Height,this.Weight,this.getBMI(),this.PersonType);
    }
}
