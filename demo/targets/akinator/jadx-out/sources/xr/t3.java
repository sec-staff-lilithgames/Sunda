package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f93004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f93005c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f93006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u3 f93007f;

    public t3(u3 u3Var, wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        this.f93007f = u3Var;
        this.f93004b = m6Var;
        this.f93005c = l1Var;
        this.f93006e = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93007f.f93081a.closed(this.f93004b, this.f93005c, this.f93006e);
    }
}
