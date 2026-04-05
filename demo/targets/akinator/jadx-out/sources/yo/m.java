package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import gn.r0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f94746b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f94747c;

    public m(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f94746b = str;
        this.f94747c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f94746b, mVar.f94746b) && Arrays.equals(this.f94747c, mVar.f94747c)) {
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
        String str = this.f94746b;
        return Arrays.hashCode(this.f94747c) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    @Override // yo.i
    public String toString() {
        return this.f94736a + ": owner=" + this.f94746b;
    }
}
