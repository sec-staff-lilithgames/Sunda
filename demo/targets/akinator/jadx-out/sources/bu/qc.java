package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class qc extends ku.j {

    /* renamed from: c, reason: collision with root package name */
    public final sc f10873c;

    /* renamed from: e, reason: collision with root package name */
    public final pu.h f10874e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10875f;

    public qc(sc scVar, pu.h hVar) {
        this.f10873c = scVar;
        this.f10874e = hVar;
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
        if (this.f10875f) {
            return;
        }
        this.f10875f = true;
        sc scVar = this.f10873c;
        scVar.f10986m.delete(this);
        scVar.f91286f.offer(new tc(this.f10874e, null));
        if (scVar.enter()) {
            scVar.U();
        }
    }

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10875f) {
            mu.a.onError(th2);
            return;
        }
        this.f10875f = true;
        sc scVar = this.f10873c;
        scVar.f10987n.dispose();
        scVar.f10986m.dispose();
        scVar.onError(th2);
    }

    @Override // ku.j, mt.i0
    public void onNext(Object obj) {
        dispose();
        onComplete();
    }
}
