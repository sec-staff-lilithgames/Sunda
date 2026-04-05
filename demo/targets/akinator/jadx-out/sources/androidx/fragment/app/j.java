package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f6386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f6387c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.f f6389f;

    public j(a3 a3Var, a3 a3Var2, boolean z10, z.f fVar) {
        this.f6386b = a3Var;
        this.f6387c = a3Var2;
        this.f6388e = z10;
        this.f6389f = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i2.a(this.f6386b.getFragment(), this.f6387c.getFragment(), this.f6388e, this.f6389f, false);
    }
}
