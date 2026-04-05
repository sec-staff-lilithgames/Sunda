package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import gn.r0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f94727b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94728c;

    /* renamed from: d, reason: collision with root package name */
    public final String f94729d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f94730e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f94727b = str;
        this.f94728c = str2;
        this.f94729d = str3;
        this.f94730e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f94727b, fVar.f94727b) && Objects.equals(this.f94728c, fVar.f94728c) && Objects.equals(this.f94729d, fVar.f94729d) && Arrays.equals(this.f94730e, fVar.f94730e)) {
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
        String str = this.f94727b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94728c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f94729d;
        return Arrays.hashCode(this.f94730e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    @Override // yo.i
    public String toString() {
        return this.f94736a + ": mimeType=" + this.f94727b + ", filename=" + this.f94728c + ", description=" + this.f94729d;
    }
}
