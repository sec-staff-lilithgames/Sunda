package yc;

import java.io.IOException;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f94307c = new e(true);

    /* renamed from: e, reason: collision with root package name */
    public static final e f94308e = new e(false);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f94309b;

    public e(boolean z10) {
        this.f94309b = z10;
    }

    public static e getFalse() {
        return f94308e;
    }

    public static e getTrue() {
        return f94307c;
    }

    public static e valueOf(boolean z10) {
        return z10 ? f94307c : f94308e;
    }

    @Override // jc.t
    public boolean asBoolean() {
        return this.f94309b;
    }

    @Override // jc.t
    public double asDouble(double d10) {
        return this.f94309b ? 1.0d : 0.0d;
    }

    @Override // jc.t
    public int asInt(int i10) {
        return this.f94309b ? 1 : 0;
    }

    @Override // jc.t
    public long asLong(long j10) {
        return this.f94309b ? 1L : 0L;
    }

    @Override // jc.t
    public String asText() {
        return this.f94309b ? "true" : "false";
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return this.f94309b ? ub.z.VALUE_TRUE : ub.z.VALUE_FALSE;
    }

    @Override // jc.t
    public boolean booleanValue() {
        return this.f94309b;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof e)) {
            return this.f94309b == ((e) obj).f94309b;
        }
        return false;
    }

    @Override // jc.t
    public p getNodeType() {
        return p.f94333e;
    }

    @Override // yc.b
    public int hashCode() {
        return this.f94309b ? 3 : 1;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeBoolean(this.f94309b);
    }

    @Override // jc.t
    public boolean asBoolean(boolean z10) {
        return this.f94309b;
    }
}
