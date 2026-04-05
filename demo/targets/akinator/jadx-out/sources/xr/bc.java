package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class bc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f92286c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc f92288f;

    public bc(tc tcVar, wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        this.f92288f = tcVar;
        this.f92285b = m6Var;
        this.f92286c = l1Var;
        this.f92287e = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        tc tcVar = this.f92288f;
        tcVar.f93064z = true;
        tcVar.f93059u.closed(this.f92285b, this.f92286c, this.f92287e);
    }
}
