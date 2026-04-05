package yc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import jc.u0;
import ub.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g extends u {

    /* renamed from: c, reason: collision with root package name */
    public static final BigDecimal f94311c;

    /* renamed from: e, reason: collision with root package name */
    public static final BigDecimal f94312e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigDecimal f94313f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigDecimal f94314g;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f94315b;

    static {
        new g(BigDecimal.ZERO);
        f94311c = BigDecimal.valueOf(-2147483648L);
        f94312e = BigDecimal.valueOf(2147483647L);
        f94313f = BigDecimal.valueOf(Long.MIN_VALUE);
        f94314g = BigDecimal.valueOf(Long.MAX_VALUE);
    }

    public g(BigDecimal bigDecimal) {
        this.f94315b = bigDecimal;
    }

    public static g valueOf(BigDecimal bigDecimal) {
        return new g(bigDecimal);
    }

    @Override // yc.u, jc.t
    public String asText() {
        return this.f94315b.toString();
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_NUMBER_FLOAT;
    }

    @Override // yc.u, jc.t
    public BigInteger bigIntegerValue() throws IOException {
        BigDecimal bigDecimal = this.f94315b;
        try {
            f0.defaults().validateBigIntegerScale(bigDecimal.scale());
        } catch (xb.b e10) {
            dd.p.throwSneaky(e10);
        }
        return bigDecimal.toBigInteger();
    }

    @Override // jc.t
    public boolean canConvertToExactIntegral() {
        BigDecimal bigDecimal = this.f94315b;
        if (bigDecimal.signum() == 0 || bigDecimal.scale() <= 0) {
            return true;
        }
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).scale() <= 0;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToInt() {
        BigDecimal bigDecimal = f94311c;
        BigDecimal bigDecimal2 = this.f94315b;
        return bigDecimal2.compareTo(bigDecimal) >= 0 && bigDecimal2.compareTo(f94312e) <= 0;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToLong() {
        BigDecimal bigDecimal = f94313f;
        BigDecimal bigDecimal2 = this.f94315b;
        return bigDecimal2.compareTo(bigDecimal) >= 0 && bigDecimal2.compareTo(f94314g) <= 0;
    }

    @Override // yc.u, jc.t
    public BigDecimal decimalValue() {
        return this.f94315b;
    }

    @Override // yc.u, jc.t
    public double doubleValue() {
        return this.f94315b.doubleValue();
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            BigDecimal bigDecimal = ((g) obj).f94315b;
            BigDecimal bigDecimal2 = this.f94315b;
            if (bigDecimal == null) {
                return bigDecimal2 == null;
            }
            if (bigDecimal2 != null && bigDecimal.compareTo(bigDecimal2) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // jc.t
    public float floatValue() {
        return this.f94315b.floatValue();
    }

    @Override // yc.b
    public int hashCode() {
        if (this.f94315b == null) {
            return 0;
        }
        return Double.hashCode(doubleValue());
    }

    @Override // yc.u, jc.t
    public int intValue() {
        return this.f94315b.intValue();
    }

    @Override // jc.t
    public boolean isBigDecimal() {
        return true;
    }

    @Override // jc.t
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override // yc.u, jc.t
    public long longValue() {
        return this.f94315b.longValue();
    }

    @Override // yc.u, yc.b, jc.t, ub.o0
    public ub.s numberType() {
        return ub.s.f88354h;
    }

    @Override // yc.u, jc.t
    public Number numberValue() {
        return this.f94315b;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeNumber(this.f94315b);
    }

    @Override // jc.t
    public short shortValue() {
        return this.f94315b.shortValue();
    }
}
