public class tri_tas {
    public static int gauche(int i){
        return (2*i+1);
    }
    public static int droite(int i){
        return (2*i+2);
    }
    public static void permuter(int [] tab, int i, int j)
    {
        int k = tab[i];
        tab[i] = tab[j];
        tab[j] = k;
    }

    public static void entasserMax(int[] A, int i, int taille)
    {
        int l = gauche(i);
        int r = droite(i);
        int max;
        if((l < taille) && A[l] > A[i])
        {
            max = l;
        }else {
            max = i;
        }
        if((r < taille) && A[r] > A[max])
        {
            max = r;
        }
        if (max != i)
        {
            permuter(A,i,max);
            entasserMax(A,max, taille);
        }
    }

    public static void construireTasMax(int[] A)
    {
        int length = A.length;
        for (int i = length/2 - 1; i >= 0 ; i--) {
            entasserMax(A,i, length);
        }
    }

    public static void triParTas(int[] A)
    {
        int length = A.length;
        construireTasMax(A);
        for (int i = length-1 ; i > 0 ; i--) {
            permuter(A, 0, i);
            entasserMax(A, 0, i);
        }
    }

    public static void main(String[] args) {
        int [] A = {2,8,7,1,3,5,6,4};
        //tri_tas.triParTas(A);
        tri_tas.triParTas(A);
        for (int i : A) {
            System.out.println(i);
        }
        int j = recherchedic.RechercheDichotomique(A, 8, 0, A.length-1);
        System.out.println(j+1);
    }
}
