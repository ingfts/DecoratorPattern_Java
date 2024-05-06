public class Pool extends HouseDecorator{

    public Pool(House house){
        super(house);
    }

    @Override
    public void build(){
        System.out.println("Building the pool");
        System.out.println("  ~~~~~~~\n" +
                "  |      |\n" +
                "  |      |\n" +
                "  |      |\n" +
                "  |      |\n" +
                "  |      |\n" +
                "~~~~~~~~~~\n");
    }
}
