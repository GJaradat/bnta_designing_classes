public class Rectangle {

    //INSTANCE VARIABLES
    private int width;

    private int length;

    //CONSTRUCTOR
    public Rectangle(int inputWidth,int inputLength){
        this.width = inputWidth;
        this.length = inputLength;

    }

    //GETTERS AND SETTERS
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    //METHODS
    public int calculateArea(){
        return this.width * this.length;
    }

    public boolean isSquare(){
        return this.width == this.length;
    }
}
