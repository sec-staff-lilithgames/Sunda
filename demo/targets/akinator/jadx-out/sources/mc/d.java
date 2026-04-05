package mc;

import java.io.IOException;
import nc.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends i0.a {

    /* renamed from: c, reason: collision with root package name */
    public final jc.k f74158c;

    /* renamed from: d, reason: collision with root package name */
    public final z f74159d;

    /* renamed from: e, reason: collision with root package name */
    public Object f74160e;

    public d(jc.k kVar, a0 a0Var, jc.o oVar, z zVar) {
        super(a0Var, oVar);
        this.f74158c = kVar;
        this.f74159d = zVar;
    }

    @Override // nc.i0.a
    public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
        Object obj3 = this.f74160e;
        z zVar = this.f74159d;
        if (obj3 == null) {
            this.f74158c.reportInputMismatch(zVar, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", zVar.getName(), zVar.b().getName());
        }
        zVar.set(this.f74160e, obj2);
    }

    public void setBean(Object obj) {
        this.f74160e = obj;
    }
}
