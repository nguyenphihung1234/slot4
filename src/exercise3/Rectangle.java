package exercise3;

public class Rectangle {
private int height;
private int width ;
public Rectangle(int height, int width) {
    this.height=height;
    this.width=width;
}
public  void display() {
    for(int i =0; i < width;i++){
        for(int j=0; j< height;j++){
            System.out.print("#");
        }
        System.out.println();
    }
}
   public  int getArea(){
       return height * width;
   }
    public int getPerimeter() {
        return 2 * (height + width);
    }
   public void  setHeight(int height){
              this.height =height;
   }
    public void  setWidth(int width){
        this.width = width;
    }
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}

