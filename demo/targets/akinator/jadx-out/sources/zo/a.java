package zo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import gn.t0;
import rh.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f98412a;

    /* renamed from: b, reason: collision with root package name */
    public final long f98413b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98414c;

    /* renamed from: d, reason: collision with root package name */
    public final long f98415d;

    /* renamed from: e, reason: collision with root package name */
    public final long f98416e;

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f98412a = j10;
        this.f98413b = j11;
        this.f98414c = j12;
        this.f98415d = j13;
        this.f98416e = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f98412a == aVar.f98412a && this.f98413b == aVar.f98413b && this.f98414c == aVar.f98414c && this.f98415d == aVar.f98415d && this.f98416e == aVar.f98416e) {
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
        return b0.hashCode(this.f98416e) + ((b0.hashCode(this.f98415d) + ((b0.hashCode(this.f98414c) + ((b0.hashCode(this.f98413b) + ((b0.hashCode(this.f98412a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f98412a + ", photoSize=" + this.f98413b + ", photoPresentationTimestampUs=" + this.f98414c + ", videoStartPosition=" + this.f98415d + ", videoSize=" + this.f98416e;
    }
}
