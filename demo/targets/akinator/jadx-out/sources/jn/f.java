package jn;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import gn.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f69731a;

    /* renamed from: b, reason: collision with root package name */
    public final float f69732b;

    public f(float f10, float f11) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f69731a = f10;
        this.f69732b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f69731a == fVar.f69731a && this.f69732b == fVar.f69732b) {
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
        return rh.o.hashCode(this.f69732b) + ((rh.o.hashCode(this.f69731a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        return "xyz: latitude=" + this.f69731a + ", longitude=" + this.f69732b;
    }
}
