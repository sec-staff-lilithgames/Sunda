package yc;

import java.io.IOException;
import java.util.Optional;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final r f94342b = new r();

    public static r getInstance() {
        return f94342b;
    }

    @Override // jc.t
    public Optional<jc.t> asOptional() {
        return Optional.empty();
    }

    @Override // jc.t
    public String asText() {
        return "";
    }

    @Override // yc.a0, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.NOT_AVAILABLE;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // jc.t
    public p getNodeType() {
        return p.f94334f;
    }

    @Override // yc.b
    public int hashCode() {
        return 3;
    }

    @Override // jc.t, ub.o0
    public boolean isMissingNode() {
        return true;
    }

    @Override // jc.t
    public jc.t require() {
        jc.t.b("require() called on `MissingNode`", new Object[0]);
        throw null;
    }

    @Override // jc.t
    public jc.t requireNonNull() {
        jc.t.b("requireNonNull() called on `MissingNode`", new Object[0]);
        throw null;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public final void serialize(ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeNull();
    }

    @Override // yc.a0, yc.b, jc.t, jc.u, jc.v
    public void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        oVar.writeNull();
    }

    @Override // yc.b, jc.t
    public String toPrettyString() {
        return "";
    }

    @Override // yc.b, jc.t
    public String toString() {
        return "";
    }

    @Override // jc.t
    public String asText(String str) {
        return str;
    }

    @Override // yc.a0, jc.t
    public <T extends jc.t> T deepCopy() {
        return this;
    }
}
