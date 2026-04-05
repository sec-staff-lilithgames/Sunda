package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class jb extends mt.n0 implements vt.b {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f95749b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f95750c;

    /* renamed from: e, reason: collision with root package name */
    public final st.d f95751e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95752f;

    public jb(tw.b bVar, tw.b bVar2, st.d dVar, int i10) {
        this.f95749b = bVar;
        this.f95750c = bVar2;
        this.f95751e = dVar;
        this.f95752f = i10;
    }

    @Override // vt.b
    public mt.l fuseToFlowable() {
        return mu.a.onAssembly(new hb(this.f95749b, this.f95750c, this.f95751e, this.f95752f));
    }

    @Override // mt.n0
    public void subscribeActual(mt.q0 q0Var) {
        ib ibVar = new ib(q0Var, this.f95752f, this.f95751e);
        q0Var.onSubscribe(ibVar);
        this.f95749b.subscribe(ibVar.f95690e);
        this.f95750c.subscribe(ibVar.f95691f);
    }
}
