package yc;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u extends a0 {
    @Override // jc.t
    public final double asDouble() {
        return doubleValue();
    }

    @Override // jc.t
    public final int asInt() {
        return intValue();
    }

    @Override // jc.t
    public final long asLong() {
        return longValue();
    }

    @Override // jc.t
    public abstract String asText();

    @Override // jc.t
    public abstract BigInteger bigIntegerValue();

    @Override // jc.t
    public abstract boolean canConvertToInt();

    @Override // jc.t
    public abstract boolean canConvertToLong();

    @Override // jc.t
    public abstract BigDecimal decimalValue();

    @Override // jc.t
    public abstract double doubleValue();

    @Override // jc.t
    public final p getNodeType() {
        return p.f94336h;
    }

    @Override // jc.t
    public abstract int intValue();

    public boolean isNaN() {
        return false;
    }

    @Override // jc.t
    public abstract long longValue();

    @Override // yc.b, jc.t, ub.o0
    public abstract ub.s numberType();

    @Override // jc.t
    public abstract Number numberValue();

    @Override // jc.t
    public final double asDouble(double d10) {
        return doubleValue();
    }

    @Override // jc.t
    public final int asInt(int i10) {
        return intValue();
    }

    @Override // jc.t
    public final long asLong(long j10) {
        return longValue();
    }
}
