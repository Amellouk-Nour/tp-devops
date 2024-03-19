package org.example;

public class Point {
    private double x ;
    private double y ;
    public Point ( double x , double y ) {
        super ( ) ;
        this.x = x ;
        this.y = y ;
    }
    public double getX ( ) {
        return x ;
    }
    public void setX ( double x ) {
        this.x = x ;
    }
    public double getY ( ) {
        return y ;
    }
    public void setY ( double y ) {
        this.y = y ;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }
    public Point translater ( double dx , double dy ) {
        return new Point ( this.getX( ) + dx, this.getY() + dy ) ;
    }

}
