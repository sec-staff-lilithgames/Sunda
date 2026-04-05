package yc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f94317b;

    public i(float f10) {
        this.f94317b = f10;
    }

    public static i valueOf(float f10) {
        return new i(f10);
    }

    @Override // yc.u, jc.t
    public String asText() {
        return cc.n.toString(this.f94317b);
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
        float f10 = this.f94317b;
        return (Float.isNaN(f10) || Float.isInfinite(f10) || f10 != ((float) Math.round(f10))) ? false : true;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToInt() {
        float f10 = this.f94317b;
        return f10 >= -2.1474836E9f && f10 <= 2.1474836E9f;
    }

    @Override // yc.u, jc.t
    public boolean canConvertToLong() {
        float f10 = this.f94317b;
        return f10 >= -9.223372E18f && f10 <= 9.223372E18f;
    }

    @Override // yc.u, jc.t
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this.f94317b);
    }

    @Override // yc.u, jc.t
    public double doubleValue() {
        return this.f94317b;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            if (Float.compare(this.f94317b, ((i) obj).f94317b) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // jc.t
    public float floatValue() {
        return this.f94317b;
    }

    @Override // yc.b
    public int hashCode() {
        return Float.floatToIntBits(this.f94317b);
    }

    @Override // yc.u, jc.t
    public int intValue() {
        return (int) this.f94317b;
    }

    @Override // jc.t
    public boolean isFloat() {
        return true;
    }

    @Override // jc.t
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override // yc.u
    public boolean isNaN() {
        float f10 = this.f94317b;
        return Float.isNaN(f10) || Float.isInfinite(f10);
    }

    @Override // yc.u, jc.t
    public long longValue() {
        return (long) this.f94317b;
    }

    @Override // yc.u, yc.b, jc.t, ub.o0
    public ub.s numberType() {
        return ub.s.f88352f;
    }

    @Override // yc.u, jc.t
    public Number numberValue() {
        return Float.valueOf(this.f94317b);
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeNumber(this.f94317b);
    }

    @Override // jc.t
    public short shortValue() {
        return (short) this.f94317b;
    }
}
