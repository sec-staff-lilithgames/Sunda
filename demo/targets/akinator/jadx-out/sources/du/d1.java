package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d1 implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final e1 f52705b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.v f52706c;

    public d1(e1 e1Var, mt.v vVar) {
        this.f52705b = e1Var;
        this.f52706c = vVar;
    }

    @Override // mt.v
    public void onComplete() {
        this.f52706c.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f52706c.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f52705b, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f52706c.onSuccess(obj);
    }
}
