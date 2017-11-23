import java.util.Random;

public class Controller {

    private static final int POST = 0;
    private static final int GET = 1;
    private static final int PUT = 2;
    private static final int DELETE = 3;

    private static User someUser;
    private static Post somePost;

    private static int getRandomRequest() {
        return (int) (Math.random() * 4);
    }

    private static String generateName() {
        Random rnd = new Random();
        String firstname = "James";
        String lastname = "Bond";
        String result;

        result = Character.toString(firstname.charAt(0)); // First char
        if (lastname.length() > 5)
            result += lastname.substring(0, 5);
        else
            result += lastname;
        result += Integer.toString(rnd.nextInt(99));
        return result;
    }

    private static Object getRandomIncomingObject() {
        Object someObject;
        Random rand = new Random();
        int _id = rand.nextInt(500) + 1;
        if ((Math.random() * 2) > 1) {
            someObject = new User();
            ((User) someObject).setId(_id);
        } else {
            someObject = new Post();
            ((Post) someObject).setId(_id);
        }
        return someObject;
    }

    public static void main(String[] args) {
        int method = getRandomRequest();
        Object obj = getRandomIncomingObject();

        switch (method) {
            case POST:
                if (obj instanceof User) {
                    ((User) obj).setName(generateName());
                    System.out.println(((User) obj).getEmail());
                } else {
                    ((Post) obj).setAuthor(generateName());
                    System.out.println(((Post) obj).getAuthor());
                }
                break;
            case PUT:
                if (obj instanceof User) {
                    ((User) obj).setName(generateName());
                    ((User) obj).save();
                    System.out.println(((User) obj).getEmail());
                } else {
                    ((Post) obj).setAuthor(generateName());
                    ((Post) obj).save();
                    System.out.println(((Post) obj).getAuthor());
                }
                break;
            case DELETE:
                if (obj instanceof User) {
                    ((User) obj).delete();
                    System.out.println(((User) obj).isDeleted());
                } else {
                    ((Post) obj).delete();
                    System.out.println(((Post) obj).isDeleted());
                }
                break;
            default:
                if (obj instanceof User) {
                    System.out.println(((User) obj).getEmail());
                } else {
                    System.out.println(((Post) obj).getAuthor());
                }
                break;
        }
    }
}
