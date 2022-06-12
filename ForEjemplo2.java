public class ForEjemplo2{
    public static void main (String[] args) {

        for (int i=1; i<=10; i+=1){
            for (int j=1; j<=10; j+=1){
                if(i==2 && j==2){
                    System.out.print("[*]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}