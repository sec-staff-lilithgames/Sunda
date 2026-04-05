package o6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n6.b0 f77945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sh.n1 f77946c;

    public m1(n6.b0 b0Var, sh.n1 n1Var) {
        this.f77945b = b0Var;
        this.f77946c = n1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        if (th2 instanceof d1) {
            this.f77945b.stop(((d1) th2).getReason());
        }
        this.f77946c.cancel(false);
    }
}
