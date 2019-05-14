

public class songuyento {
    public static void main(String[] args) {
        int number = 2;
        for(number = 2; number < 100; number ++) {
            kiemtra(number);
        }

    }
    public static void kiemtra(int number){
        int i = 2;
        boolean check = true;
        while (i <= Math.sqrt(number)){
            if(number % i == 0) {
                check = false;
                break;
            }
            i ++;
        }

        if (check) {
            System.out.println(number);
        }
    }
}
