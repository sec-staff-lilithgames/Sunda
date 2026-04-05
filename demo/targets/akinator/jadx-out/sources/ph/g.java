package ph;

import j1.o2;
import java.math.RoundingMode;
import java.util.Arrays;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f81301a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f81302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f81304d;

    /* renamed from: e, reason: collision with root package name */
    public final int f81305e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81306f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f81307g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f81308h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f81309i;

    public g(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.f81301a = (String) p1.checkNotNull(str);
        this.f81302b = (char[]) p1.checkNotNull(cArr);
        try {
            int iLog2 = qh.f.log2(cArr.length, RoundingMode.UNNECESSARY);
            this.f81304d = iLog2;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iLog2);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f81305e = i10;
            this.f81306f = iLog2 >> iNumberOfTrailingZeros;
            this.f81303c = cArr.length - 1;
            this.f81307g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f81306f; i11++) {
                zArr[qh.f.divide(i11 * 8, this.f81304d, RoundingMode.CEILING)] = true;
            }
            this.f81308h = zArr;
            this.f81309i = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }

    public final int a(char c10) throws j {
        if (c10 > 127) {
            throw new j(w0.i.b(c10, new StringBuilder("Unrecognized character: 0x")));
        }
        byte b10 = this.f81307g[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new j(w0.i.b(c10, new StringBuilder("Unrecognized character: 0x")));
        }
        throw new j("Unrecognized character: " + c10);
    }

    public final g b() {
        if (this.f81309i) {
            return this;
        }
        byte[] bArr = this.f81307g;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i10 = 65;
        while (true) {
            if (i10 > 90) {
                return new g(o2.o(new StringBuilder(), this.f81301a, ".ignoreCase()"), this.f81302b, bArrCopyOf, true);
            }
            int i11 = i10 | 32;
            byte b10 = bArr[i10];
            byte b11 = bArr[i11];
            if (b10 == -1) {
                bArrCopyOf[i10] = b11;
            } else {
                p1.checkState(b11 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i10, (char) i11);
                bArrCopyOf[i11] = b10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f81309i == gVar.f81309i && Arrays.equals(this.f81302b, gVar.f81302b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f81302b) + (this.f81309i ? 1231 : 1237);
    }

    public boolean matches(char c10) {
        byte[] bArr = this.f81307g;
        return c10 < bArr.length && bArr[c10] != -1;
    }

    public String toString() {
        return this.f81301a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            p1.checkArgument(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            p1.checkArgument(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }
}
