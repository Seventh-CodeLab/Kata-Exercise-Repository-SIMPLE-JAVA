public class CheckXYZ {
    public static Boolean containDiff(int x, int y, int z){
        if (x == y || y == z){
            return false;
        } else {
            return true;
        }
    }

    public static Boolean notContainEqual(int x, int y, int z){
        if (x != y && y != z && z != x){
            return true;
        } else {
            return false;
        }
    }

    public static Boolean twoEqual(int x, int y, int z){
        if (x == y || y == z || z == x){
            return true;
        } else {
            return false;
        }
    }
}
