import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int project = 3;

        String name = scanner.nextLine();
        int numberProjects = Integer.parseInt(scanner.nextLine());
        int num = project * numberProjects;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, num, numberProjects);

    }
}
