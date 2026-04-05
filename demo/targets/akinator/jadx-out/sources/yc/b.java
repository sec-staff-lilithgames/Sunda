package yc;

import java.io.IOException;
import java.io.Serializable;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b extends jc.t implements Serializable {
    public static ub.w c(String str) {
        if (str.isEmpty() || str.charAt(0) == '/') {
            return ub.w.compile(str);
        }
        return null;
    }

    public static void d(String str, Object... objArr) {
        throw new UnsupportedOperationException(String.format(str, objArr));
    }

    public static void g(ub.w wVar, ub.w wVar2, jc.s sVar, jc.t tVar) {
        boolean zIsNull;
        int iOrdinal = sVar.ordinal();
        if (iOrdinal != 0) {
            zIsNull = true;
            if (iOrdinal == 1) {
                zIsNull = tVar.isNull();
            } else if (iOrdinal == 2) {
                zIsNull = true ^ tVar.isContainerNode();
            }
        } else {
            zIsNull = false;
        }
        if (zIsNull) {
            return;
        }
        d("Cannot replace `JsonNode` of type `%s` for property \"%s\" in JSON Pointer \"%s\" (mode `OverwriteMode.%s`)", tVar.getClass().getName(), wVar2.getMatchingProperty(), wVar, sVar);
        throw null;
    }

    @Override // jc.t, ub.o0
    public abstract ub.z asToken();

    public a e(ub.w wVar, ub.w wVar2, jc.s sVar, boolean z10) {
        return null;
    }

    public v f(ub.w wVar, ub.w wVar2, jc.s sVar, boolean z10) {
        return null;
    }

    @Override // jc.t
    public final jc.t findPath(String str) {
        jc.t tVarFindValue = findValue(str);
        return tVarFindValue == null ? r.getInstance() : tVarFindValue;
    }

    public abstract int hashCode();

    @Override // jc.t, ub.o0
    public ub.s numberType() {
        return null;
    }

    @Override // jc.t
    public jc.t required(String str) {
        jc.t.b("Node of type `%s` has no fields", getClass().getSimpleName());
        throw null;
    }

    @Override // jc.t, jc.u, jc.v
    public abstract void serialize(ub.o oVar, u0 u0Var) throws IOException;

    @Override // jc.t, jc.u, jc.v
    public abstract void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException;

    @Override // jc.t
    public String toPrettyString() {
        return m.nodeToPrettyString(this);
    }

    @Override // jc.t
    public String toString() {
        return m.nodeToString(this);
    }

    @Override // jc.t, ub.o0
    public ub.u traverse() {
        return new z(this);
    }

    @Override // jc.t
    public a withArray(ub.w wVar, jc.s sVar, boolean z10) {
        if (wVar.matches()) {
            if (this instanceof a) {
                return (a) this;
            }
            d("Can only call `withArray()` with empty JSON Pointer on `ArrayNode`, not `%s`", getClass().getName());
            throw null;
        }
        a aVarE = e(wVar, wVar, sVar, z10);
        if (aVarE != null) {
            return aVarE;
        }
        d("Cannot replace context node (of type `%s`) using `withArray()` with  JSON Pointer '%s'", getClass().getName(), wVar);
        throw null;
    }

    @Override // jc.t
    public v withObject(ub.w wVar, jc.s sVar, boolean z10) {
        if (wVar.matches()) {
            if (this instanceof v) {
                return (v) this;
            }
            d("Can only call `withObject()` with empty JSON Pointer on `ObjectNode`, not `%s`", getClass().getName());
            throw null;
        }
        v vVarF = f(wVar, wVar, sVar, z10);
        if (vVarF != null) {
            return vVarF;
        }
        d("Cannot replace context node (of type `%s`) using `withObject()` with  JSON Pointer '%s'", getClass().getName(), wVar);
        throw null;
    }

    @Override // jc.t, ub.o0
    public ub.u traverse(ub.a0 a0Var) {
        return new z(this, a0Var);
    }

    @Override // jc.t
    public jc.t required(int i10) {
        jc.t.b("Node of type `%s` has no indexed values", getClass().getSimpleName());
        throw null;
    }
}
