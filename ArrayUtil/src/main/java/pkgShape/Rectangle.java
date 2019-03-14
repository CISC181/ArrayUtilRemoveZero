package pkgShape;

public class Rectangle {

	private int iWidth;
	private int iLength;
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
}
