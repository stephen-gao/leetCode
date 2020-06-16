package com.gao.solution.array;

/**
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 * <p>
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * <p>
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 * <p>
 * 示例:
 * <p>
 * 给定 n = 5，并且 version = 4 是第一个错误的版本。
 * <p>
 * 调用 isBadVersion(3) -> false
 * 调用 isBadVersion(5) -> true
 * 调用 isBadVersion(4) -> true
 * <p>
 * 所以，4 是第一个错误的版本。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/08 20:59
 **/
public class FirstErrorVersion {

    private static int last = 0;

    private static boolean isBadVersion(int v) {
        return v > last;
    }

    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                System.out.println(mid + " " + true);
                high = mid;
            } else {
                System.out.println(mid + " " + false);
                low = mid + 1;
            }
            System.out.println(low + " " + high + " " + mid);
        }
        return low;
    }


    public static void main(String[] args) {
        last = 1;
        int n = 10;
        int version = firstBadVersion(n);
        System.out.println("r -> " + version);
    }
}
