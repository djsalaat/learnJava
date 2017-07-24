public class HelloWorld {
    public static void main(String[] args){

        FizzBuzz fizzBuzz = new FizzBuzz(20);
        System.out.println("Hello World JSalaat!");

        fizzBuzz.getFizzBuzz();

    }

    public static class FizzBuzz {

        public int limit;

        public FizzBuzz (int limit){
            this.limit = limit;
        }

        public void getFizzBuzz(){
            for (int i = 1; i <= limit; i++){
                if (i % 5 == 0 && i % 3 == 0){
                    System.out.println("FizzBuzz");
                }
                else if(i % 5 == 0){
                    System.out.println("Buzz");
                }
                else if(i % 3 == 0){
                    System.out.println("Fizz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }

}