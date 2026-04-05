package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class g extends j {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f68544g;

    public g(j$.time.temporal.p pVar, int i10, int i11, boolean z10) {
        this(pVar, i10, i11, z10, 0);
        Objects.requireNonNull(pVar, "field");
        j$.time.temporal.t tVarRange = pVar.range();
        if (tVarRange.f68663a != tVarRange.f68664b || tVarRange.f68665c != tVarRange.f68666d) {
            throw new IllegalArgumentException(j$.time.d.a("Field must have a fixed set of values: ", pVar));
        }
        if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
    }

    public g(j$.time.temporal.p pVar, int i10, int i11, boolean z10, int i12) {
        super(pVar, i10, i11, a0.NOT_NEGATIVE, i12);
        this.f68544g = z10;
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.f68552e == -1) {
            return this;
        }
        return new g(this.f68548a, this.f68549b, this.f68550c, this.f68544g, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i10) {
        return new g(this.f68548a, this.f68549b, this.f68550c, this.f68544g, this.f68552e + i10);
    }

    @Override // j$.time.format.j, j$.time.format.f
    public final boolean r(u uVar, StringBuilder sb2) {
        j$.time.temporal.p pVar = this.f68548a;
        Long lA = uVar.a(pVar);
        if (lA == null) {
            return false;
        }
        y yVar = uVar.f68589b.f68533c;
        long jLongValue = lA.longValue();
        j$.time.temporal.t tVarRange = pVar.range();
        tVarRange.b(jLongValue, pVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(tVarRange.f68663a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(tVarRange.f68666d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z10 = this.f68544g;
        int i10 = this.f68549b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f68550c), roundingMode).toPlainString().substring(2);
            yVar.getClass();
            if (z10) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i10 > 0) {
            if (z10) {
                yVar.getClass();
                sb2.append('.');
            }
            for (int i11 = 0; i11 < i10; i11++) {
                yVar.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.f68548a + "," + this.f68549b + "," + this.f68550c + (this.f68544g ? ",DecimalPoint" : "") + ")";
    }
}
