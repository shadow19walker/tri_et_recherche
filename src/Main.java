public class Main {


    public static void main(String[] args) {
        int [] A = {2,8,7,1,3,5,6,4};
        //tri_tas.triParTas(A);
        tri_rapide.tri_rapide(A,0,A.length-1);
        for (int i : A) {
            System.out.println(i);
        }
       int j = recherchedic.RechercheDichotomique(A, 8, 0, A.length-1);
        System.out.println(j+1);
    }
}