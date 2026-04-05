package dq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class z {
    public static final boolean a(int i10) {
        return ((i10 >> 24) & 255) == 255;
    }

    public static final <T> int[] a(T[] tArr, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int[] iArr = new int[tArr.length];
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = (Integer) transform.invoke(tArr[i10]);
            if (num != null) {
                iArr[i10] = num.intValue();
            }
        }
        return iArr;
    }
}
