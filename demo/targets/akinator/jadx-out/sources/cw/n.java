package cw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f51183a;

    public n(z delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f51183a = delegate;
    }

    @Override // cw.f0
    public xv.a getAddress() {
        return this.f51183a.getAddress();
    }

    @Override // cw.f0
    public uu.u getDeferredPlans() {
        return this.f51183a.getDeferredPlans();
    }

    @Override // cw.f0
    public boolean hasNext(u uVar) {
        return this.f51183a.hasNext(uVar);
    }

    @Override // cw.f0
    public boolean isCanceled() {
        return this.f51183a.isCanceled();
    }

    @Override // cw.f0
    public e0 plan() {
        return this.f51183a.planConnect$okhttp();
    }

    @Override // cw.f0
    public boolean sameHostAndPort(xv.g0 url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        return this.f51183a.sameHostAndPort(url);
    }
}
