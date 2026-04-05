package jn;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import gn.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f69733a;

    /* renamed from: b, reason: collision with root package name */
    public final long f69734b;

    /* renamed from: c, reason: collision with root package name */
    public final long f69735c;

    public g(long j10, long j11) {
        this.f69733a = j10;
        this.f69734b = j11;
        this.f69735c = -1L;
    }

    public static long unixTimeToMp4TimeSeconds(long j10) {
        return (j10 / 1000) + 2082844800;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f69733a == gVar.f69733a && this.f69734b == gVar.f69734b && this.f69735c == gVar.f69735c;
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return rh.b0.hashCode(this.f69735c) + ((rh.b0.hashCode(this.f69734b) + ((rh.b0.hashCode(this.f69733a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f69733a + ", modification time=" + this.f69734b + ", timescale=" + this.f69735c;
    }

    public g(long j10, long j11, long j12) {
        this.f69733a = j10;
        this.f69734b = j11;
        this.f69735c = j12;
    }
}
