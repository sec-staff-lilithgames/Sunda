package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f92293c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f92295f;

    public c(d dVar, wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        this.f92295f = dVar;
        this.f92292b = m6Var;
        this.f92293c = l1Var;
        this.f92294e = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92295f.d(this.f92292b, this.f92293c, this.f92294e);
    }
}
