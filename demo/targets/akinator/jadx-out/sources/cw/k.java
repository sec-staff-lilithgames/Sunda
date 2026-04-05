package cw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f51174a;

    public k(Throwable e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e10, "e");
        this.f51174a = new d0(this, null, e10, 2, null);
    }

    @Override // cw.e0
    public d0 connectTcp() {
        return this.f51174a;
    }

    @Override // cw.e0
    public d0 connectTlsEtc() {
        return this.f51174a;
    }

    public final d0 getResult() {
        return this.f51174a;
    }

    @Override // cw.e0
    public /* bridge */ /* synthetic */ u handleSuccess() {
        return (u) m3677handleSuccess();
    }

    @Override // cw.e0
    public boolean isReady() {
        return false;
    }

    @Override // cw.e0
    public /* bridge */ /* synthetic */ e0 retry() {
        return (e0) m3678retry();
    }

    @Override // cw.e0
    /* renamed from: cancel, reason: merged with bridge method [inline-methods] */
    public Void mo3673cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    /* renamed from: handleSuccess, reason: collision with other method in class */
    public Void m3677handleSuccess() {
        throw new IllegalStateException("unexpected call");
    }

    /* renamed from: retry, reason: collision with other method in class */
    public Void m3678retry() {
        throw new IllegalStateException("unexpected retry");
    }
}
