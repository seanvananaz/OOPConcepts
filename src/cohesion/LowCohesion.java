package cohesion;

// high cohesive behavior
class UserInfo {
    String name;
    int age;
    int mobileno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }
}

public class LowCohesion {
    public static void main(String[] args)
    {
        UserInfo user = new UserInfo();
        user.setName("Mark David");
        user.setAge(45);
        user.setMobileno(12312432);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getMobileno());
    }
}
