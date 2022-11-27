import java.io.File;

class Main {
    public static void main(String[] args) {

        // Create a file object fort he current location
        File file = new File("recipes.txt");

        try {

            // trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}