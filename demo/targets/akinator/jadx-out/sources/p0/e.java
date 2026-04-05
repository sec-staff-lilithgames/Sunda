package p0;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f80192a;

    /* renamed from: b, reason: collision with root package name */
    public long f80193b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f80194c = u4.f80513a;

    public final boolean get(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.f80192a) != 0;
        }
        if (i10 < 128) {
            return ((1 << (i10 - 64)) & this.f80193b) != 0;
        }
        long[] jArr = this.f80194c;
        int length = jArr.length;
        if (length != 0 && (i10 / 64) - 2 < length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    public final int getSize() {
        return (this.f80194c.length + 2) * 64;
    }

    public final int nextClear(int i10) {
        int iNumberOfTrailingZeros;
        if (i10 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.f80192a) >>> i10) << i10)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i10 < 128) {
            int i11 = i10 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.f80193b) >>> i11) << i11);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i10, 128);
        int i12 = (iMax / 64) - 2;
        long[] jArr = this.f80194c;
        int length = jArr.length;
        for (int i13 = i12; i13 < length; i13++) {
            long j10 = ~jArr[i13];
            if (i13 == i12) {
                int i14 = iMax % 64;
                j10 = (j10 >>> i14) << i14;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j10);
            if (iNumberOfTrailingZeros3 < 64) {
                return j1.o2.B(i13, 64, 128, iNumberOfTrailingZeros3);
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int nextSet(int i10) {
        int iNumberOfTrailingZeros;
        if (i10 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((this.f80192a >>> i10) << i10)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i10 < 128) {
            int i11 = i10 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.f80193b >>> i11) << i11);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i10, 128);
        int i12 = (iMax / 64) - 2;
        long[] jArr = this.f80194c;
        int length = jArr.length;
        for (int i13 = i12; i13 < length; i13++) {
            long j10 = jArr[i13];
            if (i13 == i12) {
                int i14 = iMax % 64;
                j10 = (j10 >>> i14) << i14;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j10);
            if (iNumberOfTrailingZeros3 < 64) {
                return j1.o2.B(i13, 64, 128, iNumberOfTrailingZeros3);
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void set(int i10, boolean z10) {
        if (i10 < 64) {
            this.f80192a = ((z10 ? 1L : 0L) << i10) | ((~(1 << i10)) & this.f80192a);
            return;
        }
        if (i10 < 128) {
            this.f80193b = ((z10 ? 1L : 0L) << i10) | ((~(1 << (i10 - 64))) & this.f80193b);
            return;
        }
        int i11 = i10 / 64;
        int i12 = i11 - 2;
        int i13 = i10 % 64;
        long j10 = 1 << i13;
        long[] jArrCopyOf = this.f80194c;
        if (i12 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11 - 1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f80194c = jArrCopyOf;
        }
        jArrCopyOf[i12] = ((z10 ? 1L : 0L) << i13) | ((~j10) & jArrCopyOf[i12]);
    }

    public final void setRange(int i10, int i11) {
        long j10 = i10 < i11 ? -1L : 0L;
        this.f80192a = ((((i10 < 64 ? 1 : 0) * j10) >>> (64 - (Math.min(64, i11) - i10))) << i10) | this.f80192a;
        if (i11 > 64) {
            int iMax = Math.max(i10, 64);
            this.f80193b = (((j10 * (iMax < 128 ? 1 : 0)) >>> (128 - (Math.min(128, i11) - iMax))) << iMax) | this.f80193b;
            if (i11 > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < i11; iMax2++) {
                    set(iMax2, true);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BitVector [");
        int size = getSize();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            if (get(i10)) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(i10);
                z10 = false;
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
