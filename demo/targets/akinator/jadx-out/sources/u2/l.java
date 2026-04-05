package u2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f87740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar) {
        super(0);
        this.f87740e = oVar;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m7402invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7402invoke() {
        o oVar = this.f87740e;
        if (oVar.f87746f) {
            oVar.f87753m.observeReads(oVar, oVar.f87754n, oVar.getUpdate());
        }
    }
}
