import java.util.Scanner;
public class enumuration
{
    enum Level{
        low,medium,high
    }


    public static void main(String[] args){
        Level var1 = Level.medium;
        System.out.println(var1); 

        Level var2 = Level.low;
        System.out.println(var2); 

        Level var3 = Level.high;
        System.out.println(var3); 

        Level var = Level.medium;
        Switch(var) {
            case low:
            System.out.println("low level"); 
            break;
            case]medium:
            System.out.println("medium level");
            break;
            case high:
            System.out.println("high level"); 
            break; 
            
        }

    }
    
}
