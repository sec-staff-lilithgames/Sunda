package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class rc extends ku.j {

    /* renamed from: c, reason: collision with root package name */
    public final sc f10934c;

    public rc(sc scVar) {
        this.f10934c = scVar;
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
        this.f10934c.onComplete();
    }

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        sc scVar = this.f10934c;
        scVar.f10987n.dispose();
        scVar.f10986m.dispose();
        scVar.onError(th2);
    }

    @Override // ku.j, mt.i0
    public void onNext(Object obj) {
        sc scVar = this.f10934c;
        scVar.f91286f.offer(new tc(null, obj));
        if (scVar.enter()) {
            scVar.U();
        }
    }
}
