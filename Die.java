public class Die {
    private int face;

    public Die(){
        roll();
    }

    public void roll(){
        face = (int) (Math.random() * 6 + 1);
        return;
    }

    public String toString(){
        return "" + face;
    }

    public int getFace(){
        return face;
    }

    public void setFace(int x){
        face = x;
        return;
    }


}
