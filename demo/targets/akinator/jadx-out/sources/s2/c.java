package s2;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f85320b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f85321c = {18, 20, 17, 15};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f85322d = {Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143, 32767, 8191};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f85323e = {32767, 8191, Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143};

    /* renamed from: a, reason: collision with root package name */
    public final long f85324a;

    public /* synthetic */ c(long j10) {
        this.f85324a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ c m6744boximpl(long j10) {
        return new c(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6745constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m6747copyZbe2FdA$default(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = m6757getMinWidthimpl(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = m6755getMaxWidthimpl(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = m6756getMinHeightimpl(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = m6754getMaxHeightimpl(j10);
        }
        return m6746copyZbe2FdA(j10, i15, i16, i17, i13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6748equalsimpl(long j10, Object obj) {
        return (obj instanceof c) && j10 == ((c) obj).m6761unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6749equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m6750getHasBoundedHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> (f85321c[i10] + 31))) & f85323e[i10]) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m6751getHasBoundedWidthimpl(long j10) {
        return (((int) (j10 >> 33)) & f85322d[(int) (3 & j10)]) != 0;
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m6752getHasFixedHeightimpl(long j10) {
        return m6754getMaxHeightimpl(j10) == m6756getMinHeightimpl(j10);
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m6753getHasFixedWidthimpl(long j10) {
        return m6755getMaxWidthimpl(j10) == m6757getMinWidthimpl(j10);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m6754getMaxHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> (f85321c[i10] + 31))) & f85323e[i10];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m6755getMaxWidthimpl(long j10) {
        int i10 = ((int) (j10 >> 33)) & f85322d[(int) (3 & j10)];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m6756getMinHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> f85321c[i10])) & f85323e[i10];
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m6757getMinWidthimpl(long j10) {
        return ((int) (j10 >> 2)) & f85322d[(int) (3 & j10)];
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6758hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m6759isZeroimpl(long j10) {
        return m6755getMaxWidthimpl(j10) == 0 || m6754getMaxHeightimpl(j10) == 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6760toStringimpl(long j10) {
        int iM6755getMaxWidthimpl = m6755getMaxWidthimpl(j10);
        String strValueOf = iM6755getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM6755getMaxWidthimpl);
        int iM6754getMaxHeightimpl = m6754getMaxHeightimpl(j10);
        String strValueOf2 = iM6754getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM6754getMaxHeightimpl) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(m6757getMinWidthimpl(j10));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(m6756getMinHeightimpl(j10));
        sb2.append(", maxHeight = ");
        return o2.q(sb2, strValueOf2, ')');
    }

    public boolean equals(Object obj) {
        return m6748equalsimpl(this.f85324a, obj);
    }

    public int hashCode() {
        return m6758hashCodeimpl(this.f85324a);
    }

    public String toString() {
        return m6760toStringimpl(this.f85324a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6761unboximpl() {
        return this.f85324a;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m6746copyZbe2FdA(long j10, int i10, int i11, int i12, int i13) {
        if (i12 < 0 || i10 < 0) {
            throw new IllegalArgumentException(o2.i(i12, i10, "minHeight(", gjnZrsdA.bEMhihxW, ") must be >= 0").toString());
        }
        if (i11 < i10 && i11 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')').toString());
        }
        if (i13 >= i12 || i13 == Integer.MAX_VALUE) {
            return f85320b.m6737createConstraintsZbe2FdA$ui_unit_release(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')').toString());
    }
}
