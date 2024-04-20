public class tri_rapide {
    public static void permuter(int [] tab, int i, int j)
    {
        int k = tab[i];
        tab[i] = tab[j];
        tab[j] = k;
    }

    public static int partition(int [] tab, int p, int r)
    {
        int i =p-1;
        int x = tab[r];
        for (int j = p; j < r; j++) {
            if (tab[j] <= x) {
                i = i + 1;
                if ((i!= j)) {
                    permuter(tab, i, j);
                }
            }
        }
        permuter(tab,i+1,r);
        return i+1;
    }
    public static int[] tri_rapide(int [] tab, int p, int r)
    {
        int q;
        if(p < r){
            q = partition(tab, p, r);
            tri_rapide(tab, p, q-1);
            tri_rapide(tab, q+1, r);
        }
        return tab;
    }

}
