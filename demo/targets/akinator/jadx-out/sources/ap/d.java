package ap;

import gn.r0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f7918a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7919b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7920c;

    public d(List list, long j10, long j11) {
        this.f7918a = j10;
        this.f7919b = j11;
        this.f7920c = Collections.unmodifiableList(list);
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
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f7918a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a.b.g(this.f7919b, " }", sb2);
    }
}
