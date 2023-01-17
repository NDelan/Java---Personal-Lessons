package package1;

public class GetSet {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String c) {
        this.name = c;
    }
    
}

class Program {
    public static void main(String [ ] args) {
        GetSet gs = new GetSet();
        gs.setName("Del");
        System.out.println(gs.getName());
    }
}