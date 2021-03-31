import java.util.Scanner;

public class pipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipe1Total = p1 * hours;
        double pipe2Total = p2 * hours;
        double fullPool = pipe1Total + pipe2Total;

        double fullPoolFinal = (fullPool / v) * 100;
        double resultPipe1 = (pipe1Total * 100) / fullPool;
        double resultPipe2 = (pipe2Total * 100) / fullPool;

        double overflowsPool = fullPool - v;

        // До колко се е запълнил басейна и коя тръба с колко процента е допринесла.
        // if (fullPool < v){
        if (fullPool <= v){
            // {запълненост на басейна в проценти}%
            // System.out.printf("The pool is %.2f %% full. Pipe 1: %.2f %%. Pipe 2: %.2f %%.", fullPool, resultPipe1, resultPipe2);
            System.out.printf("The pool is %.2f %% full. Pipe 1: %.2f %%. Pipe 2: %.2f %%.", fullPoolFinal, resultPipe1, resultPipe2);

        } else if ((pipe1Total + pipe2Total) > v){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, overflowsPool);

        }
    }
}
