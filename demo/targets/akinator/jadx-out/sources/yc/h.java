package yc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h extends u {

    /* renamed from: b, reason: collision with root package name */
    public final double f94316b;

    public h(double d10) {
        this.f94316b = d10;
    }

    public static h valueOf(double d10) {
        return new h(d10);
    }

    @Override // yc.u, jc.t
    public String asText() {
        return cc.n.toString(this.f94316b);
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_NUMBER_FLOAT;
    }

    @Override // yc.u, jc.t
    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    @Override // jc.t
    public boolean canConvertToExactIntegral() {
        double d10 = this.f94316b;
        return (Double.isNaN(d10) || Double.isInfinite(d10) || d10 != Math.rint(d10)) ? false : true;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToInt() {
        double d10 = this.f94316b;
        return d10 >= -2.147483648E9d && d10 <= 2.147483647E9d;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToLong() {
        double d10 = this.f94316b;
        return d10 >= -9.223372036854776E18d && d10 <= 9.223372036854776E18d;
    }

    @Override // yc.u, jc.t
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this.f94316b);
    }

    @Override // yc.u, jc.t
    public double doubleValue() {
        return this.f94316b;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            if (Double.compare(this.f94316b, ((h) obj).f94316b) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // jc.t
    public float floatValue() {
        return (float) this.f94316b;
    }

    @Override // yc.b
    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f94316b);
        return ((int) (jDoubleToLongBits >> 32)) ^ ((int) jDoubleToLongBits);
    }

    @Override // yc.u, jc.t
    public int intValue() {
        return (int) this.f94316b;
    }

    @Override // jc.t
    public boolean isDouble() {
        return true;
    }

    @Override // jc.t
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override // yc.u
    public boolean isNaN() {
        double d10 = this.f94316b;
        return Double.isNaN(d10) || Double.isInfinite(d10);
    }

    @Override // yc.u, jc.t
    public long longValue() {
        return (long) this.f94316b;
    }

    @Override // yc.u, yc.b, jc.t, ub.o0
    public ub.s numberType() {
        return ub.s.f88353g;
    }

    @Override // yc.u, jc.t
    public Number numberValue() {
        return Double.valueOf(this.f94316b);
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeNumber(this.f94316b);
    }

    @Override // jc.t
    public short shortValue() {
        return (short) this.f94316b;
    }
}
