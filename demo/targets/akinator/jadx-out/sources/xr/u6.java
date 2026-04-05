package xr;

import xr.v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u6 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v6.a f93086a;

    public u6(v6.a aVar) {
        this.f93086a = aVar;
    }

    @Override // xr.n1
    public void onFailure(Throwable th2) {
        this.f93086a.f93183a.shutdownNow(wr.m6.f91047o.withDescription("Keepalive failed. The connection is likely gone"));
    }

    @Override // xr.n1
    public void onSuccess(long j10) {
    }
}
