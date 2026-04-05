package yc;

import java.io.IOException;
import java.util.List;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a0 extends b {
    @Override // jc.t
    public final jc.t a(ub.w wVar) {
        return null;
    }

    @Override // yc.b, jc.t, ub.o0
    public abstract ub.z asToken();

    @Override // jc.t
    public final jc.t findValue(String str) {
        return null;
    }

    @Override // jc.t
    public final boolean has(int i10) {
        return false;
    }

    @Override // jc.t
    public final boolean hasNonNull(int i10) {
        return false;
    }

    @Override // jc.t
    public boolean isEmpty() {
        return true;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(this, asToken()));
        serialize(oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }

    @Override // jc.t
    public final v findParent(String str) {
        return null;
    }

    @Override // jc.t
    public final boolean has(String str) {
        return false;
    }

    @Override // jc.t
    public final boolean hasNonNull(String str) {
        return false;
    }

    @Override // jc.t, ub.o0
    public final jc.t get(int i10) {
        return null;
    }

    @Override // jc.t, ub.o0
    public final jc.t path(int i10) {
        return r.getInstance();
    }

    @Override // jc.t, ub.o0
    public final jc.t get(String str) {
        return null;
    }

    @Override // jc.t, ub.o0
    public final jc.t path(String str) {
        return r.getInstance();
    }

    @Override // jc.t
    public <T extends jc.t> T deepCopy() {
        return this;
    }

    @Override // jc.t
    public final List<jc.t> findParents(String str, List<jc.t> list) {
        return list;
    }

    @Override // jc.t
    public final List<jc.t> findValues(String str, List<jc.t> list) {
        return list;
    }

    @Override // jc.t
    public final List<String> findValuesAsText(String str, List<String> list) {
        return list;
    }
}
