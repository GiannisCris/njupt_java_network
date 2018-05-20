public class network7_1 {
    // 编写Main类，生成若干实例并验证程序的功能，请勿改动Main类的定义内容。

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(2.5, 3);
        System.out.printf("该圆柱体的表面积为：%.2f\n",cy.getArea());
        System.out.printf("该圆柱体的体积为：%.2f\n",cy.getVolume());
    }
}
// 请在本行之后添加你的代码内容
class Circle{
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}

class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
    public double getVolume(){
        return 3.14*radius*height*radius;

    }
}
