package zo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import gn.t0;
import rh.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f98421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98422b;

    public c(float f10, int i10) {
        this.f98421a = f10;
        this.f98422b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f98421a == cVar.f98421a && this.f98422b == cVar.f98422b) {
                return true;
            }
        }
        return false;
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
        return ((o.hashCode(this.f98421a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f98422b;
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f98421a + ", svcTemporalLayerCount=" + this.f98422b;
    }
}
