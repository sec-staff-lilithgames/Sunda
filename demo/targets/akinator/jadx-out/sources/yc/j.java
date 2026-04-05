package yc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j extends u {

    /* renamed from: c, reason: collision with root package name */
    public static final j[] f94318c = new j[12];

    /* renamed from: b, reason: collision with root package name */
    public final int f94319b;

    static {
        for (int i10 = 0; i10 < 12; i10++) {
            f94318c[i10] = new j(i10 - 1);
        }
    }

    public j(int i10) {
        this.f94319b = i10;
    }

    public static j valueOf(int i10) {
        return (i10 > 10 || i10 < -1) ? new j(i10) : f94318c[i10 - (-1)];
    }

    @Override // jc.t
    public boolean asBoolean(boolean z10) {
        return this.f94319b != 0;
    }

    @Override // yc.u, jc.t
    public String asText() {
        return cc.n.toString(this.f94319b);
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_NUMBER_INT;
    }

    @Override // yc.u, jc.t
    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this.f94319b);
    }

    @Override // yc.u, jc.t
    public boolean canConvertToInt() {
        return true;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToLong() {
        return true;
    }

    @Override // yc.u, jc.t
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this.f94319b);
    }

    @Override // yc.u, jc.t
    public double doubleValue() {
        return this.f94319b;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof j) && ((j) obj).f94319b == this.f94319b;
    }

    @Override // jc.t
    public float floatValue() {
        return this.f94319b;
    }

    @Override // yc.b
    public int hashCode() {
        return this.f94319b;
    }

    @Override // yc.u, jc.t
    public int intValue() {
        return this.f94319b;
    }

    @Override // jc.t
    public boolean isInt() {
        return true;
    }

    @Override // jc.t
    public boolean isIntegralNumber() {
        return true;
    }

    @Override // yc.u, jc.t
    public long longValue() {
        return this.f94319b;
    }

    @Override // yc.u, yc.b, jc.t, ub.o0
    public ub.s numberType() {
        return ub.s.f88349b;
    }

    @Override // yc.u, jc.t
    public Number numberValue() {
        return Integer.valueOf(this.f94319b);
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeNumber(this.f94319b);
    }

    @Override // jc.t
    public short shortValue() {
        return (short) this.f94319b;
    }
}
