package ic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {
    public static int addOverflowSafe(int i10, int i11) {
        int i12 = i10 + i11;
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        return i12;
    }
}
