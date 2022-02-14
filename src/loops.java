public class loops {
    public static void main(String[] args) {
        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }
        for(int i = 1; i != 5; i++){
            System.out.println(i);
        }
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello World");
        }
        int x = 1;
        do{
            System.out.println("Once");
        }while(x != 1);
    }
}
