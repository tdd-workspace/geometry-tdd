 class Rectangle {

    int length;
    int breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    static Rectangle createSquare(int side) {
        return new Rectangle(side,side);
     }

     public int findArea() {
        return length * breadth;
    }

    public int findPerimeter() {
        return 2 * (length + breadth);
    }
}
