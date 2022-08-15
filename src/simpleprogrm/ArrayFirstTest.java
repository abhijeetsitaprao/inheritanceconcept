package simpleprogrm;

public class ArrayFirstTest
{
    public static void main(String[] args) {

        String[] names =new String[5];

        names[1]="Yogesh";
        names [2]="mohit";
        names [3]="rohit";
        names [4]="rahul";

        for (int i=0; i<names.length; i++){
            System.out.println(names [i]);
        }


    }
}
