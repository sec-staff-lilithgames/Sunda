package yc;

import java.io.IOException;
import java.util.Objects;
import jc.u0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class w extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f94355b;

    public w(Object obj) {
        this.f94355b = obj;
    }

    @Override // jc.t
    public boolean asBoolean(boolean z10) {
        Object obj = this.f94355b;
        return (obj == null || !(obj instanceof Boolean)) ? z10 : ((Boolean) obj).booleanValue();
    }

    @Override // jc.t
    public double asDouble(double d10) {
        Object obj = this.f94355b;
        return obj instanceof Number ? ((Number) obj).doubleValue() : d10;
    }

    @Override // jc.t
    public int asInt(int i10) {
        Object obj = this.f94355b;
        return obj instanceof Number ? ((Number) obj).intValue() : i10;
    }

    @Override // jc.t
    public long asLong(long j10) {
        Object obj = this.f94355b;
        return obj instanceof Number ? ((Number) obj).longValue() : j10;
    }

    @Override // jc.t
    public String asText() {
        Object obj = this.f94355b;
        return obj == null ? AbstractJsonLexerKt.NULL : obj.toString();
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_EMBEDDED_OBJECT;
    }

    @Override // jc.t
    public byte[] binaryValue() throws IOException {
        Object obj = this.f94355b;
        return obj instanceof byte[] ? (byte[]) obj : super.binaryValue();
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        Object obj2 = ((w) obj).f94355b;
        Object obj3 = this.f94355b;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    @Override // jc.t
    public p getNodeType() {
        return p.f94338j;
    }

    public Object getPojo() {
        return this.f94355b;
    }

    @Override // yc.b
    public int hashCode() {
        return Objects.hashCode(this.f94355b);
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        Object obj = this.f94355b;
        if (obj == null) {
            u0Var.defaultSerializeNull(oVar);
        } else if (obj instanceof jc.v) {
            ((jc.v) obj).serialize(oVar, u0Var);
        } else {
            u0Var.defaultSerializeValue(obj, oVar);
        }
    }

    @Override // jc.t
    public String asText(String str) {
        Object obj = this.f94355b;
        return obj == null ? str : obj.toString();
    }
}
