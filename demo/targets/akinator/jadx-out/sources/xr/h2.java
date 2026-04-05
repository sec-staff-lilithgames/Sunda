package xr;

import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.a f92576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92577c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u2 f92578e;

    public h2(u2 u2Var, p.a aVar, wr.e4 e4Var) {
        this.f92578e = u2Var;
        this.f92576b = aVar;
        this.f92577c = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92578e.f93077f.start(this.f92576b, this.f92577c);
    }
}
