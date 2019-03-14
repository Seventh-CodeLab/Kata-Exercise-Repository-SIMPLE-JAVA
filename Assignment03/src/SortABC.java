public class SortABC {
    public static int[] getSort(int a, int b, int c, boolean descending){
        // Assumes no values are the same
        int[] sorted = new int[3];
        if (descending){
            if (a > b && a > c){
                sorted[0] = a;
                if(b > c){
                    sorted[1] = b;
                    sorted[2] = c;
                } else {
                    sorted[1] = c;
                    sorted[2] = b;
                }
            } else if ( b > a && b > c){
                sorted[0] = b;
                if(a > c){
                    sorted[1] = a;
                    sorted[2] = c;
                } else {
                    sorted[1] = c;
                    sorted[2] = a;
                }
            } else {
                sorted[0] = c;
                if(b > a){
                    sorted[1] = b;
                    sorted[2] = a;
                } else {
                    sorted[1] = a;
                    sorted[2] = b;
                }
            }
        } else {
            if (a < b && a < c){
                sorted[0] = a;
                if(b < c){
                    sorted[1] = b;
                    sorted[2] = c;
                } else {
                    sorted[1] = c;
                    sorted[2] = b;
                }
            } else if ( b < a && b < c){
                sorted[0] = b;
                if(a < c){
                    sorted[1] = a;
                    sorted[2] = c;
                } else {
                    sorted[1] = c;
                    sorted[2] = a;
                }
            } else {
                sorted[0] = c;
                if(b < a){
                    sorted[1] = b;
                    sorted[2] = a;
                } else {
                    sorted[1] = a;
                    sorted[2] = b;
                }
            }
        }
        return sorted;
    }
}
