package sh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g2 extends l1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i2 f85812e;

    public g2(i2 i2Var) {
        this.f85812e = i2Var;
        if (mh.p1.checkNotNull(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // sh.l1
    public final void a(Throwable th2) {
        this.f85812e.setException(th2);
    }

    @Override // sh.l1
    public final void b(Object obj) {
        this.f85812e.setFuture((n1) obj);
    }

    @Override // sh.l1
    public final boolean d() {
        return this.f85812e.isDone();
    }

    @Override // sh.l1
    public final Object e() {
        throw null;
    }

    @Override // sh.l1
    public final String f() {
        throw null;
    }
}
