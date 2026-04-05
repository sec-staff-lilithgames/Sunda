package wu;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.e0;
import tu.g0;
import tu.i0;
import tu.k0;
import tu.m0;
import tu.o0;
import tu.q0;
import tu.t0;
import tu.v0;
import tu.z0;
import uu.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e {
    /* renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<k0> m7580asListajY9A(int[] asList) {
        e0.checkNotNullParameter(asList, "$this$asList");
        return new a(asList);
    }

    /* renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<g0> m7581asListGBYM_sE(byte[] asList) {
        e0.checkNotNullParameter(asList, "$this$asList");
        return new c(asList);
    }

    /* renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<o0> m7582asListQwZRm1k(long[] asList) {
        e0.checkNotNullParameter(asList, "$this$asList");
        return new b(asList);
    }

    /* renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<t0> m7583asListrL5Bavg(short[] asList) {
        e0.checkNotNullParameter(asList, "$this$asList");
        return new d(asList);
    }

    /* renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m7584binarySearch2fe2U9s(int[] binarySearch, int i10, int i11, int i12) {
        e0.checkNotNullParameter(binarySearch, "$this$binarySearch");
        g.Companion.checkRangeIndexes$kotlin_stdlib(i11, i12, m0.m7071getSizeimpl(binarySearch));
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iUintCompare = z0.uintCompare(binarySearch[i14], i10);
            if (iUintCompare < 0) {
                i11 = i14 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m7585binarySearch2fe2U9s$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = m0.m7071getSizeimpl(iArr);
        }
        return m7584binarySearch2fe2U9s(iArr, i10, i11, i12);
    }

    /* renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m7586binarySearchEtDCXyQ(short[] binarySearch, short s10, int i10, int i11) {
        e0.checkNotNullParameter(binarySearch, "$this$binarySearch");
        g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, v0.m7121getSizeimpl(binarySearch));
        int i12 = s10 & 65535;
        int i13 = i11 - 1;
        while (i10 <= i13) {
            int i14 = (i10 + i13) >>> 1;
            int iUintCompare = z0.uintCompare(binarySearch[i14], i12);
            if (iUintCompare < 0) {
                i10 = i14 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m7587binarySearchEtDCXyQ$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr);
        }
        return m7586binarySearchEtDCXyQ(sArr, s10, i10, i11);
    }

    /* renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m7588binarySearchK6DWlUc(long[] binarySearch, long j10, int i10, int i11) {
        e0.checkNotNullParameter(binarySearch, "$this$binarySearch");
        g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, q0.m7096getSizeimpl(binarySearch));
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iUlongCompare = z0.ulongCompare(binarySearch[i13], j10);
            if (iUlongCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iUlongCompare <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m7589binarySearchK6DWlUc$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr);
        }
        return m7588binarySearchK6DWlUc(jArr, j10, i10, i11);
    }

    /* renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m7590binarySearchWpHrYlw(byte[] binarySearch, byte b10, int i10, int i11) {
        e0.checkNotNullParameter(binarySearch, "$this$binarySearch");
        g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, i0.m7046getSizeimpl(binarySearch));
        int i12 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i11 - 1;
        while (i10 <= i13) {
            int i14 = (i10 + i13) >>> 1;
            int iUintCompare = z0.uintCompare(binarySearch[i14], i12);
            if (iUintCompare < 0) {
                i10 = i14 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m7591binarySearchWpHrYlw$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = i0.m7046getSizeimpl(bArr);
        }
        return m7590binarySearchWpHrYlw(bArr, b10, i10, i11);
    }

    @tu.f
    /* renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ k0 m7592maxajY9A(int[] max) {
        e0.checkNotNullParameter(max, "$this$max");
        return f.m7664maxOrNullajY9A(max);
    }

    @tu.f
    /* renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ g0 m7593maxGBYM_sE(byte[] max) {
        e0.checkNotNullParameter(max, "$this$max");
        return f.m7665maxOrNullGBYM_sE(max);
    }

    @tu.f
    /* renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ o0 m7594maxQwZRm1k(long[] max) {
        e0.checkNotNullParameter(max, "$this$max");
        return f.m7666maxOrNullQwZRm1k(max);
    }

    @tu.f
    /* renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ t0 m7595maxrL5Bavg(short[] max) {
        e0.checkNotNullParameter(max, "$this$max");
        return f.m7667maxOrNullrL5Bavg(max);
    }

    @tu.f
    /* renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ g0 m7596maxWithXMRcp5o(byte[] maxWith, Comparator comparator) {
        e0.checkNotNullParameter(maxWith, "$this$maxWith");
        e0.checkNotNullParameter(comparator, "comparator");
        return f.m7672maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    @tu.f
    /* renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ k0 m7597maxWithYmdZ_VM(int[] maxWith, Comparator comparator) {
        e0.checkNotNullParameter(maxWith, "$this$maxWith");
        e0.checkNotNullParameter(comparator, "comparator");
        return f.m7673maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    @tu.f
    /* renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ t0 m7598maxWitheOHTfZs(short[] maxWith, Comparator comparator) {
        e0.checkNotNullParameter(maxWith, "$this$maxWith");
        e0.checkNotNullParameter(comparator, "comparator");
        return f.m7674maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    @tu.f
    /* renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ o0 m7599maxWithzrEWJaI(long[] maxWith, Comparator comparator) {
        e0.checkNotNullParameter(maxWith, "$this$maxWith");
        e0.checkNotNullParameter(comparator, "comparator");
        return f.m7675maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    @tu.f
    /* renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ k0 m7600minajY9A(int[] min) {
        e0.checkNotNullParameter(min, "$this$min");
        return f.m7680minOrNullajY9A(min);
    }

    @tu.f
    /* renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ g0 m7601minGBYM_sE(byte[] min) {
        e0.checkNotNullParameter(min, "$this$min");
        return f.m7681minOrNullGBYM_sE(min);
    }

    @tu.f
    /* renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ o0 m7602minQwZRm1k(long[] min) {
        e0.checkNotNullParameter(min, "$this$min");
        return f.m7682minOrNullQwZRm1k(min);
    }

    @tu.f
    /* renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ t0 m7603minrL5Bavg(short[] min) {
        e0.checkNotNullParameter(min, "$this$min");
        return f.m7683minOrNullrL5Bavg(min);
    }

    @tu.f
    /* renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ g0 m7604minWithXMRcp5o(byte[] minWith, Comparator comparator) {
        e0.checkNotNullParameter(minWith, "$this$minWith");
        e0.checkNotNullParameter(comparator, "comparator");
        return f.m7688minWithOrNullXMRcp5o(minWith, comparator);
    }

    @tu.f
    /* renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ k0 m7605minWithYmdZ_VM(int[] minWith, Comparator comparator) {
        e0.checkNotNullParameter(minWith, "$this$minWith");
        e0.checkNotNullParameter(comparator, "comparator");
        return f.m7689minWithOrNullYmdZ_VM(minWith, comparator);
    }

    @tu.f
    /* renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ t0 m7606minWitheOHTfZs(short[] minWith, Comparator comparator) {
        e0.checkNotNullParameter(minWith, "$this$minWith");
        e0.checkNotNullParameter(comparator, "comparator");
        return f.m7690minWithOrNulleOHTfZs(minWith, comparator);
    }

    @tu.f
    /* renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ o0 m7607minWithzrEWJaI(long[] minWith, Comparator comparator) {
        e0.checkNotNullParameter(minWith, "$this$minWith");
        e0.checkNotNullParameter(comparator, "comparator");
        return f.m7691minWithOrNullzrEWJaI(minWith, comparator);
    }
}
