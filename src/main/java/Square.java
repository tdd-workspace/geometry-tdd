public class Square {
    int side;
    public Square(int side){
        this.side = side;
    }
    public int findArea() {
        return side * side;
    }

    public int findPerimeter() {
        return 4 * side;
    }
}
