public class network6_1 {
    public static void main(String args[]) {
        Employee s1 = new Employee("Jack", 'M');
        System.out.println("构造s1 后, 员工人数为: " + Employee.empCount);
        Employee s2 = new Employee("Rose", 'M');
        System.out.println("构造s2 后, 员工人数为: " + Employee.empCount);
        s1.setName("Tom");
        s2.setGender('F');
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
    public static class Employee{
        private String name;
        private char gender;
        static int empCount = 0;

        public Employee(String name, char gender) {
            this.name = name;
            this.gender = gender;
            ++empCount;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return String.format( "Name:%s\tGender:%s",name,gender  );
        }

    }

}
