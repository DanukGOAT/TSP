public class City {
 
    private int x;
    private int y;
 
    public City() {
        this.setX((int) (Math.random() * 500));
        this.setY((int) (Math.random() * 500));
    }
 
    public double distanceToCity(City city) {
        int x = Math.abs(this.getX() - city.getX());
        int y = Math.abs(this.getY() - city.getY());
        return 0.0+x+y;
        //return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
 
}