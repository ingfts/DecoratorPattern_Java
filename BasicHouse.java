public class BasicHouse implements House{

    @Override
    public void build(){
        System.out.println("This is a basic house built with the decorator pattern:");
        System.out.println("    /\\\n" +
                "   /  \\\n" +
                "  /    \\\n" +
                " /      \\\n" +
                "/________\\\n" +
                "|   __   |\n" +
                "|  |  |  |\n" +
                "|__|__|__|\n" +
                "  [====]\n");

    }
}
