public class Main {
	
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(4, 3);
		myRectangle.Draw();
		
		myRectangle.setWidth(3);
		myRectangle.Draw();
		
		myRectangle.setWidth(7);
		myRectangle.setHeight(2);
		myRectangle.Draw();
		
		Square mySquare = new Square(5);
		mySquare.Draw();
		
	}
	
}