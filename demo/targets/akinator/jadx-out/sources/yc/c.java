package yc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c extends u {

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f94300c = BigInteger.valueOf(-2147483648L);

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f94301e = BigInteger.valueOf(2147483647L);

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f94302f = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f94303g = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f94304b;

    public c(BigInteger bigInteger) {
        this.f94304b = bigInteger;
    }

    public static c valueOf(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // jc.t
    public boolean asBoolean(boolean z10) {
        return !BigInteger.ZERO.equals(this.f94304b);
    }

    @Override // yc.u, jc.t
    public String asText() {
        return this.f94304b.toString();
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_NUMBER_INT;
    }

    @Override // yc.u, jc.t
    public BigInteger bigIntegerValue() {
        return this.f94304b;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToInt() {
        BigInteger bigInteger = f94300c;
        BigInteger bigInteger2 = this.f94304b;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(f94301e) <= 0;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToLong() {
        BigInteger bigInteger = f94302f;
        BigInteger bigInteger2 = this.f94304b;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(f94303g) <= 0;
    }

    @Override // yc.u, jc.t
    public BigDecimal decimalValue() {
        return new BigDecimal(this.f94304b);
    }

    @Override // yc.u, jc.t
    public double doubleValue() {
        return this.f94304b.doubleValue();
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            return Objects.equals(((c) obj).f94304b, this.f94304b);
        }
        return false;
    }

    @Override // jc.t
    public float floatValue() {
        return this.f94304b.floatValue();
    }

    @Override // yc.b
    public int hashCode() {
        return Objects.hashCode(this.f94304b);
    }

    @Override // yc.u, jc.t
    public int intValue() {
        return this.f94304b.intValue();
    }

    @Override // jc.t
    public boolean isBigInteger() {
        return true;
    }

    @Override // jc.t
    public boolean isIntegralNumber() {
        return true;
    }

    @Override // yc.u, jc.t
    public long longValue() {
        return this.f94304b.longValue();
    }

    @Override // yc.u, yc.b, jc.t, ub.o0
    public ub.s numberType() {
        return ub.s.f88351e;
    }

    @Override // yc.u, jc.t
    public Number numberValue() {
        return this.f94304b;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeNumber(this.f94304b);
    }

    @Override // jc.t
    public short shortValue() {
        return this.f94304b.shortValue();
    }
}
