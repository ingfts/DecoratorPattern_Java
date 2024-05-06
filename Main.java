public class Main {
    public static void main(String[] args) {
        House house = new BasicHouse();
       house.build();

       House garden = new Garden(new BasicHouse());
       garden.build();


       House pool = new Pool(new BasicHouse());
       pool.build();
    }
}
