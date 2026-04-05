package ap;

import gn.r0;
import gn.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b implements t0 {
    @Override // gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
