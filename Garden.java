public class Garden extends HouseDecorator{
    public Garden (House house){
        super(house);

    }

    @Override

    public void build(){
        System.out.println("Building the garden:");
        System.out.println("      /\\      /\\      /\\      /\\      /\\\n" +
                "     /  \\    /  \\    /  \\    /  \\    /  \\\n" +
                "    /    \\  /    \\  /    \\  /    \\  /    \\\n" +
                "   /______\\/______\\/______\\/______\\/______\\\n" +
                "   |      ||      ||      ||      ||      |\n" +
                "   |      ||      ||      ||      ||      |\n" +
                "   |______||______||______||______||______|\n");
    }
}
