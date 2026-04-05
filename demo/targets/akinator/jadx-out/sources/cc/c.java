package cc;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f12048c;

    /* renamed from: a, reason: collision with root package name */
    public int[][] f12049a;

    /* renamed from: b, reason: collision with root package name */
    public int[][] f12050b;

    static {
        c cVar = new c();
        cVar.f12049a = new int[128][];
        cVar.f12050b = new int[128][];
        f12048c = cVar;
    }

    public int[] escapesFor(int i10) {
        int[][] iArr = this.f12049a;
        int[] iArrCopyOf = iArr[i10];
        if (iArrCopyOf == null) {
            iArrCopyOf = Arrays.copyOf(d.f12061k, 128);
            if (iArrCopyOf[i10] == 0) {
                iArrCopyOf[i10] = -1;
            }
            iArr[i10] = iArrCopyOf;
        }
        return iArrCopyOf;
    }

    public int[] escapesFor(int i10, boolean z10) {
        int[][] iArr = this.f12050b;
        if (!z10) {
            return escapesFor(i10);
        }
        int[] iArr2 = iArr[i10];
        if (iArr2 != null) {
            return iArr2;
        }
        int[] iArrEscapesFor = escapesFor(i10);
        iArrEscapesFor[47] = 47;
        iArr[i10] = iArrEscapesFor;
        return iArrEscapesFor;
    }
}
