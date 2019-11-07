public class DieTest {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();

        int sum = 0;
        int dist = 0;

        int sampleSize = 200;

        for (int i = 0; i < sampleSize; ++i){
            dist = 0;
            d1.setFace(1);
            d2.setFace(2);

            while (d1.getFace() != d2.getFace()){
                ++dist;
                d1.roll();
                d2.roll();
            }

            sum += dist;
        }

        double average = (double) sum / (double) sampleSize;

        System.out.println("Average rolls between doubles: "+average);

    }
}
