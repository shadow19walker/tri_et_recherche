public class recherchedic {
    public static int RechercheDichotomique(int[] A, int search,int debut, int fin)
    {
        int i=-1;
        int length;
        if(debut > fin)
        {
            return i;
        }
        if(debut == fin)
        {
            if(A[debut] == search)
            {
                return debut;
            }else {
                return i;
            }
        }
        length = debut + (fin -debut)/2;

        if(A[length] == search)
        {
            return length;
        }else {
            if (A[length] < search) {
                i = RechercheDichotomique(A, search, length+1, fin);
            }else {
                i = RechercheDichotomique(A, search, debut, length-1);
            }
        }
        return i;
    }
}
