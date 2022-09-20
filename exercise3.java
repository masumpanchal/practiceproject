import java.util.Arrays;

public class exercise3 {
    public static void main(String[] args){
        int a[]= new int[]{3, 4, 5, 6};
        int b[]= new int[]{1, 2, 3, 4};
        int c[]= new int[a.length+ b.length];
        int d[]= new int[15];
        int j=0, k=0;

        for (int i=0; i<c.length; i++){
            if (i%2 == 0)
            c[i]=a[j++];
            else
            c[i]=b[k++];
        }
        for (int i=0; i< c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();

        for (int i=0; i<d.length; i++){
            if ()


        }
        /*System.out.print(a[0]+b[0]+" ");
        System.out.print(a[1]+b[0]+" ");
        System.out.print(a[2]+b[0]+" ");
        System.out.print(a[3]+b[0]+" ");*/



    }

}

