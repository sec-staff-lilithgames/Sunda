package cw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f51112a;

    public b0(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        this.f51112a = connection;
    }

    @Override // cw.e0
    public /* bridge */ /* synthetic */ d0 connectTcp() {
        return (d0) m3674connectTcp();
    }

    @Override // cw.e0
    public /* bridge */ /* synthetic */ d0 connectTlsEtc() {
        return (d0) m3675connectTlsEtc();
    }

    public final u getConnection() {
        return this.f51112a;
    }

    @Override // cw.e0
    public u handleSuccess() {
        return this.f51112a;
    }

    @Override // cw.e0
    public boolean isReady() {
        return true;
    }

    @Override // cw.e0
    public /* bridge */ /* synthetic */ e0 retry() {
        return (e0) m3676retry();
    }

    @Override // cw.e0
    /* renamed from: cancel, reason: merged with bridge method [inline-methods] */
    public Void mo3673cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    /* renamed from: connectTcp, reason: collision with other method in class */
    public Void m3674connectTcp() {
        throw new IllegalStateException("already connected");
    }

    /* renamed from: connectTlsEtc, reason: collision with other method in class */
    public Void m3675connectTlsEtc() {
        throw new IllegalStateException("already connected");
    }

    /* renamed from: retry, reason: collision with other method in class */
    public Void m3676retry() {
        throw new IllegalStateException("unexpected retry");
    }
}
