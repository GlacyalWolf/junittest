public class Segment {
    private int[] coord1= new int[2];
    private int[] coord2= new int[2];
    private int x2;
    private int y1;
    private int y2;

    public Segment(){}
    public Segment(int x1,int x2,int y1,int y2)throws IllegalArgumentException{
        try {
            if (x1>=0 && y1>=0 && x2>=0 && y2>=0) {
                this.coord1[0] = x1;
                this.coord2[0] = x2;
                this.coord1[1] = y1;
                this.coord2[1] = y2;
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Error");
        }
    }

    public int getX1() {
        return coord1[0];
    }

    public int getX2() {
        return coord2[0];
    }

    public int getY1() {
        return coord1[1];
    }

    public int getY2() {
        return coord2[1];
    }

    public void setX1(int x1) {
        this.coord1[0] = x1;
    }

    public void setX2(int x2) {
        this.coord2[0] = x2;
    }

    public void setY1(int y1) {
        this.coord1[1] = y1;
    }

    public void setY2(int y2) {
        this.coord2[1] = y2;
    }

    public double Longitud(Segment a){
        double longitut;
        longitut=Math.sqrt(Math.pow(this.coord1[0]-this.coord2[0], 2) + Math.pow(this.coord1[1]-this.coord2[1], 2));
        return longitut;
    }



}
