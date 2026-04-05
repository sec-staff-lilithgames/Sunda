package nc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n0 extends jc.f {

    /* renamed from: h, reason: collision with root package name */
    public final Object f75949h;

    public n0(jc.n0 n0Var, jc.o oVar, rc.l lVar, Object obj) {
        super(n0Var, oVar, null, lVar, jc.m0.f69372k);
        this.f75949h = obj;
    }

    public Object findValue(jc.k kVar, Object obj) throws jc.r {
        return kVar.findInjectableValue(this.f75949h, this, obj);
    }

    public void inject(jc.k kVar, Object obj) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        this.f69276g.setValue(obj, findValue(kVar, obj));
    }

    @Deprecated
    public n0(jc.n0 n0Var, jc.o oVar, dd.b bVar, rc.l lVar, Object obj) {
        this(n0Var, oVar, lVar, obj);
    }
}
