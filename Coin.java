public class Coin{

  private int face;

  private final int HEADS = 0;
  private final int TAILS = 0;

  public Coin(){
    flip();
  }

  public void flip(){
    face = (int) (Math.random() * 2);
  }

  public boolean isHeads(){
    return (face == HEADS);
  }

  // prints info about current state of coin
  public String toString(){
    String result = "";

    if (face == HEADS){
      result = "HEADS";
    }

    else{
      result = "TAILS";
    }

    return result;
  }
}
