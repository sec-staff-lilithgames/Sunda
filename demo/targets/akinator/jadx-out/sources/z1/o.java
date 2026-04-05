package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f97365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar) {
        super(0);
        this.f97365e = mVar;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m8049invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m8049invoke() {
        m mVar = this.f97365e;
        g1.g gVar = mVar.f97342g;
        if (gVar != null) {
            gVar.onBuildCache(mVar.f97343h);
        }
        mVar.f97344i = false;
    }
}
