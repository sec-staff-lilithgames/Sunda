package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import gn.r0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f94708b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94709c;

    /* renamed from: d, reason: collision with root package name */
    public final int f94710d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f94711e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f94708b = str;
        this.f94709c = str2;
        this.f94710d = i10;
        this.f94711e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f94710d == aVar.f94710d && Objects.equals(this.f94708b, aVar.f94708b) && Objects.equals(this.f94709c, aVar.f94709c) && Arrays.equals(this.f94711e, aVar.f94711e)) {
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
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f94710d) * 31;
        String str = this.f94708b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94709c;
        return Arrays.hashCode(this.f94711e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yo.i, gn.t0
    public void populateMediaMetadata(r0 r0Var) {
        r0Var.maybeSetArtworkData(this.f94711e, this.f94710d);
    }

    @Override // yo.i
    public String toString() {
        return this.f94736a + ": mimeType=" + this.f94708b + ", description=" + this.f94709c;
    }
}
