package a0;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3382a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f3383b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f3384c = new Object[0];

    public static final int binarySearch(int[] array, int i10, int i11) {
        e0.checkNotNullParameter(array, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = array[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final boolean equal(Object obj, Object obj2) {
        return e0.areEqual(obj, obj2);
    }

    public static final int idealByteArraySize(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    public static final int idealIntArraySize(int i10) {
        return idealByteArraySize(i10 * 4) / 4;
    }

    public static final int idealLongArraySize(int i10) {
        return idealByteArraySize(i10 * 8) / 8;
    }

    public static final int binarySearch(long[] array, int i10, long j10) {
        e0.checkNotNullParameter(array, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = array[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }
}
