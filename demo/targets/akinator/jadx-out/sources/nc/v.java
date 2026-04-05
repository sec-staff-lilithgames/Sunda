package nc;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v implements mc.v, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final jc.n0 f75964b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.o f75965c;

    public v(jc.n0 n0Var, jc.o oVar) {
        this.f75964b = n0Var;
        this.f75965c = oVar;
    }

    public static v constructForProperty(jc.g gVar) {
        return constructForProperty(gVar, gVar.getType());
    }

    public static v constructForRootValue(jc.o oVar) {
        return new v(null, oVar);
    }

    @Override // mc.v
    public /* bridge */ /* synthetic */ Object getAbsentValue(jc.k kVar) throws jc.r {
        return super.getAbsentValue(kVar);
    }

    @Override // mc.v
    public dd.a getNullAccessPattern() {
        return dd.a.f51983e;
    }

    @Override // mc.v
    public Object getNullValue(jc.k kVar) throws jc.r {
        throw pc.d.from(kVar, this.f75964b, this.f75965c);
    }

    public static v constructForProperty(jc.g gVar, jc.o oVar) {
        return new v(gVar.getFullName(), oVar);
    }
}
