package ss6_inheritance.bai_tap.point_and_moveablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float []arr1 = {xSpeed,ySpeed};
        return arr1;
    }

    @Override
    public String toString() {
        return "(" +
                getX() +
                ", " + getY() +
                ')' +
                ",speed = (" + xSpeed +
                ", " + ySpeed +
                ')';
    }
   public MovablePoint Move(){
        setX( getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
   }
 }

