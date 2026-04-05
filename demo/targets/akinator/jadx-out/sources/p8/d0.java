package p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f80740a;

    /* renamed from: b, reason: collision with root package name */
    public final f9.j f80741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f80742c;

    public d0(e0 e0Var, f9.j jVar, k0 k0Var) {
        this.f80742c = e0Var;
        this.f80741b = jVar;
        this.f80740a = k0Var;
    }

    public void cancel() {
        synchronized (this.f80742c) {
            this.f80740a.f(this.f80741b);
        }
    }
}
