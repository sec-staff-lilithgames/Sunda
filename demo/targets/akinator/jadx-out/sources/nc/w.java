package nc;

import java.io.IOException;
import java.io.Serializable;
import tb.f1;
import tb.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final jc.o f75966b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.n0 f75967c;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f75968e;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f75969f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.q f75970g;

    /* renamed from: h, reason: collision with root package name */
    public final mc.z f75971h;

    public w(jc.o oVar, jc.n0 n0Var, f1 f1Var, jc.q qVar, mc.z zVar, j1 j1Var) {
        this.f75966b = oVar;
        this.f75967c = n0Var;
        this.f75968e = f1Var;
        this.f75969f = j1Var;
        this.f75970g = qVar;
        this.f75971h = zVar;
    }

    public static w construct(jc.o oVar, jc.n0 n0Var, f1 f1Var, jc.q qVar, mc.z zVar, j1 j1Var) {
        return new w(oVar, n0Var, f1Var, qVar, zVar, j1Var);
    }

    public jc.q getDeserializer() {
        return this.f75970g;
    }

    public jc.o getIdType() {
        return this.f75966b;
    }

    public boolean isValidReferencePropertyName(String str, ub.u uVar) {
        return this.f75968e.isValidReferencePropertyName(str, uVar);
    }

    public boolean maySerializeAsObject() {
        return this.f75968e.maySerializeAsObject();
    }

    public Object readObjectReference(ub.u uVar, jc.k kVar) throws IOException {
        return this.f75970g.deserialize(uVar, kVar);
    }
}
