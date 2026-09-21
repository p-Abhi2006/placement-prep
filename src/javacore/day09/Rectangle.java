package javacore.day09;

public class Rectangle {
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    Rectangle(){
        length=23;
        width=21;
    }
    public void displaydetails(){
        System.out.println("Length:"+length+"\n"+"Width:"+width);
    }
}

class Main{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,20);
        Rectangle r1=new Rectangle();
        r.displaydetails();
        r1.displaydetails();
    }
}
