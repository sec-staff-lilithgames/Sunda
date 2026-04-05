package pc;

import jc.k;
import jc.n0;
import jc.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends f {

    /* renamed from: g, reason: collision with root package name */
    public final n0 f80939g;

    public d(k kVar, String str, n0 n0Var) {
        super(kVar == null ? null : kVar.getParser(), str, (o) null);
        this.f80939g = n0Var;
    }

    public static d from(k kVar, n0 n0Var, o oVar) {
        d dVar = new d(kVar, a.b.k("Invalid `null` value encountered for property ", dd.i.quotedOr(n0Var, "<UNKNOWN>")), n0Var);
        if (oVar != null) {
            dVar.setTargetType(oVar);
        }
        return dVar;
    }

    public n0 getPropertyName() {
        return this.f80939g;
    }
}
