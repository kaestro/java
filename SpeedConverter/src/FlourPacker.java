public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int big = 5, small = 1;
        int required_big = goal / big;
        int required_small = goal % big;

        if (goal < 0) {
            return false;
        }

        if (big * bigCount + small * smallCount < goal) {
            return false;
        }

        if (bigCount <= required_big) {
            return true;
        }

        if (big * required_big + smallCount < goal) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        canPack(4, 18, 19);
    }
}
