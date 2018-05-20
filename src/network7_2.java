public class network7_2 {
    public static void main(String args[]) { // main方法的
        Box box1 = new Box(5, 6, 9); // 生成实例对象box
        Box box2 = new Box();
        System.out.println(box1 + "的体积：" + String.format("%.1f",box1.getVolume())); // 调用println方法
        System.out.println(box2 + "的体积：" + String.format("%.1f",box2.getVolume()));
    }
}

class Box{
    private double length,width,height;
    public Box(double length,double width,double height){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Box(){
        this.length = 3;
        this.width = 4;
        this.height = 5;
    }


    public double getHeigth() {
        return height;
    }

    public void setHeigth(double heigth) {
        this.height = heigth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getVolume(){
        return height*width*length;
    }

    @Override
    public String toString() {
        return String.format("边长为%.2f,%.2f,%.2f的长方体", this.height,this.length,this.width);
    }
}
