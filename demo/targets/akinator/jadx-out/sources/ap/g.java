package ap;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.r0;
import io.bidmachine.media3.common.util.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f7922a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7923b;

    public g(long j10, long j11) {
        this.f7922a = j10;
        this.f7923b = j11;
    }

    public static long a(long j10, m0 m0Var) {
        long unsignedByte = m0Var.readUnsignedByte();
        return (128 & unsignedByte) != 0 ? 8589934591L & ((((unsignedByte & 1) << 32) | m0Var.readUnsignedInt()) + j10) : C.TIME_UNSET;
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
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f7922a);
        sb2.append(", playbackPositionUs= ");
        return a.b.g(this.f7923b, " }", sb2);
    }
}
