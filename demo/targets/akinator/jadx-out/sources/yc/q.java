package yc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q extends u {

    /* renamed from: b, reason: collision with root package name */
    public final long f94341b;

    public q(long j10) {
        this.f94341b = j10;
    }

    public static q valueOf(long j10) {
        return new q(j10);
    }

    @Override // jc.t
    public boolean asBoolean(boolean z10) {
        return this.f94341b != 0;
    }

    @Override // yc.u, jc.t
    public String asText() {
        return cc.n.toString(this.f94341b);
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_NUMBER_INT;
    }

    @Override // yc.u, jc.t
    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this.f94341b);
    }

    @Override // yc.u, jc.t
    public boolean canConvertToInt() {
        long j10 = this.f94341b;
        return j10 >= -2147483648L && j10 <= 2147483647L;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToLong() {
        return true;
    }

    @Override // yc.u, jc.t
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this.f94341b);
    }

    @Override // yc.u, jc.t
    public double doubleValue() {
        return this.f94341b;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof q) && ((q) obj).f94341b == this.f94341b;
    }

    @Override // jc.t
    public float floatValue() {
        return this.f94341b;
    }

    @Override // yc.b
    public int hashCode() {
        long j10 = this.f94341b;
        return ((int) (j10 >> 32)) ^ ((int) j10);
    }

    @Override // yc.u, jc.t
    public int intValue() {
        return (int) this.f94341b;
    }

    @Override // jc.t
    public boolean isIntegralNumber() {
        return true;
    }

    @Override // jc.t
    public boolean isLong() {
        return true;
    }

    @Override // yc.u, jc.t
    public long longValue() {
        return this.f94341b;
    }

    @Override // yc.u, yc.b, jc.t, ub.o0
    public ub.s numberType() {
        return ub.s.f88350c;
    }

    @Override // yc.u, jc.t
    public Number numberValue() {
        return Long.valueOf(this.f94341b);
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeNumber(this.f94341b);
    }

    @Override // jc.t
    public short shortValue() {
        return (short) this.f94341b;
    }
}
