package ap;

import gn.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f7913a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7914b;

    public a(long j10, long j11) {
        this.f7913a = j11;
        this.f7914b = j10;
    }

    @Override // ap.b, gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // ap.b, gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    @Override // ap.b, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    @Override // ap.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f7913a);
        sb2.append(", identifier= ");
        return a.b.g(this.f7914b, " }", sb2);
    }
}
