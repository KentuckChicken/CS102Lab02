public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width)
	{
		if(width < 64)
		{
			this.width = width;
		}
	}
	
	public void setHeight(int height)
	{
		if(height < 64)
		{
			this.height = height;
		}
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void Draw()
	{
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}