
public class NameAndAge {

    public static void main(String[] args) {
        nameAndAge(new String[] { "savvas", "20" });
    }

    public static void nameAndAge(String[] args) {
        String name;
        int age;

        if (args.length != 2) {
            System.out.println("name and age are required");
        }else{
            name = args[0];
            age = Integer.parseInt(args[1]);

            System.out.println(name + " " + age + " years old");
        }


    }
}
