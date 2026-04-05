package yc;

import java.io.IOException;
import jc.u0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f94353b = new t();

    public static t getInstance() {
        return f94353b;
    }

    @Override // jc.t
    public String asText(String str) {
        return str;
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.VALUE_NULL;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof t);
    }

    @Override // jc.t
    public p getNodeType() {
        return p.f94335g;
    }

    @Override // yc.b
    public int hashCode() {
        return 4;
    }

    @Override // jc.t
    public jc.t requireNonNull() {
        jc.t.b("requireNonNull() called on `NullNode`", new Object[0]);
        throw null;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        u0Var.defaultSerializeNull(oVar);
    }

    @Override // jc.t
    public String asText() {
        return AbstractJsonLexerKt.NULL;
    }
}
