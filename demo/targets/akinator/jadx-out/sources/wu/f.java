package wu;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import h2.rl.UeklptUrP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ov.g;
import p0.o2;
import qv.m;
import qv.v;
import rw.hIT.uQjDr;
import tu.g0;
import tu.i0;
import tu.k0;
import tu.m0;
import tu.o0;
import tu.q0;
import tu.t0;
import tu.v0;
import uu.f0;
import uu.g1;
import uu.h0;
import uu.h1;
import uu.h2;
import uu.j0;
import uu.p0;
import uu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f extends e {
    /* renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m7608contentEqualsFGO6Aew(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m7609contentEqualsKJPZfPQ(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m7610contentEqualskV0jMPg(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m7611contentEqualslec5QzE(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    /* renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m7612contentHashCode2csIQuQ(byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    /* renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m7613contentHashCodeXUkPCBk(int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    /* renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m7614contentHashCoded6D3K8(short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    /* renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m7615contentHashCodeuLth9ew(long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    /* renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m7617contentToStringXUkPCBk(int[] iArr) {
        String strJoinToString$default;
        return (iArr == null || (strJoinToString$default = y0.joinToString$default(m0.m7063boximpl(iArr), ", ", C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    /* renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m7618contentToStringd6D3K8(short[] sArr) {
        String strJoinToString$default;
        return (sArr == null || (strJoinToString$default = y0.joinToString$default(v0.m7113boximpl(sArr), ", ", C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    /* renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m7619contentToStringuLth9ew(long[] jArr) {
        String strJoinToString$default;
        return (jArr == null || (strJoinToString$default = y0.joinToString$default(q0.m7088boximpl(jArr), ", ", C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    /* renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<g0> m7620dropPpDY95g(byte[] drop, int i10) {
        e0.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m7780takeLastPpDY95g(drop, v.coerceAtLeast(i0.m7046getSizeimpl(drop) - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<t0> m7621dropnggk6HY(short[] drop, int i10) {
        e0.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m7781takeLastnggk6HY(drop, v.coerceAtLeast(v0.m7121getSizeimpl(drop) - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<k0> m7622dropqFRl0hI(int[] drop, int i10) {
        e0.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m7782takeLastqFRl0hI(drop, v.coerceAtLeast(m0.m7071getSizeimpl(drop) - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<o0> m7623dropr7IrZao(long[] drop, int i10) {
        e0.checkNotNullParameter(drop, "$this$drop");
        if (i10 >= 0) {
            return m7783takeLastr7IrZao(drop, v.coerceAtLeast(q0.m7096getSizeimpl(drop) - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<g0> m7624dropLastPpDY95g(byte[] dropLast, int i10) {
        e0.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m7776takePpDY95g(dropLast, v.coerceAtLeast(i0.m7046getSizeimpl(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<t0> m7625dropLastnggk6HY(short[] dropLast, int i10) {
        e0.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m7777takenggk6HY(dropLast, v.coerceAtLeast(v0.m7121getSizeimpl(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<k0> m7626dropLastqFRl0hI(int[] dropLast, int i10) {
        e0.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m7778takeqFRl0hI(dropLast, v.coerceAtLeast(m0.m7071getSizeimpl(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<o0> m7627dropLastr7IrZao(long[] dropLast, int i10) {
        e0.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i10 >= 0) {
            return m7779taker7IrZao(dropLast, v.coerceAtLeast(q0.m7096getSizeimpl(dropLast) - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    /* renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m7628fill2fe2U9s(int[] fill, int i10, int i11, int i12) {
        e0.checkNotNullParameter(fill, "$this$fill");
        f0.fill(fill, i10, i11, i12);
    }

    /* renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m7629fill2fe2U9s$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = m0.m7071getSizeimpl(iArr);
        }
        m7628fill2fe2U9s(iArr, i10, i11, i12);
    }

    /* renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m7630fillEtDCXyQ(short[] fill, short s10, int i10, int i11) {
        e0.checkNotNullParameter(fill, "$this$fill");
        f0.fill(fill, s10, i10, i11);
    }

    /* renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m7631fillEtDCXyQ$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr);
        }
        m7630fillEtDCXyQ(sArr, s10, i10, i11);
    }

    /* renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m7632fillK6DWlUc(long[] fill, long j10, int i10, int i11) {
        e0.checkNotNullParameter(fill, "$this$fill");
        f0.fill(fill, j10, i10, i11);
    }

    /* renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m7633fillK6DWlUc$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr);
        }
        m7632fillK6DWlUc(jArr, j10, i10, i11);
    }

    /* renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m7634fillWpHrYlw(byte[] fill, byte b10, int i10, int i11) {
        e0.checkNotNullParameter(fill, "$this$fill");
        f0.fill(fill, b10, i10, i11);
    }

    /* renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m7635fillWpHrYlw$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = i0.m7046getSizeimpl(bArr);
        }
        m7634fillWpHrYlw(bArr, b10, i10, i11);
    }

    /* renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final k0 m7636firstOrNullajY9A(int[] firstOrNull) {
        e0.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (m0.m7073isEmptyimpl(firstOrNull)) {
            return null;
        }
        return k0.m7055boximpl(m0.m7070getpVg5ArA(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final g0 m7637firstOrNullGBYM_sE(byte[] firstOrNull) {
        e0.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (i0.m7048isEmptyimpl(firstOrNull)) {
            return null;
        }
        return g0.m7030boximpl(i0.m7045getw2LRezQ(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final o0 m7638firstOrNullQwZRm1k(long[] firstOrNull) {
        e0.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (q0.m7098isEmptyimpl(firstOrNull)) {
            return null;
        }
        return o0.m7080boximpl(q0.m7095getsVKNKU(firstOrNull, 0));
    }

    /* renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final t0 m7639firstOrNullrL5Bavg(short[] firstOrNull) {
        e0.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (v0.m7123isEmptyimpl(firstOrNull)) {
            return null;
        }
        return t0.m7105boximpl(v0.m7120getMh2AYeg(firstOrNull, 0));
    }

    /* renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final m m7640getIndicesajY9A(int[] indices) {
        e0.checkNotNullParameter(indices, "$this$indices");
        return uu.k0.getIndices(indices);
    }

    /* renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m7641getIndicesajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final m m7642getIndicesGBYM_sE(byte[] indices) {
        e0.checkNotNullParameter(indices, "$this$indices");
        return uu.k0.getIndices(indices);
    }

    /* renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m7643getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final m m7644getIndicesQwZRm1k(long[] indices) {
        e0.checkNotNullParameter(indices, "$this$indices");
        return uu.k0.getIndices(indices);
    }

    /* renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m7645getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final m m7646getIndicesrL5Bavg(short[] indices) {
        e0.checkNotNullParameter(indices, "$this$indices");
        return uu.k0.getIndices(indices);
    }

    /* renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m7647getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m7648getLastIndexajY9A(int[] lastIndex) {
        e0.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return uu.k0.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m7649getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m7650getLastIndexGBYM_sE(byte[] lastIndex) {
        e0.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return uu.k0.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m7651getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m7652getLastIndexQwZRm1k(long[] lastIndex) {
        e0.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return uu.k0.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m7653getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m7654getLastIndexrL5Bavg(short[] lastIndex) {
        e0.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return uu.k0.getLastIndex(lastIndex);
    }

    /* renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m7655getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    /* renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final g0 m7656getOrNullPpDY95g(byte[] getOrNull, int i10) {
        e0.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 >= i0.m7046getSizeimpl(getOrNull)) {
            return null;
        }
        return g0.m7030boximpl(i0.m7045getw2LRezQ(getOrNull, i10));
    }

    /* renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final t0 m7657getOrNullnggk6HY(short[] getOrNull, int i10) {
        e0.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 >= v0.m7121getSizeimpl(getOrNull)) {
            return null;
        }
        return t0.m7105boximpl(v0.m7120getMh2AYeg(getOrNull, i10));
    }

    /* renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final k0 m7658getOrNullqFRl0hI(int[] getOrNull, int i10) {
        e0.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 >= m0.m7071getSizeimpl(getOrNull)) {
            return null;
        }
        return k0.m7055boximpl(m0.m7070getpVg5ArA(getOrNull, i10));
    }

    /* renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final o0 m7659getOrNullr7IrZao(long[] getOrNull, int i10) {
        e0.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i10 < 0 || i10 >= q0.m7096getSizeimpl(getOrNull)) {
            return null;
        }
        return o0.m7080boximpl(q0.m7095getsVKNKU(getOrNull, i10));
    }

    /* renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final k0 m7660lastOrNullajY9A(int[] lastOrNull) {
        e0.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (m0.m7073isEmptyimpl(lastOrNull)) {
            return null;
        }
        return k0.m7055boximpl(m0.m7070getpVg5ArA(lastOrNull, m0.m7071getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final g0 m7661lastOrNullGBYM_sE(byte[] lastOrNull) {
        e0.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (i0.m7048isEmptyimpl(lastOrNull)) {
            return null;
        }
        return g0.m7030boximpl(i0.m7045getw2LRezQ(lastOrNull, i0.m7046getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final o0 m7662lastOrNullQwZRm1k(long[] lastOrNull) {
        e0.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (q0.m7098isEmptyimpl(lastOrNull)) {
            return null;
        }
        return o0.m7080boximpl(q0.m7095getsVKNKU(lastOrNull, q0.m7096getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final t0 m7663lastOrNullrL5Bavg(short[] lastOrNull) {
        e0.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (v0.m7123isEmptyimpl(lastOrNull)) {
            return null;
        }
        return t0.m7105boximpl(v0.m7120getMh2AYeg(lastOrNull, v0.m7121getSizeimpl(lastOrNull) - 1));
    }

    /* renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final k0 m7664maxOrNullajY9A(int[] maxOrNull) {
        e0.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (m0.m7073isEmptyimpl(maxOrNull)) {
            return null;
        }
        int iM7070getpVg5ArA = m0.m7070getpVg5ArA(maxOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(maxOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM7070getpVg5ArA2 = m0.m7070getpVg5ArA(maxOrNull, i10);
                if (Integer.compare(iM7070getpVg5ArA ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ iM7070getpVg5ArA2) < 0) {
                    iM7070getpVg5ArA = iM7070getpVg5ArA2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return k0.m7055boximpl(iM7070getpVg5ArA);
    }

    /* renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final g0 m7665maxOrNullGBYM_sE(byte[] maxOrNull) {
        e0.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (i0.m7048isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(maxOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(maxOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM7045getw2LRezQ2 = i0.m7045getw2LRezQ(maxOrNull, i10);
                if (e0.compare(bM7045getw2LRezQ & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, bM7045getw2LRezQ2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 0) {
                    bM7045getw2LRezQ = bM7045getw2LRezQ2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return g0.m7030boximpl(bM7045getw2LRezQ);
    }

    /* renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final o0 m7666maxOrNullQwZRm1k(long[] maxOrNull) {
        e0.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (q0.m7098isEmptyimpl(maxOrNull)) {
            return null;
        }
        long jM7095getsVKNKU = q0.m7095getsVKNKU(maxOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(maxOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM7095getsVKNKU2 = q0.m7095getsVKNKU(maxOrNull, i10);
                if (Long.compare(jM7095getsVKNKU ^ Long.MIN_VALUE, Long.MIN_VALUE ^ jM7095getsVKNKU2) < 0) {
                    jM7095getsVKNKU = jM7095getsVKNKU2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return o0.m7080boximpl(jM7095getsVKNKU);
    }

    /* renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final t0 m7667maxOrNullrL5Bavg(short[] maxOrNull) {
        e0.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (v0.m7123isEmptyimpl(maxOrNull)) {
            return null;
        }
        short sM7120getMh2AYeg = v0.m7120getMh2AYeg(maxOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(maxOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM7120getMh2AYeg2 = v0.m7120getMh2AYeg(maxOrNull, i10);
                if (e0.compare(sM7120getMh2AYeg & 65535, 65535 & sM7120getMh2AYeg2) < 0) {
                    sM7120getMh2AYeg = sM7120getMh2AYeg2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t0.m7105boximpl(sM7120getMh2AYeg);
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m7669maxOrThrowU(int[] max) {
        e0.checkNotNullParameter(max, "$this$max");
        if (m0.m7073isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        int iM7070getpVg5ArA = m0.m7070getpVg5ArA(max, 0);
        int lastIndex = uu.k0.getLastIndex(max);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM7070getpVg5ArA2 = m0.m7070getpVg5ArA(max, i10);
                if (Integer.compare(iM7070getpVg5ArA ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ iM7070getpVg5ArA2) < 0) {
                    iM7070getpVg5ArA = iM7070getpVg5ArA2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iM7070getpVg5ArA;
    }

    /* renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final g0 m7672maxWithOrNullXMRcp5o(byte[] maxWithOrNull, Comparator<? super g0> comparator) {
        e0.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        e0.checkNotNullParameter(comparator, "comparator");
        if (i0.m7048isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(maxWithOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(maxWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM7045getw2LRezQ2 = i0.m7045getw2LRezQ(maxWithOrNull, i10);
                if (comparator.compare(g0.m7030boximpl(bM7045getw2LRezQ), g0.m7030boximpl(bM7045getw2LRezQ2)) < 0) {
                    bM7045getw2LRezQ = bM7045getw2LRezQ2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return g0.m7030boximpl(bM7045getw2LRezQ);
    }

    /* renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final k0 m7673maxWithOrNullYmdZ_VM(int[] maxWithOrNull, Comparator<? super k0> comparator) {
        e0.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        e0.checkNotNullParameter(comparator, "comparator");
        if (m0.m7073isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int iM7070getpVg5ArA = m0.m7070getpVg5ArA(maxWithOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(maxWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM7070getpVg5ArA2 = m0.m7070getpVg5ArA(maxWithOrNull, i10);
                if (comparator.compare(k0.m7055boximpl(iM7070getpVg5ArA), k0.m7055boximpl(iM7070getpVg5ArA2)) < 0) {
                    iM7070getpVg5ArA = iM7070getpVg5ArA2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return k0.m7055boximpl(iM7070getpVg5ArA);
    }

    /* renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final t0 m7674maxWithOrNulleOHTfZs(short[] maxWithOrNull, Comparator<? super t0> comparator) {
        e0.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        e0.checkNotNullParameter(comparator, "comparator");
        if (v0.m7123isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short sM7120getMh2AYeg = v0.m7120getMh2AYeg(maxWithOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(maxWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM7120getMh2AYeg2 = v0.m7120getMh2AYeg(maxWithOrNull, i10);
                if (comparator.compare(t0.m7105boximpl(sM7120getMh2AYeg), t0.m7105boximpl(sM7120getMh2AYeg2)) < 0) {
                    sM7120getMh2AYeg = sM7120getMh2AYeg2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t0.m7105boximpl(sM7120getMh2AYeg);
    }

    /* renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final o0 m7675maxWithOrNullzrEWJaI(long[] maxWithOrNull, Comparator<? super o0> comparator) {
        e0.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        e0.checkNotNullParameter(comparator, "comparator");
        if (q0.m7098isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long jM7095getsVKNKU = q0.m7095getsVKNKU(maxWithOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(maxWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM7095getsVKNKU2 = q0.m7095getsVKNKU(maxWithOrNull, i10);
                if (comparator.compare(o0.m7080boximpl(jM7095getsVKNKU), o0.m7080boximpl(jM7095getsVKNKU2)) < 0) {
                    jM7095getsVKNKU = jM7095getsVKNKU2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return o0.m7080boximpl(jM7095getsVKNKU);
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m7677maxWithOrThrowU(int[] maxWith, Comparator<? super k0> comparator) {
        e0.checkNotNullParameter(maxWith, "$this$maxWith");
        e0.checkNotNullParameter(comparator, "comparator");
        if (m0.m7073isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        int iM7070getpVg5ArA = m0.m7070getpVg5ArA(maxWith, 0);
        int lastIndex = uu.k0.getLastIndex(maxWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM7070getpVg5ArA2 = m0.m7070getpVg5ArA(maxWith, i10);
                if (comparator.compare(k0.m7055boximpl(iM7070getpVg5ArA), k0.m7055boximpl(iM7070getpVg5ArA2)) < 0) {
                    iM7070getpVg5ArA = iM7070getpVg5ArA2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iM7070getpVg5ArA;
    }

    /* renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final k0 m7680minOrNullajY9A(int[] minOrNull) {
        e0.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (m0.m7073isEmptyimpl(minOrNull)) {
            return null;
        }
        int iM7070getpVg5ArA = m0.m7070getpVg5ArA(minOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(minOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM7070getpVg5ArA2 = m0.m7070getpVg5ArA(minOrNull, i10);
                if (Integer.compare(iM7070getpVg5ArA ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ iM7070getpVg5ArA2) > 0) {
                    iM7070getpVg5ArA = iM7070getpVg5ArA2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return k0.m7055boximpl(iM7070getpVg5ArA);
    }

    /* renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final g0 m7681minOrNullGBYM_sE(byte[] minOrNull) {
        e0.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (i0.m7048isEmptyimpl(minOrNull)) {
            return null;
        }
        byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(minOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(minOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM7045getw2LRezQ2 = i0.m7045getw2LRezQ(minOrNull, i10);
                if (e0.compare(bM7045getw2LRezQ & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, bM7045getw2LRezQ2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) > 0) {
                    bM7045getw2LRezQ = bM7045getw2LRezQ2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return g0.m7030boximpl(bM7045getw2LRezQ);
    }

    /* renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final o0 m7682minOrNullQwZRm1k(long[] minOrNull) {
        e0.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (q0.m7098isEmptyimpl(minOrNull)) {
            return null;
        }
        long jM7095getsVKNKU = q0.m7095getsVKNKU(minOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(minOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM7095getsVKNKU2 = q0.m7095getsVKNKU(minOrNull, i10);
                if (Long.compare(jM7095getsVKNKU ^ Long.MIN_VALUE, Long.MIN_VALUE ^ jM7095getsVKNKU2) > 0) {
                    jM7095getsVKNKU = jM7095getsVKNKU2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return o0.m7080boximpl(jM7095getsVKNKU);
    }

    /* renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final t0 m7683minOrNullrL5Bavg(short[] minOrNull) {
        e0.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (v0.m7123isEmptyimpl(minOrNull)) {
            return null;
        }
        short sM7120getMh2AYeg = v0.m7120getMh2AYeg(minOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(minOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM7120getMh2AYeg2 = v0.m7120getMh2AYeg(minOrNull, i10);
                if (e0.compare(sM7120getMh2AYeg & 65535, 65535 & sM7120getMh2AYeg2) > 0) {
                    sM7120getMh2AYeg = sM7120getMh2AYeg2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t0.m7105boximpl(sM7120getMh2AYeg);
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m7685minOrThrowU(int[] min) {
        e0.checkNotNullParameter(min, "$this$min");
        if (m0.m7073isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        int iM7070getpVg5ArA = m0.m7070getpVg5ArA(min, 0);
        int lastIndex = uu.k0.getLastIndex(min);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM7070getpVg5ArA2 = m0.m7070getpVg5ArA(min, i10);
                if (Integer.compare(iM7070getpVg5ArA ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ iM7070getpVg5ArA2) > 0) {
                    iM7070getpVg5ArA = iM7070getpVg5ArA2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iM7070getpVg5ArA;
    }

    /* renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final g0 m7688minWithOrNullXMRcp5o(byte[] minWithOrNull, Comparator<? super g0> comparator) {
        e0.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        e0.checkNotNullParameter(comparator, "comparator");
        if (i0.m7048isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(minWithOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(minWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM7045getw2LRezQ2 = i0.m7045getw2LRezQ(minWithOrNull, i10);
                if (comparator.compare(g0.m7030boximpl(bM7045getw2LRezQ), g0.m7030boximpl(bM7045getw2LRezQ2)) > 0) {
                    bM7045getw2LRezQ = bM7045getw2LRezQ2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return g0.m7030boximpl(bM7045getw2LRezQ);
    }

    /* renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final k0 m7689minWithOrNullYmdZ_VM(int[] minWithOrNull, Comparator<? super k0> comparator) {
        e0.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        e0.checkNotNullParameter(comparator, "comparator");
        if (m0.m7073isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int iM7070getpVg5ArA = m0.m7070getpVg5ArA(minWithOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(minWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM7070getpVg5ArA2 = m0.m7070getpVg5ArA(minWithOrNull, i10);
                if (comparator.compare(k0.m7055boximpl(iM7070getpVg5ArA), k0.m7055boximpl(iM7070getpVg5ArA2)) > 0) {
                    iM7070getpVg5ArA = iM7070getpVg5ArA2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return k0.m7055boximpl(iM7070getpVg5ArA);
    }

    /* renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final t0 m7690minWithOrNulleOHTfZs(short[] minWithOrNull, Comparator<? super t0> comparator) {
        e0.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        e0.checkNotNullParameter(comparator, "comparator");
        if (v0.m7123isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short sM7120getMh2AYeg = v0.m7120getMh2AYeg(minWithOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(minWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM7120getMh2AYeg2 = v0.m7120getMh2AYeg(minWithOrNull, i10);
                if (comparator.compare(t0.m7105boximpl(sM7120getMh2AYeg), t0.m7105boximpl(sM7120getMh2AYeg2)) > 0) {
                    sM7120getMh2AYeg = sM7120getMh2AYeg2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t0.m7105boximpl(sM7120getMh2AYeg);
    }

    /* renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final o0 m7691minWithOrNullzrEWJaI(long[] minWithOrNull, Comparator<? super o0> comparator) {
        e0.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        e0.checkNotNullParameter(comparator, "comparator");
        if (q0.m7098isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long jM7095getsVKNKU = q0.m7095getsVKNKU(minWithOrNull, 0);
        int lastIndex = uu.k0.getLastIndex(minWithOrNull);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM7095getsVKNKU2 = q0.m7095getsVKNKU(minWithOrNull, i10);
                if (comparator.compare(o0.m7080boximpl(jM7095getsVKNKU), o0.m7080boximpl(jM7095getsVKNKU2)) > 0) {
                    jM7095getsVKNKU = jM7095getsVKNKU2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return o0.m7080boximpl(jM7095getsVKNKU);
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m7693minWithOrThrowU(int[] minWith, Comparator<? super k0> comparator) {
        e0.checkNotNullParameter(minWith, "$this$minWith");
        e0.checkNotNullParameter(comparator, "comparator");
        if (m0.m7073isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        int iM7070getpVg5ArA = m0.m7070getpVg5ArA(minWith, 0);
        int lastIndex = uu.k0.getLastIndex(minWith);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM7070getpVg5ArA2 = m0.m7070getpVg5ArA(minWith, i10);
                if (comparator.compare(k0.m7055boximpl(iM7070getpVg5ArA), k0.m7055boximpl(iM7070getpVg5ArA2)) > 0) {
                    iM7070getpVg5ArA = iM7070getpVg5ArA2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iM7070getpVg5ArA;
    }

    /* renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m7696plusCFIt9YE(int[] plus, Collection<k0> elements) {
        e0.checkNotNullParameter(plus, "$this$plus");
        e0.checkNotNullParameter(elements, "elements");
        int iM7071getSizeimpl = m0.m7071getSizeimpl(plus);
        int[] iArrCopyOf = Arrays.copyOf(plus, elements.size() + m0.m7071getSizeimpl(plus));
        e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        Iterator<k0> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[iM7071getSizeimpl] = it.next().m7061unboximpl();
            iM7071getSizeimpl++;
        }
        return m0.m7065constructorimpl(iArrCopyOf);
    }

    /* renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m7697pluskzHmqpY(long[] plus, Collection<o0> elements) {
        e0.checkNotNullParameter(plus, "$this$plus");
        e0.checkNotNullParameter(elements, "elements");
        int iM7096getSizeimpl = q0.m7096getSizeimpl(plus);
        long[] jArrCopyOf = Arrays.copyOf(plus, elements.size() + q0.m7096getSizeimpl(plus));
        e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        Iterator<o0> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[iM7096getSizeimpl] = it.next().m7086unboximpl();
            iM7096getSizeimpl++;
        }
        return q0.m7090constructorimpl(jArrCopyOf);
    }

    /* renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m7698plusojwP5H8(short[] plus, Collection<t0> elements) {
        e0.checkNotNullParameter(plus, "$this$plus");
        e0.checkNotNullParameter(elements, "elements");
        int iM7121getSizeimpl = v0.m7121getSizeimpl(plus);
        short[] sArrCopyOf = Arrays.copyOf(plus, elements.size() + v0.m7121getSizeimpl(plus));
        e0.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        Iterator<t0> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[iM7121getSizeimpl] = it.next().m7111unboximpl();
            iM7121getSizeimpl++;
        }
        return v0.m7115constructorimpl(sArrCopyOf);
    }

    /* renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m7699plusxo_DsdI(byte[] plus, Collection<g0> elements) {
        e0.checkNotNullParameter(plus, "$this$plus");
        e0.checkNotNullParameter(elements, "elements");
        int iM7046getSizeimpl = i0.m7046getSizeimpl(plus);
        byte[] bArrCopyOf = Arrays.copyOf(plus, elements.size() + i0.m7046getSizeimpl(plus));
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        Iterator<g0> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[iM7046getSizeimpl] = it.next().m7036unboximpl();
            iM7046getSizeimpl++;
        }
        return i0.m7040constructorimpl(bArrCopyOf);
    }

    /* renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m7700random2D5oskM(int[] random, g random2) {
        e0.checkNotNullParameter(random, "$this$random");
        e0.checkNotNullParameter(random2, "random");
        if (m0.m7073isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return m0.m7070getpVg5ArA(random, random2.nextInt(m0.m7071getSizeimpl(random)));
    }

    /* renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m7701randomJzugnMA(long[] random, g random2) {
        e0.checkNotNullParameter(random, "$this$random");
        e0.checkNotNullParameter(random2, "random");
        if (q0.m7098isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return q0.m7095getsVKNKU(random, random2.nextInt(q0.m7096getSizeimpl(random)));
    }

    /* renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m7702randomoSF2wD8(byte[] random, g random2) {
        e0.checkNotNullParameter(random, "$this$random");
        e0.checkNotNullParameter(random2, "random");
        if (i0.m7048isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return i0.m7045getw2LRezQ(random, random2.nextInt(i0.m7046getSizeimpl(random)));
    }

    /* renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m7703randoms5X_as8(short[] random, g random2) {
        e0.checkNotNullParameter(random, "$this$random");
        e0.checkNotNullParameter(random2, "random");
        if (v0.m7123isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return v0.m7120getMh2AYeg(random, random2.nextInt(v0.m7121getSizeimpl(random)));
    }

    /* renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final k0 m7704randomOrNull2D5oskM(int[] randomOrNull, g random) {
        e0.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        e0.checkNotNullParameter(random, "random");
        if (m0.m7073isEmptyimpl(randomOrNull)) {
            return null;
        }
        return k0.m7055boximpl(m0.m7070getpVg5ArA(randomOrNull, random.nextInt(m0.m7071getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final o0 m7705randomOrNullJzugnMA(long[] randomOrNull, g random) {
        e0.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        e0.checkNotNullParameter(random, "random");
        if (q0.m7098isEmptyimpl(randomOrNull)) {
            return null;
        }
        return o0.m7080boximpl(q0.m7095getsVKNKU(randomOrNull, random.nextInt(q0.m7096getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final g0 m7706randomOrNulloSF2wD8(byte[] randomOrNull, g random) {
        e0.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        e0.checkNotNullParameter(random, "random");
        if (i0.m7048isEmptyimpl(randomOrNull)) {
            return null;
        }
        return g0.m7030boximpl(i0.m7045getw2LRezQ(randomOrNull, random.nextInt(i0.m7046getSizeimpl(randomOrNull))));
    }

    /* renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final t0 m7707randomOrNulls5X_as8(short[] randomOrNull, g random) {
        e0.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        e0.checkNotNullParameter(random, "random");
        if (v0.m7123isEmptyimpl(randomOrNull)) {
            return null;
        }
        return t0.m7105boximpl(v0.m7120getMh2AYeg(randomOrNull, random.nextInt(v0.m7121getSizeimpl(randomOrNull))));
    }

    /* renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<k0> m7708reversedajY9A(int[] reversed) {
        e0.checkNotNullParameter(reversed, "$this$reversed");
        if (m0.m7073isEmptyimpl(reversed)) {
            return p0.emptyList();
        }
        List<k0> mutableList = y0.toMutableList((Collection) m0.m7063boximpl(reversed));
        x0.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<g0> m7709reversedGBYM_sE(byte[] reversed) {
        e0.checkNotNullParameter(reversed, "$this$reversed");
        if (i0.m7048isEmptyimpl(reversed)) {
            return p0.emptyList();
        }
        List<g0> mutableList = y0.toMutableList((Collection) i0.m7038boximpl(reversed));
        x0.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<o0> m7710reversedQwZRm1k(long[] reversed) {
        e0.checkNotNullParameter(reversed, "$this$reversed");
        if (q0.m7098isEmptyimpl(reversed)) {
            return p0.emptyList();
        }
        List<o0> mutableList = y0.toMutableList((Collection) q0.m7088boximpl(reversed));
        x0.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<t0> m7711reversedrL5Bavg(short[] reversed) {
        e0.checkNotNullParameter(reversed, "$this$reversed");
        if (v0.m7123isEmptyimpl(reversed)) {
            return p0.emptyList();
        }
        List<t0> mutableList = y0.toMutableList((Collection) v0.m7113boximpl(reversed));
        x0.reverse(mutableList);
        return mutableList;
    }

    /* renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m7712shuffleajY9A(int[] shuffle) {
        e0.checkNotNullParameter(shuffle, "$this$shuffle");
        m7713shuffle2D5oskM(shuffle, g.f79860b);
    }

    /* renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m7713shuffle2D5oskM(int[] shuffle, g random) {
        e0.checkNotNullParameter(shuffle, "$this$shuffle");
        e0.checkNotNullParameter(random, "random");
        for (int lastIndex = uu.k0.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            int iM7070getpVg5ArA = m0.m7070getpVg5ArA(shuffle, lastIndex);
            m0.m7075setVXSXFK8(shuffle, lastIndex, m0.m7070getpVg5ArA(shuffle, iNextInt));
            m0.m7075setVXSXFK8(shuffle, iNextInt, iM7070getpVg5ArA);
        }
    }

    /* renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m7714shuffleGBYM_sE(byte[] shuffle) {
        e0.checkNotNullParameter(shuffle, "$this$shuffle");
        m7717shuffleoSF2wD8(shuffle, g.f79860b);
    }

    /* renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m7715shuffleJzugnMA(long[] shuffle, g random) {
        e0.checkNotNullParameter(shuffle, "$this$shuffle");
        e0.checkNotNullParameter(random, "random");
        for (int lastIndex = uu.k0.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            long jM7095getsVKNKU = q0.m7095getsVKNKU(shuffle, lastIndex);
            q0.m7100setk8EXiF4(shuffle, lastIndex, q0.m7095getsVKNKU(shuffle, iNextInt));
            q0.m7100setk8EXiF4(shuffle, iNextInt, jM7095getsVKNKU);
        }
    }

    /* renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m7716shuffleQwZRm1k(long[] shuffle) {
        e0.checkNotNullParameter(shuffle, "$this$shuffle");
        m7715shuffleJzugnMA(shuffle, g.f79860b);
    }

    /* renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m7717shuffleoSF2wD8(byte[] shuffle, g random) {
        e0.checkNotNullParameter(shuffle, "$this$shuffle");
        e0.checkNotNullParameter(random, "random");
        for (int lastIndex = uu.k0.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(shuffle, lastIndex);
            i0.m7050setVurrAj0(shuffle, lastIndex, i0.m7045getw2LRezQ(shuffle, iNextInt));
            i0.m7050setVurrAj0(shuffle, iNextInt, bM7045getw2LRezQ);
        }
    }

    /* renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m7718shufflerL5Bavg(short[] shuffle) {
        e0.checkNotNullParameter(shuffle, "$this$shuffle");
        m7719shuffles5X_as8(shuffle, g.f79860b);
    }

    /* renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m7719shuffles5X_as8(short[] shuffle, g random) {
        e0.checkNotNullParameter(shuffle, "$this$shuffle");
        e0.checkNotNullParameter(random, "random");
        for (int lastIndex = uu.k0.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            short sM7120getMh2AYeg = v0.m7120getMh2AYeg(shuffle, lastIndex);
            v0.m7125set01HTLdE(shuffle, lastIndex, v0.m7120getMh2AYeg(shuffle, iNextInt));
            v0.m7125set01HTLdE(shuffle, iNextInt, sM7120getMh2AYeg);
        }
    }

    /* renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final k0 m7720singleOrNullajY9A(int[] singleOrNull) {
        e0.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (m0.m7071getSizeimpl(singleOrNull) == 1) {
            return k0.m7055boximpl(m0.m7070getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final g0 m7721singleOrNullGBYM_sE(byte[] singleOrNull) {
        e0.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (i0.m7046getSizeimpl(singleOrNull) == 1) {
            return g0.m7030boximpl(i0.m7045getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final o0 m7722singleOrNullQwZRm1k(long[] singleOrNull) {
        e0.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (q0.m7096getSizeimpl(singleOrNull) == 1) {
            return o0.m7080boximpl(q0.m7095getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final t0 m7723singleOrNullrL5Bavg(short[] singleOrNull) {
        e0.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (v0.m7121getSizeimpl(singleOrNull) == 1) {
            return t0.m7105boximpl(v0.m7120getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    /* renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<o0> m7724sliceF7u83W8(long[] slice, Iterable<Integer> indices) {
        e0.checkNotNullParameter(slice, "$this$slice");
        e0.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = uu.q0.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(o0.m7080boximpl(q0.m7095getsVKNKU(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<k0> m7725sliceHwE9HBo(int[] slice, Iterable<Integer> indices) {
        e0.checkNotNullParameter(slice, "$this$slice");
        e0.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = uu.q0.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.m7055boximpl(m0.m7070getpVg5ArA(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<t0> m7726sliceJGPC0M(short[] slice, Iterable<Integer> indices) {
        e0.checkNotNullParameter(slice, "$this$slice");
        e0.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = uu.q0.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(t0.m7105boximpl(v0.m7120getMh2AYeg(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<g0> m7727sliceJQknh5Q(byte[] slice, Iterable<Integer> indices) {
        e0.checkNotNullParameter(slice, "$this$slice");
        e0.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = uu.q0.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(g0.m7030boximpl(i0.m7045getw2LRezQ(slice, it.next().intValue())));
        }
        return arrayList;
    }

    /* renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<t0> m7728sliceQ6IL4kU(short[] slice, m indices) {
        e0.checkNotNullParameter(slice, "$this$slice");
        e0.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? p0.emptyList() : e.m7583asListrL5Bavg(v0.m7115constructorimpl(f0.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<o0> m7729sliceZRhS8yI(long[] slice, m indices) {
        e0.checkNotNullParameter(slice, "$this$slice");
        e0.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? p0.emptyList() : e.m7582asListQwZRm1k(q0.m7090constructorimpl(f0.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<g0> m7730slicec0bezYM(byte[] slice, m indices) {
        e0.checkNotNullParameter(slice, "$this$slice");
        e0.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? p0.emptyList() : e.m7581asListGBYM_sE(i0.m7040constructorimpl(f0.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<k0> m7731slicetAntMlw(int[] slice, m indices) {
        e0.checkNotNullParameter(slice, "$this$slice");
        e0.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? p0.emptyList() : e.m7580asListajY9A(m0.m7065constructorimpl(f0.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    /* renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m7732sliceArrayCFIt9YE(int[] sliceArray, Collection<Integer> indices) {
        e0.checkNotNullParameter(sliceArray, "$this$sliceArray");
        e0.checkNotNullParameter(indices, "indices");
        return m0.m7065constructorimpl(uu.k0.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m7733sliceArrayQ6IL4kU(short[] sliceArray, m indices) {
        e0.checkNotNullParameter(sliceArray, "$this$sliceArray");
        e0.checkNotNullParameter(indices, "indices");
        return v0.m7115constructorimpl(uu.k0.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m7734sliceArrayZRhS8yI(long[] sliceArray, m indices) {
        e0.checkNotNullParameter(sliceArray, "$this$sliceArray");
        e0.checkNotNullParameter(indices, "indices");
        return q0.m7090constructorimpl(uu.k0.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m7735sliceArrayc0bezYM(byte[] sliceArray, m indices) {
        e0.checkNotNullParameter(sliceArray, "$this$sliceArray");
        e0.checkNotNullParameter(indices, "indices");
        return i0.m7040constructorimpl(uu.k0.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m7736sliceArraykzHmqpY(long[] sliceArray, Collection<Integer> indices) {
        e0.checkNotNullParameter(sliceArray, "$this$sliceArray");
        e0.checkNotNullParameter(indices, "indices");
        return q0.m7090constructorimpl(uu.k0.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m7737sliceArrayojwP5H8(short[] sliceArray, Collection<Integer> indices) {
        e0.checkNotNullParameter(sliceArray, "$this$sliceArray");
        e0.checkNotNullParameter(indices, "indices");
        return v0.m7115constructorimpl(uu.k0.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m7738sliceArraytAntMlw(int[] sliceArray, m indices) {
        e0.checkNotNullParameter(sliceArray, "$this$sliceArray");
        e0.checkNotNullParameter(indices, "indices");
        return m0.m7065constructorimpl(uu.k0.sliceArray(sliceArray, indices));
    }

    /* renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m7739sliceArrayxo_DsdI(byte[] sliceArray, Collection<Integer> indices) {
        e0.checkNotNullParameter(sliceArray, "$this$sliceArray");
        e0.checkNotNullParameter(indices, "indices");
        return i0.m7040constructorimpl(uu.k0.sliceArray(sliceArray, indices));
    }

    /* renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m7741sortnroSd4(long[] sort, int i10, int i11) {
        e0.checkNotNullParameter(sort, "$this$sort");
        uu.g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, q0.m7096getSizeimpl(sort));
        if (i10 < i11 - 1) {
            h2.m7404sortArraynroSd4(sort, i10, i11);
        }
    }

    /* renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m7742sortnroSd4$default(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = q0.m7096getSizeimpl(jArr);
        }
        m7741sortnroSd4(jArr, i10, i11);
    }

    /* renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m7743sort4UcCI2c(byte[] sort, int i10, int i11) {
        e0.checkNotNullParameter(sort, "$this$sort");
        uu.g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, i0.m7046getSizeimpl(sort));
        if (i10 < i11 - 1) {
            h2.m7405sortArray4UcCI2c(sort, i10, i11);
        }
    }

    /* renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m7744sort4UcCI2c$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = i0.m7046getSizeimpl(bArr);
        }
        m7743sort4UcCI2c(bArr, i10, i11);
    }

    /* renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m7745sortAa5vz7o(short[] sort, int i10, int i11) {
        e0.checkNotNullParameter(sort, "$this$sort");
        uu.g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, v0.m7121getSizeimpl(sort));
        if (i10 < i11 - 1) {
            h2.m7406sortArrayAa5vz7o(sort, i10, i11);
        }
    }

    /* renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m7746sortAa5vz7o$default(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = v0.m7121getSizeimpl(sArr);
        }
        m7745sortAa5vz7o(sArr, i10, i11);
    }

    /* renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m7747sortGBYM_sE(byte[] sort) {
        e0.checkNotNullParameter(sort, "$this$sort");
        if (i0.m7046getSizeimpl(sort) > 1) {
            h2.m7405sortArray4UcCI2c(sort, 0, i0.m7046getSizeimpl(sort));
        }
    }

    /* renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m7748sortQwZRm1k(long[] sort) {
        e0.checkNotNullParameter(sort, "$this$sort");
        if (q0.m7096getSizeimpl(sort) > 1) {
            h2.m7404sortArraynroSd4(sort, 0, q0.m7096getSizeimpl(sort));
        }
    }

    /* renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m7749sortoBK06Vg(int[] sort, int i10, int i11) {
        e0.checkNotNullParameter(sort, "$this$sort");
        uu.g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, m0.m7071getSizeimpl(sort));
        if (i10 < i11 - 1) {
            h2.m7407sortArrayoBK06Vg(sort, i10, i11);
        }
    }

    /* renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m7750sortoBK06Vg$default(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = m0.m7071getSizeimpl(iArr);
        }
        m7749sortoBK06Vg(iArr, i10, i11);
    }

    /* renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m7751sortrL5Bavg(short[] sort) {
        e0.checkNotNullParameter(sort, "$this$sort");
        if (v0.m7121getSizeimpl(sort) > 1) {
            h2.m7406sortArrayAa5vz7o(sort, 0, v0.m7121getSizeimpl(sort));
        }
    }

    /* renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m7752sortDescendingajY9A(int[] sortDescending) {
        e0.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (m0.m7071getSizeimpl(sortDescending) > 1) {
            m7740sortajY9A(sortDescending);
            uu.k0.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m7753sortDescendingnroSd4(long[] sortDescending, int i10, int i11) {
        e0.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m7741sortnroSd4(sortDescending, i10, i11);
        uu.k0.reverse(sortDescending, i10, i11);
    }

    /* renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m7754sortDescending4UcCI2c(byte[] sortDescending, int i10, int i11) {
        e0.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m7743sort4UcCI2c(sortDescending, i10, i11);
        uu.k0.reverse(sortDescending, i10, i11);
    }

    /* renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m7755sortDescendingAa5vz7o(short[] sortDescending, int i10, int i11) {
        e0.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m7745sortAa5vz7o(sortDescending, i10, i11);
        uu.k0.reverse(sortDescending, i10, i11);
    }

    /* renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m7756sortDescendingGBYM_sE(byte[] sortDescending) {
        e0.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (i0.m7046getSizeimpl(sortDescending) > 1) {
            m7747sortGBYM_sE(sortDescending);
            uu.k0.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m7757sortDescendingQwZRm1k(long[] sortDescending) {
        e0.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (q0.m7096getSizeimpl(sortDescending) > 1) {
            m7748sortQwZRm1k(sortDescending);
            uu.k0.reverse(sortDescending);
        }
    }

    /* renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m7758sortDescendingoBK06Vg(int[] sortDescending, int i10, int i11) {
        e0.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m7749sortoBK06Vg(sortDescending, i10, i11);
        uu.k0.reverse(sortDescending, i10, i11);
    }

    /* renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m7759sortDescendingrL5Bavg(short[] sortDescending) {
        e0.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (v0.m7121getSizeimpl(sortDescending) > 1) {
            m7751sortrL5Bavg(sortDescending);
            uu.k0.reverse(sortDescending);
        }
    }

    /* renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<k0> m7760sortedajY9A(int[] sorted) {
        e0.checkNotNullParameter(sorted, "$this$sorted");
        int[] iArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM7065constructorimpl = m0.m7065constructorimpl(iArrCopyOf);
        m7740sortajY9A(iArrM7065constructorimpl);
        return e.m7580asListajY9A(iArrM7065constructorimpl);
    }

    /* renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<g0> m7761sortedGBYM_sE(byte[] sorted) {
        e0.checkNotNullParameter(sorted, "$this$sorted");
        byte[] bArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM7040constructorimpl = i0.m7040constructorimpl(bArrCopyOf);
        m7747sortGBYM_sE(bArrM7040constructorimpl);
        return e.m7581asListGBYM_sE(bArrM7040constructorimpl);
    }

    /* renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<t0> m7763sortedrL5Bavg(short[] sorted) {
        e0.checkNotNullParameter(sorted, "$this$sorted");
        short[] sArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        e0.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM7115constructorimpl = v0.m7115constructorimpl(sArrCopyOf);
        m7751sortrL5Bavg(sArrM7115constructorimpl);
        return e.m7583asListrL5Bavg(sArrM7115constructorimpl);
    }

    /* renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m7764sortedArrayajY9A(int[] sortedArray) {
        e0.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (m0.m7073isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM7065constructorimpl = m0.m7065constructorimpl(iArrCopyOf);
        m7740sortajY9A(iArrM7065constructorimpl);
        return iArrM7065constructorimpl;
    }

    /* renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m7765sortedArrayGBYM_sE(byte[] sortedArray) {
        e0.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (i0.m7048isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM7040constructorimpl = i0.m7040constructorimpl(bArrCopyOf);
        m7747sortGBYM_sE(bArrM7040constructorimpl);
        return bArrM7040constructorimpl;
    }

    /* renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m7766sortedArrayQwZRm1k(long[] sortedArray) {
        e0.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (q0.m7098isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM7090constructorimpl = q0.m7090constructorimpl(jArrCopyOf);
        m7748sortQwZRm1k(jArrM7090constructorimpl);
        return jArrM7090constructorimpl;
    }

    /* renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m7767sortedArrayrL5Bavg(short[] sortedArray) {
        e0.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (v0.m7123isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        e0.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM7115constructorimpl = v0.m7115constructorimpl(sArrCopyOf);
        m7751sortrL5Bavg(sArrM7115constructorimpl);
        return sArrM7115constructorimpl;
    }

    /* renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m7768sortedArrayDescendingajY9A(int[] sortedArrayDescending) {
        e0.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (m0.m7073isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] iArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM7065constructorimpl = m0.m7065constructorimpl(iArrCopyOf);
        m7752sortDescendingajY9A(iArrM7065constructorimpl);
        return iArrM7065constructorimpl;
    }

    /* renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m7769sortedArrayDescendingGBYM_sE(byte[] sortedArrayDescending) {
        e0.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (i0.m7048isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] bArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM7040constructorimpl = i0.m7040constructorimpl(bArrCopyOf);
        m7756sortDescendingGBYM_sE(bArrM7040constructorimpl);
        return bArrM7040constructorimpl;
    }

    /* renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m7770sortedArrayDescendingQwZRm1k(long[] sortedArrayDescending) {
        e0.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (q0.m7098isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] jArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM7090constructorimpl = q0.m7090constructorimpl(jArrCopyOf);
        m7757sortDescendingQwZRm1k(jArrM7090constructorimpl);
        return jArrM7090constructorimpl;
    }

    /* renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m7771sortedArrayDescendingrL5Bavg(short[] sortedArrayDescending) {
        e0.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (v0.m7123isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] sArrCopyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        e0.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM7115constructorimpl = v0.m7115constructorimpl(sArrCopyOf);
        m7759sortDescendingrL5Bavg(sArrM7115constructorimpl);
        return sArrM7115constructorimpl;
    }

    /* renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<k0> m7772sortedDescendingajY9A(int[] sortedDescending) {
        e0.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] iArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        int[] iArrM7065constructorimpl = m0.m7065constructorimpl(iArrCopyOf);
        m7740sortajY9A(iArrM7065constructorimpl);
        return m7708reversedajY9A(iArrM7065constructorimpl);
    }

    /* renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<g0> m7773sortedDescendingGBYM_sE(byte[] sortedDescending) {
        e0.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] bArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        byte[] bArrM7040constructorimpl = i0.m7040constructorimpl(bArrCopyOf);
        m7747sortGBYM_sE(bArrM7040constructorimpl);
        return m7709reversedGBYM_sE(bArrM7040constructorimpl);
    }

    /* renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<o0> m7774sortedDescendingQwZRm1k(long[] sortedDescending) {
        e0.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] jArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM7090constructorimpl = q0.m7090constructorimpl(jArrCopyOf);
        m7748sortQwZRm1k(jArrM7090constructorimpl);
        return m7710reversedQwZRm1k(jArrM7090constructorimpl);
    }

    /* renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<t0> m7775sortedDescendingrL5Bavg(short[] sortedDescending) {
        e0.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] sArrCopyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        e0.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        short[] sArrM7115constructorimpl = v0.m7115constructorimpl(sArrCopyOf);
        m7751sortrL5Bavg(sArrM7115constructorimpl);
        return m7711reversedrL5Bavg(sArrM7115constructorimpl);
    }

    public static final int sumOfUByte(g0[] g0VarArr) {
        e0.checkNotNullParameter(g0VarArr, "<this>");
        int iM7056constructorimpl = 0;
        for (g0 g0Var : g0VarArr) {
            iM7056constructorimpl = k0.m7056constructorimpl(k0.m7056constructorimpl(g0Var.m7036unboximpl() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + iM7056constructorimpl);
        }
        return iM7056constructorimpl;
    }

    public static final int sumOfUInt(k0[] k0VarArr) {
        e0.checkNotNullParameter(k0VarArr, "<this>");
        int iM7056constructorimpl = 0;
        for (k0 k0Var : k0VarArr) {
            iM7056constructorimpl = k0.m7056constructorimpl(k0Var.m7061unboximpl() + iM7056constructorimpl);
        }
        return iM7056constructorimpl;
    }

    public static final long sumOfULong(o0[] o0VarArr) {
        e0.checkNotNullParameter(o0VarArr, "<this>");
        long jM7081constructorimpl = 0;
        for (o0 o0Var : o0VarArr) {
            jM7081constructorimpl = o0.m7081constructorimpl(o0Var.m7086unboximpl() + jM7081constructorimpl);
        }
        return jM7081constructorimpl;
    }

    public static final int sumOfUShort(t0[] t0VarArr) {
        e0.checkNotNullParameter(t0VarArr, "<this>");
        int iM7056constructorimpl = 0;
        for (t0 t0Var : t0VarArr) {
            iM7056constructorimpl = k0.m7056constructorimpl(k0.m7056constructorimpl(t0Var.m7111unboximpl() & 65535) + iM7056constructorimpl);
        }
        return iM7056constructorimpl;
    }

    /* renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<g0> m7776takePpDY95g(byte[] take, int i10) {
        e0.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        if (i10 >= i0.m7046getSizeimpl(take)) {
            return y0.toList(i0.m7038boximpl(take));
        }
        if (i10 == 1) {
            return uu.o0.listOf(g0.m7030boximpl(i0.m7045getw2LRezQ(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iM7046getSizeimpl = i0.m7046getSizeimpl(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iM7046getSizeimpl; i12++) {
            arrayList.add(g0.m7030boximpl(i0.m7045getw2LRezQ(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<t0> m7777takenggk6HY(short[] take, int i10) {
        e0.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        if (i10 >= v0.m7121getSizeimpl(take)) {
            return y0.toList(v0.m7113boximpl(take));
        }
        if (i10 == 1) {
            return uu.o0.listOf(t0.m7105boximpl(v0.m7120getMh2AYeg(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iM7121getSizeimpl = v0.m7121getSizeimpl(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iM7121getSizeimpl; i12++) {
            arrayList.add(t0.m7105boximpl(v0.m7120getMh2AYeg(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<k0> m7778takeqFRl0hI(int[] take, int i10) {
        e0.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        if (i10 >= m0.m7071getSizeimpl(take)) {
            return y0.toList(m0.m7063boximpl(take));
        }
        if (i10 == 1) {
            return uu.o0.listOf(k0.m7055boximpl(m0.m7070getpVg5ArA(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iM7071getSizeimpl = m0.m7071getSizeimpl(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iM7071getSizeimpl; i12++) {
            arrayList.add(k0.m7055boximpl(m0.m7070getpVg5ArA(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<o0> m7779taker7IrZao(long[] take, int i10) {
        e0.checkNotNullParameter(take, "$this$take");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        if (i10 >= q0.m7096getSizeimpl(take)) {
            return y0.toList(q0.m7088boximpl(take));
        }
        if (i10 == 1) {
            return uu.o0.listOf(o0.m7080boximpl(q0.m7095getsVKNKU(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i10);
        int iM7096getSizeimpl = q0.m7096getSizeimpl(take);
        int i11 = 0;
        for (int i12 = 0; i12 < iM7096getSizeimpl; i12++) {
            arrayList.add(o0.m7080boximpl(q0.m7095getsVKNKU(take, i12)));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<g0> m7780takeLastPpDY95g(byte[] takeLast, int i10) {
        e0.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        int iM7046getSizeimpl = i0.m7046getSizeimpl(takeLast);
        if (i10 >= iM7046getSizeimpl) {
            return y0.toList(i0.m7038boximpl(takeLast));
        }
        if (i10 == 1) {
            return uu.o0.listOf(g0.m7030boximpl(i0.m7045getw2LRezQ(takeLast, iM7046getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iM7046getSizeimpl - i10; i11 < iM7046getSizeimpl; i11++) {
            arrayList.add(g0.m7030boximpl(i0.m7045getw2LRezQ(takeLast, i11)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<t0> m7781takeLastnggk6HY(short[] takeLast, int i10) {
        e0.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        int iM7121getSizeimpl = v0.m7121getSizeimpl(takeLast);
        if (i10 >= iM7121getSizeimpl) {
            return y0.toList(v0.m7113boximpl(takeLast));
        }
        if (i10 == 1) {
            return uu.o0.listOf(t0.m7105boximpl(v0.m7120getMh2AYeg(takeLast, iM7121getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iM7121getSizeimpl - i10; i11 < iM7121getSizeimpl; i11++) {
            arrayList.add(t0.m7105boximpl(v0.m7120getMh2AYeg(takeLast, i11)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<k0> m7782takeLastqFRl0hI(int[] takeLast, int i10) {
        e0.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        int iM7071getSizeimpl = m0.m7071getSizeimpl(takeLast);
        if (i10 >= iM7071getSizeimpl) {
            return y0.toList(m0.m7063boximpl(takeLast));
        }
        if (i10 == 1) {
            return uu.o0.listOf(k0.m7055boximpl(m0.m7070getpVg5ArA(takeLast, iM7071getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iM7071getSizeimpl - i10; i11 < iM7071getSizeimpl; i11++) {
            arrayList.add(k0.m7055boximpl(m0.m7070getpVg5ArA(takeLast, i11)));
        }
        return arrayList;
    }

    /* renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<o0> m7783takeLastr7IrZao(long[] takeLast, int i10) {
        e0.checkNotNullParameter(takeLast, "$this$takeLast");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        int iM7096getSizeimpl = q0.m7096getSizeimpl(takeLast);
        if (i10 >= iM7096getSizeimpl) {
            return y0.toList(q0.m7088boximpl(takeLast));
        }
        if (i10 == 1) {
            return uu.o0.listOf(o0.m7080boximpl(q0.m7095getsVKNKU(takeLast, iM7096getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = iM7096getSizeimpl - i10; i11 < iM7096getSizeimpl; i11++) {
            arrayList.add(o0.m7080boximpl(q0.m7095getsVKNKU(takeLast, i11)));
        }
        return arrayList;
    }

    /* renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final k0[] m7784toTypedArrayajY9A(int[] toTypedArray) {
        e0.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM7071getSizeimpl = m0.m7071getSizeimpl(toTypedArray);
        k0[] k0VarArr = new k0[iM7071getSizeimpl];
        for (int i10 = 0; i10 < iM7071getSizeimpl; i10++) {
            k0VarArr[i10] = k0.m7055boximpl(m0.m7070getpVg5ArA(toTypedArray, i10));
        }
        return k0VarArr;
    }

    /* renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final g0[] m7785toTypedArrayGBYM_sE(byte[] toTypedArray) {
        e0.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM7046getSizeimpl = i0.m7046getSizeimpl(toTypedArray);
        g0[] g0VarArr = new g0[iM7046getSizeimpl];
        for (int i10 = 0; i10 < iM7046getSizeimpl; i10++) {
            g0VarArr[i10] = g0.m7030boximpl(i0.m7045getw2LRezQ(toTypedArray, i10));
        }
        return g0VarArr;
    }

    /* renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final o0[] m7786toTypedArrayQwZRm1k(long[] toTypedArray) {
        e0.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM7096getSizeimpl = q0.m7096getSizeimpl(toTypedArray);
        o0[] o0VarArr = new o0[iM7096getSizeimpl];
        for (int i10 = 0; i10 < iM7096getSizeimpl; i10++) {
            o0VarArr[i10] = o0.m7080boximpl(q0.m7095getsVKNKU(toTypedArray, i10));
        }
        return o0VarArr;
    }

    /* renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final t0[] m7787toTypedArrayrL5Bavg(short[] toTypedArray) {
        e0.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int iM7121getSizeimpl = v0.m7121getSizeimpl(toTypedArray);
        t0[] t0VarArr = new t0[iM7121getSizeimpl];
        for (int i10 = 0; i10 < iM7121getSizeimpl; i10++) {
            t0VarArr[i10] = t0.m7105boximpl(v0.m7120getMh2AYeg(toTypedArray, i10));
        }
        return t0VarArr;
    }

    public static final byte[] toUByteArray(g0[] g0VarArr) {
        e0.checkNotNullParameter(g0VarArr, "<this>");
        int length = g0VarArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = g0VarArr[i10].m7036unboximpl();
        }
        return i0.m7040constructorimpl(bArr);
    }

    public static final int[] toUIntArray(k0[] k0VarArr) {
        e0.checkNotNullParameter(k0VarArr, "<this>");
        int length = k0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = k0VarArr[i10].m7061unboximpl();
        }
        return m0.m7065constructorimpl(iArr);
    }

    public static final long[] toULongArray(o0[] o0VarArr) {
        e0.checkNotNullParameter(o0VarArr, "<this>");
        int length = o0VarArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = o0VarArr[i10].m7086unboximpl();
        }
        return q0.m7090constructorimpl(jArr);
    }

    public static final short[] toUShortArray(t0[] t0VarArr) {
        e0.checkNotNullParameter(t0VarArr, "<this>");
        int length = t0VarArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = t0VarArr[i10].m7111unboximpl();
        }
        return v0.m7115constructorimpl(sArr);
    }

    /* renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<g1> m7788withIndexajY9A(int[] withIndex) {
        e0.checkNotNullParameter(withIndex, "$this$withIndex");
        return new h1(new j0(withIndex, 1));
    }

    /* renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<g1> m7789withIndexGBYM_sE(byte[] withIndex) {
        e0.checkNotNullParameter(withIndex, "$this$withIndex");
        return new h1(new uu.i0(withIndex, 1));
    }

    /* renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<g1> m7790withIndexQwZRm1k(long[] withIndex) {
        e0.checkNotNullParameter(withIndex, "$this$withIndex");
        return new h1(new h0(withIndex, 1));
    }

    /* renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<g1> m7791withIndexrL5Bavg(short[] withIndex) {
        e0.checkNotNullParameter(withIndex, "$this$withIndex");
        return new h1(new uu.g0(withIndex, 1));
    }

    /* renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<tu.v> m7792zipCE_24M(int[] zip, R[] other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(m0.m7071getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM7070getpVg5ArA = m0.m7070getpVg5ArA(zip, i10);
            arrayList.add(tu.e0.to(k0.m7055boximpl(iM7070getpVg5ArA), other[i10]));
        }
        return arrayList;
    }

    /* renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<tu.v> m7793zipF7u83W8(long[] zip, Iterable<? extends R> other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iM7096getSizeimpl = q0.m7096getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(uu.q0.collectionSizeOrDefault(other, 10), iM7096getSizeimpl));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iM7096getSizeimpl) {
                break;
            }
            arrayList.add(tu.e0.to(o0.m7080boximpl(q0.m7095getsVKNKU(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    /* renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<tu.v> m7794zipHwE9HBo(int[] zip, Iterable<? extends R> other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iM7071getSizeimpl = m0.m7071getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(uu.q0.collectionSizeOrDefault(other, 10), iM7071getSizeimpl));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iM7071getSizeimpl) {
                break;
            }
            arrayList.add(tu.e0.to(k0.m7055boximpl(m0.m7070getpVg5ArA(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    /* renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<tu.v> m7795zipJGPC0M(short[] zip, Iterable<? extends R> other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iM7121getSizeimpl = v0.m7121getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(uu.q0.collectionSizeOrDefault(other, 10), iM7121getSizeimpl));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iM7121getSizeimpl) {
                break;
            }
            arrayList.add(tu.e0.to(t0.m7105boximpl(v0.m7120getMh2AYeg(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    /* renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<tu.v> m7796zipJQknh5Q(byte[] zip, Iterable<? extends R> other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iM7046getSizeimpl = i0.m7046getSizeimpl(zip);
        ArrayList arrayList = new ArrayList(Math.min(uu.q0.collectionSizeOrDefault(other, 10), iM7046getSizeimpl));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= iM7046getSizeimpl) {
                break;
            }
            arrayList.add(tu.e0.to(g0.m7030boximpl(i0.m7045getw2LRezQ(zip, i10)), r10));
            i10++;
        }
        return arrayList;
    }

    /* renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<tu.v> m7797zipctEhBpI(int[] zip, int[] other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(m0.m7071getSizeimpl(zip), m0.m7071getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(tu.e0.to(k0.m7055boximpl(m0.m7070getpVg5ArA(zip, i10)), k0.m7055boximpl(m0.m7070getpVg5ArA(other, i10))));
        }
        return arrayList;
    }

    /* renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<tu.v> m7798zipf7H3mmw(long[] zip, R[] other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(q0.m7096getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long jM7095getsVKNKU = q0.m7095getsVKNKU(zip, i10);
            arrayList.add(tu.e0.to(o0.m7080boximpl(jM7095getsVKNKU), other[i10]));
        }
        return arrayList;
    }

    /* renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<tu.v> m7799zipkdPth3s(byte[] zip, byte[] other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(i0.m7046getSizeimpl(zip), i0.m7046getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(tu.e0.to(g0.m7030boximpl(i0.m7045getw2LRezQ(zip, i10)), g0.m7030boximpl(i0.m7045getw2LRezQ(other, i10))));
        }
        return arrayList;
    }

    /* renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<tu.v> m7800zipmazbYpA(short[] zip, short[] other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(v0.m7121getSizeimpl(zip), v0.m7121getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(tu.e0.to(t0.m7105boximpl(v0.m7120getMh2AYeg(zip, i10)), t0.m7105boximpl(v0.m7120getMh2AYeg(other, i10))));
        }
        return arrayList;
    }

    /* renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<tu.v> m7801zipnl983wc(byte[] zip, R[] other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(i0.m7046getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(zip, i10);
            arrayList.add(tu.e0.to(g0.m7030boximpl(bM7045getw2LRezQ), other[i10]));
        }
        return arrayList;
    }

    /* renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<tu.v> m7802zipuaTIQ5s(short[] zip, R[] other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(v0.m7121getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            short sM7120getMh2AYeg = v0.m7120getMh2AYeg(zip, i10);
            arrayList.add(tu.e0.to(t0.m7105boximpl(sM7120getMh2AYeg), other[i10]));
        }
        return arrayList;
    }

    /* renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<tu.v> m7803zipus8wMrg(long[] zip, long[] other) {
        e0.checkNotNullParameter(zip, "$this$zip");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(q0.m7096getSizeimpl(zip), q0.m7096getSizeimpl(other));
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(tu.e0.to(o0.m7080boximpl(q0.m7095getsVKNKU(zip, i10)), o0.m7080boximpl(q0.m7095getsVKNKU(other, i10))));
        }
        return arrayList;
    }

    /* renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m7616contentToString2csIQuQ(byte[] bArr) {
        String strJoinToString$default;
        return (bArr == null || (strJoinToString$default = y0.joinToString$default(i0.m7038boximpl(bArr), UeklptUrP.aSgWardKNKOux, C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, null, 56, null)) == null) ? AbstractJsonLexerKt.NULL : strJoinToString$default;
    }

    /* renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m7740sortajY9A(int[] iArr) {
        e0.checkNotNullParameter(iArr, gjnZrsdA.PycU);
        if (m0.m7071getSizeimpl(iArr) > 1) {
            h2.m7407sortArrayoBK06Vg(iArr, 0, m0.m7071getSizeimpl(iArr));
        }
    }

    /* renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<o0> m7762sortedQwZRm1k(long[] sorted) {
        e0.checkNotNullParameter(sorted, "$this$sorted");
        long[] jArrCopyOf = Arrays.copyOf(sorted, sorted.length);
        e0.checkNotNullExpressionValue(jArrCopyOf, uQjDr.oaJvSYaUNSffaQS);
        long[] jArrM7090constructorimpl = q0.m7090constructorimpl(jArrCopyOf);
        m7748sortQwZRm1k(jArrM7090constructorimpl);
        return e.m7582asListQwZRm1k(jArrM7090constructorimpl);
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m7670maxOrThrowU(long[] max) {
        e0.checkNotNullParameter(max, "$this$max");
        if (!q0.m7098isEmptyimpl(max)) {
            long jM7095getsVKNKU = q0.m7095getsVKNKU(max, 0);
            int lastIndex = uu.k0.getLastIndex(max);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM7095getsVKNKU2 = q0.m7095getsVKNKU(max, i10);
                    if (Long.compare(jM7095getsVKNKU ^ Long.MIN_VALUE, Long.MIN_VALUE ^ jM7095getsVKNKU2) < 0) {
                        jM7095getsVKNKU = jM7095getsVKNKU2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return jM7095getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m7678maxWithOrThrowU(long[] maxWith, Comparator<? super o0> comparator) {
        e0.checkNotNullParameter(maxWith, "$this$maxWith");
        e0.checkNotNullParameter(comparator, "comparator");
        if (!q0.m7098isEmptyimpl(maxWith)) {
            long jM7095getsVKNKU = q0.m7095getsVKNKU(maxWith, 0);
            int lastIndex = uu.k0.getLastIndex(maxWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM7095getsVKNKU2 = q0.m7095getsVKNKU(maxWith, i10);
                    if (comparator.compare(o0.m7080boximpl(jM7095getsVKNKU), o0.m7080boximpl(jM7095getsVKNKU2)) < 0) {
                        jM7095getsVKNKU = jM7095getsVKNKU2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return jM7095getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m7686minOrThrowU(long[] min) {
        e0.checkNotNullParameter(min, "$this$min");
        if (!q0.m7098isEmptyimpl(min)) {
            long jM7095getsVKNKU = q0.m7095getsVKNKU(min, 0);
            int lastIndex = uu.k0.getLastIndex(min);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM7095getsVKNKU2 = q0.m7095getsVKNKU(min, i10);
                    if (Long.compare(jM7095getsVKNKU ^ Long.MIN_VALUE, Long.MIN_VALUE ^ jM7095getsVKNKU2) > 0) {
                        jM7095getsVKNKU = jM7095getsVKNKU2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return jM7095getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m7694minWithOrThrowU(long[] minWith, Comparator<? super o0> comparator) {
        e0.checkNotNullParameter(minWith, "$this$minWith");
        e0.checkNotNullParameter(comparator, "comparator");
        if (!q0.m7098isEmptyimpl(minWith)) {
            long jM7095getsVKNKU = q0.m7095getsVKNKU(minWith, 0);
            int lastIndex = uu.k0.getLastIndex(minWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM7095getsVKNKU2 = q0.m7095getsVKNKU(minWith, i10);
                    if (comparator.compare(o0.m7080boximpl(jM7095getsVKNKU), o0.m7080boximpl(jM7095getsVKNKU2)) > 0) {
                        jM7095getsVKNKU = jM7095getsVKNKU2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return jM7095getsVKNKU;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m7668maxOrThrowU(byte[] max) {
        e0.checkNotNullParameter(max, "$this$max");
        if (!i0.m7048isEmptyimpl(max)) {
            byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(max, 0);
            int lastIndex = uu.k0.getLastIndex(max);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM7045getw2LRezQ2 = i0.m7045getw2LRezQ(max, i10);
                    if (e0.compare(bM7045getw2LRezQ & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, bM7045getw2LRezQ2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 0) {
                        bM7045getw2LRezQ = bM7045getw2LRezQ2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return bM7045getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m7676maxWithOrThrowU(byte[] maxWith, Comparator<? super g0> comparator) {
        e0.checkNotNullParameter(maxWith, "$this$maxWith");
        e0.checkNotNullParameter(comparator, "comparator");
        if (!i0.m7048isEmptyimpl(maxWith)) {
            byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(maxWith, 0);
            int lastIndex = uu.k0.getLastIndex(maxWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM7045getw2LRezQ2 = i0.m7045getw2LRezQ(maxWith, i10);
                    if (comparator.compare(g0.m7030boximpl(bM7045getw2LRezQ), g0.m7030boximpl(bM7045getw2LRezQ2)) < 0) {
                        bM7045getw2LRezQ = bM7045getw2LRezQ2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return bM7045getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m7684minOrThrowU(byte[] min) {
        e0.checkNotNullParameter(min, "$this$min");
        if (!i0.m7048isEmptyimpl(min)) {
            byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(min, 0);
            int lastIndex = uu.k0.getLastIndex(min);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM7045getw2LRezQ2 = i0.m7045getw2LRezQ(min, i10);
                    if (e0.compare(bM7045getw2LRezQ & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, bM7045getw2LRezQ2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) > 0) {
                        bM7045getw2LRezQ = bM7045getw2LRezQ2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return bM7045getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m7692minWithOrThrowU(byte[] minWith, Comparator<? super g0> comparator) {
        e0.checkNotNullParameter(minWith, "$this$minWith");
        e0.checkNotNullParameter(comparator, "comparator");
        if (!i0.m7048isEmptyimpl(minWith)) {
            byte bM7045getw2LRezQ = i0.m7045getw2LRezQ(minWith, 0);
            int lastIndex = uu.k0.getLastIndex(minWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM7045getw2LRezQ2 = i0.m7045getw2LRezQ(minWith, i10);
                    if (comparator.compare(g0.m7030boximpl(bM7045getw2LRezQ), g0.m7030boximpl(bM7045getw2LRezQ2)) > 0) {
                        bM7045getw2LRezQ = bM7045getw2LRezQ2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return bM7045getw2LRezQ;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m7671maxOrThrowU(short[] max) {
        e0.checkNotNullParameter(max, "$this$max");
        if (!v0.m7123isEmptyimpl(max)) {
            short sM7120getMh2AYeg = v0.m7120getMh2AYeg(max, 0);
            int lastIndex = uu.k0.getLastIndex(max);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM7120getMh2AYeg2 = v0.m7120getMh2AYeg(max, i10);
                    if (e0.compare(sM7120getMh2AYeg & 65535, 65535 & sM7120getMh2AYeg2) < 0) {
                        sM7120getMh2AYeg = sM7120getMh2AYeg2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return sM7120getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m7679maxWithOrThrowU(short[] maxWith, Comparator<? super t0> comparator) {
        e0.checkNotNullParameter(maxWith, "$this$maxWith");
        e0.checkNotNullParameter(comparator, "comparator");
        if (!v0.m7123isEmptyimpl(maxWith)) {
            short sM7120getMh2AYeg = v0.m7120getMh2AYeg(maxWith, 0);
            int lastIndex = uu.k0.getLastIndex(maxWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM7120getMh2AYeg2 = v0.m7120getMh2AYeg(maxWith, i10);
                    if (comparator.compare(t0.m7105boximpl(sM7120getMh2AYeg), t0.m7105boximpl(sM7120getMh2AYeg2)) < 0) {
                        sM7120getMh2AYeg = sM7120getMh2AYeg2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return sM7120getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m7687minOrThrowU(short[] min) {
        e0.checkNotNullParameter(min, "$this$min");
        if (!v0.m7123isEmptyimpl(min)) {
            short sM7120getMh2AYeg = v0.m7120getMh2AYeg(min, 0);
            int lastIndex = uu.k0.getLastIndex(min);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM7120getMh2AYeg2 = v0.m7120getMh2AYeg(min, i10);
                    if (e0.compare(sM7120getMh2AYeg & 65535, 65535 & sM7120getMh2AYeg2) > 0) {
                        sM7120getMh2AYeg = sM7120getMh2AYeg2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return sM7120getMh2AYeg;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m7695minWithOrThrowU(short[] minWith, Comparator<? super t0> comparator) {
        e0.checkNotNullParameter(minWith, "$this$minWith");
        e0.checkNotNullParameter(comparator, "comparator");
        if (!v0.m7123isEmptyimpl(minWith)) {
            short sM7120getMh2AYeg = v0.m7120getMh2AYeg(minWith, 0);
            int lastIndex = uu.k0.getLastIndex(minWith);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM7120getMh2AYeg2 = v0.m7120getMh2AYeg(minWith, i10);
                    if (comparator.compare(t0.m7105boximpl(sM7120getMh2AYeg), t0.m7105boximpl(sM7120getMh2AYeg2)) > 0) {
                        sM7120getMh2AYeg = sM7120getMh2AYeg2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return sM7120getMh2AYeg;
        }
        throw new NoSuchElementException();
    }
}
