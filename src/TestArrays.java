import java.util.*;
public class TestArrays{
    public static void main(String[] args) {
double[] tab = new double [10];
for (int i=0; i<tab.length;i++){
    tab[i]=Math.random()*100;
}
Arrays.sort(tab);
int pos = Arrays.binarySearch(tab,65);
if (pos >= 0)
System.out.println("position de 45 : " + pos);
else {
System.out.println(" 45 n ’est pas dans le tableau ");
System.out.println("position d ’insertion : " + (-(pos+1)));
}
for (int i=0; i<tab.length;i++)
System.out.println( tab[i] + " ");
    }
    }