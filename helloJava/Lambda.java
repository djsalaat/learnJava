/**
 * Created by Junaid Salaat.
 */

interface Executable{
    int execute(int a);
}

interface StringExecutable{
    void execute(String a);
}

class Runner{
    public void run(Executable e){
        System.out.println("START Runner");
        e.execute(4);
        System.out.println("STOP Runner");
    }
}

public class Lambda{
    public static void main(String [] args){
        Runner runner = new Runner();
        runner.run(new Executable() {
            public int execute(int a) {
                System.out.println("In exe");
                System.out.println(a);
                return a;
            }
        });

        System.out.println("=========================");

        runner.run((a) -> {
            System.out.println("In lambda Exe");
            System.out.println(a);
            return a;
        });
    }
}