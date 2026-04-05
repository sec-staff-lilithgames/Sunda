package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v1 implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98800b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f98801c;

    public v1(mt.v vVar) {
        this.f98800b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98801c.dispose();
        this.f98801c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98801c.isDisposed();
    }

    @Override // mt.f
    public void onComplete() {
        this.f98801c = tt.d.f87352b;
        this.f98800b.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f98801c = tt.d.f87352b;
        this.f98800b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98801c, cVar)) {
            this.f98801c = cVar;
            this.f98800b.onSubscribe(this);
        }
    }
}
