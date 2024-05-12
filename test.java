import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;

public class test {
    //1-100的和
    ///1-100偶数的和
    //1-100奇数的和
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        int sumOdd=0;
        int sumEve = 0;
        while(i<=100){
            if(i%2 == 0){
                sumEve += i;

            }else{
                sumOdd += i;
            }
            sum += i;
            i++;

        }
        System.out.println(sum);
        System.out.println(sumOdd);
        System.out.println(sumEve);
    }

}
