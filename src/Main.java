import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static double DigFun(double n){
        String num = String.format("%.0f",n);
        double counter = 1;
        double size = num.length();
        while (n != size){
            n = size;
            size = String.valueOf(n).length() -2;
            counter++;
        }
        return counter;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        String check = s.nextLine();
        while(!check.equals("END")){
            input.add(check);
            check = s.next();
        }
        for(int i = 0 ; i<input.size(); i++){
            double ans = (DigFun(Double.parseDouble(input.get(i))));
            System.out.format("%.0f \n", ans);
        }
    }
}