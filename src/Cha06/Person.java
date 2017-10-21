package Cha06;

public class Person {
    private static String name;
    private static String sex;
    private static String job;
    private static int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Person setJob(String job) {
        this.job = job;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }
    public static void main(String[] args){
        Person person = new Person().setName("fog")
                .setAge(11)
                .setSex("man")
                .setJob("no job");
        System.out.println(name+" "+age+" "+sex+" "+job);
    }
}
