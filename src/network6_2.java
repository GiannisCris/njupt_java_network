public class network6_2 {
    public static void main(String args[]) {
        Student s1 = new Student("001", "9801", "张三", "男", 24);
        System.out.println("构造s1 后, 班级人数为: " + Student.getCount());
        Student s2 = new Student("002", "9801", "李四", "女", 21);
        System.out.println("构造s2 后, 班级人数为: " + Student.getCount());
        s1.setName("王平");
        s2.setAge(19);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        if (s1.getAge() > s2.getAge())
            System.out.println("年龄较大人的名字为：" + s1.getName());
        else
            System.out.println("年龄较大人的名字为：" + s2.getName());
    }
}
// 请在本行之后添加你的代码内容
class Student {
    private String studentID;
    private String clssID;
    private String name;
    private String sex;
    private int age;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Student(String studentID, String clssID, String name, String sex, int age) {
        this.studentID = studentID;
        this.clssID = clssID;
        this.name = name;
        this.sex = sex;
        this.age = age;
        count++;
    }

    @Override
    public String toString() {
        return String.format( "学号：%s\t班号：%s\t姓名：%s\t性别：%s\t年龄：%d",studentID,clssID,name,sex,age );
    }

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

    public static void setCount(int count) {
        Student.count = count;
    }
}
