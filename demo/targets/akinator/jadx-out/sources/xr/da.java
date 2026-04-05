package xr;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class da extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i6 f92434a;

    public da(i6 i6Var) {
        this.f92434a = i6Var;
    }

    @Override // wr.b3.e
    public List<wr.f1> getAllAddresses() {
        return this.f92434a.f92622o;
    }

    @Override // wr.b3.e
    public wr.c getAttributes() {
        return wr.c.f90841b;
    }

    @Override // wr.b3.e
    public Object getInternalSubchannel() {
        return this.f92434a;
    }

    @Override // wr.b3.e
    public void requestConnection() {
        this.f92434a.obtainActiveTransport();
    }

    @Override // wr.b3.e
    public void shutdown() {
        this.f92434a.shutdown(wr.m6.f91047o.withDescription("OobChannel is shutdown"));
    }
}
