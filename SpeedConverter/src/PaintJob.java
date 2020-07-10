public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0)
            return -1;
        int cnt = 0;
        double area = width * height;
        area -= extraBucket * areaPerBucket;
        while (area > 0) {
            area -= areaPerBucket;
            ++cnt;
        }
        return cnt;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(1, area, areaPerBucket, 0);
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }
}
