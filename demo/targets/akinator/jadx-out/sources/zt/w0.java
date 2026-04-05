package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w0 implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98809b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f98810c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98811e;

    public w0(mt.v vVar, st.q qVar) {
        this.f98809b = vVar;
        this.f98810c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        pt.c cVar = this.f98811e;
        this.f98811e = tt.d.f87352b;
        cVar.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98811e.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f98809b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98811e, cVar)) {
            this.f98811e = cVar;
            this.f98809b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        mt.v vVar = this.f98809b;
        try {
            if (this.f98810c.test(obj)) {
                vVar.onSuccess(obj);
            } else {
                vVar.onComplete();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }
}
