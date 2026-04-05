package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import gn.r0;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f94724b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94725c;

    /* renamed from: d, reason: collision with root package name */
    public final String f94726d;

    public e(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f94724b = str;
        this.f94725c = str2;
        this.f94726d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f94725c, eVar.f94725c) && Objects.equals(this.f94724b, eVar.f94724b) && Objects.equals(this.f94726d, eVar.f94726d)) {
                return true;
            }
        }
        return false;
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        String str = this.f94724b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94725c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f94726d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    @Override // yo.i
    public String toString() {
        return this.f94736a + ": language=" + this.f94724b + ", description=" + this.f94725c + ", text=" + this.f94726d;
    }
}
