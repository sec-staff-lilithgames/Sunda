package n3;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    public static <T> T[] append(T[] tArr, int i10, T t10) {
        if (i10 + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i10));
            System.arraycopy(tArr, 0, r02, 0, i10);
            tArr = r02;
        }
        tArr[i10] = t10;
        return tArr;
    }

    public static int growSize(int i10) {
        if (i10 <= 4) {
            return 8;
        }
        return i10 * 2;
    }

    public static <T> T[] insert(T[] tArr, int i10, int i11, T t10) {
        if (i10 + 1 <= tArr.length) {
            System.arraycopy(tArr, i11, tArr, i11 + 1, i10 - i11);
            tArr[i11] = t10;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i10)));
        System.arraycopy(tArr, 0, tArr2, 0, i11);
        tArr2[i11] = t10;
        System.arraycopy(tArr, i11, tArr2, i11 + 1, tArr.length - i11);
        return tArr2;
    }

    public static int[] append(int[] iArr, int i10, int i11) {
        if (i10 + 1 > iArr.length) {
            int[] iArr2 = new int[growSize(i10)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            iArr = iArr2;
        }
        iArr[i10] = i11;
        return iArr;
    }

    public static int[] insert(int[] iArr, int i10, int i11, int i12) {
        if (i10 + 1 <= iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i10 - i11);
            iArr[i11] = i12;
            return iArr;
        }
        int[] iArr2 = new int[growSize(i10)];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        iArr2[i11] = i12;
        System.arraycopy(iArr, i11, iArr2, i11 + 1, iArr.length - i11);
        return iArr2;
    }

    public static long[] append(long[] jArr, int i10, long j10) {
        if (i10 + 1 > jArr.length) {
            long[] jArr2 = new long[growSize(i10)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            jArr = jArr2;
        }
        jArr[i10] = j10;
        return jArr;
    }

    public static boolean[] append(boolean[] zArr, int i10, boolean z10) {
        if (i10 + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[growSize(i10)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            zArr = zArr2;
        }
        zArr[i10] = z10;
        return zArr;
    }

    public static long[] insert(long[] jArr, int i10, int i11, long j10) {
        if (i10 + 1 <= jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i10 - i11);
            jArr[i11] = j10;
            return jArr;
        }
        long[] jArr2 = new long[growSize(i10)];
        System.arraycopy(jArr, 0, jArr2, 0, i11);
        jArr2[i11] = j10;
        System.arraycopy(jArr, i11, jArr2, i11 + 1, jArr.length - i11);
        return jArr2;
    }

    public static boolean[] insert(boolean[] zArr, int i10, int i11, boolean z10) {
        if (i10 + 1 <= zArr.length) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, i10 - i11);
            zArr[i11] = z10;
            return zArr;
        }
        boolean[] zArr2 = new boolean[growSize(i10)];
        System.arraycopy(zArr, 0, zArr2, 0, i11);
        zArr2[i11] = z10;
        System.arraycopy(zArr, i11, zArr2, i11 + 1, zArr.length - i11);
        return zArr2;
    }
}
