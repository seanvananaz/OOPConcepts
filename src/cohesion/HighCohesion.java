package cohesion;

// high cohesive behavior
class Name {
    String name;
    public String getName(String name)
    {
        this.name = name;
        return name;
    }
}

class Age {
    int age;
    public int getAge(int age)
    {
        this.age = age;
        return age;
    }
}

class Number {
    int mobileno;
    public int getNumber(int mobileno)
    {
        this.mobileno = mobileno;
        return mobileno;
    }
}

public class HighCohesion {
    public static void main(String[] args)
    {
        Name n = new Name();
        System.out.println(n.getName("Mark David"));
        Age a = new Age();
        System.out.println(a.getAge(18));
        Number no = new Number();
        System.out.println(no.getNumber(1234567891));
    }
}
