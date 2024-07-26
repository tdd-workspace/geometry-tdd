import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Nested
    class RectangleArea {
        @Test
        void toReturnAreaAsSixWhenLengthIsTwoAndBreadthIsThree() {

            Rectangle rectangle2x3 = new Rectangle(2, 3);
            int expectedAreaValue = 6;

            int actualAreaValue = rectangle2x3.findArea();

            assertEquals(expectedAreaValue, actualAreaValue);
        }
    }
    @Nested
    class RectanglePerimeter {
        @Test
        void toReturnPerimeterAsSixteenWhenLengthIsThreeAndBreadthIsFive() {

            Rectangle rectangle3x5 = new Rectangle(3, 5);
            int expectedPerimeterValue = 16;

            int actualPerimeterValue = rectangle3x5.findPerimeter();

            assertEquals(expectedPerimeterValue, actualPerimeterValue);
        }
    }

    @Nested
    class SquareArea{
        @Test
        void toReturnAreaAsSixteenWhenAreaIsFour(){

            Square square4x4 = new Square(4);
            int expectedAreaValue = 16;

            int actualAreaValue = square4x4.findArea();

            assertEquals(expectedAreaValue, actualAreaValue);
        }
    }
    @Nested
    class SquarePerimeter{
        @Test
        void toReturnAreaAsTwelveWhenAreaIsThree(){

            Rectangle square3x3 = Rectangle.createSquare(3);
            int expectedPerimeterValue = 12;

            int actualPerimeterValue = square3x3.findPerimeter();

            assertEquals(expectedPerimeterValue, actualPerimeterValue);
        }
    }
}
