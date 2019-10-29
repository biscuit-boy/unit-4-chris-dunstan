/*
Creates and tests instances of Coin class
*/
public class CoinTest{
  public static void main(String[] args){
    Coin myCoin = new Coin();

    int numHeads = 0;

    for (int i = 0; i < 10; i++){
      myCoin.flip();

      if (myCoin.toString() == "HEADS"){
        numHeads++;
      }
    }

    System.out.println(numHeads);
  }
}
