package vo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.r0;
import gn.t0;
import gn.w;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements t0 {

    /* renamed from: g, reason: collision with root package name */
    public static final io.bidmachine.media3.common.b f89499g = new w().setSampleMimeType(MimeTypes.APPLICATION_ID3).build();

    /* renamed from: h, reason: collision with root package name */
    public static final io.bidmachine.media3.common.b f89500h = new w().setSampleMimeType(MimeTypes.APPLICATION_SCTE35).build();

    /* renamed from: a, reason: collision with root package name */
    public final String f89501a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89502b;

    /* renamed from: c, reason: collision with root package name */
    public final long f89503c;

    /* renamed from: d, reason: collision with root package name */
    public final long f89504d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f89505e;

    /* renamed from: f, reason: collision with root package name */
    public int f89506f;

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f89501a = str;
        this.f89502b = str2;
        this.f89503c = j10;
        this.f89504d = j11;
        this.f89505e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f89503c == aVar.f89503c && this.f89504d == aVar.f89504d && Objects.equals(this.f89501a, aVar.f89501a) && Objects.equals(this.f89502b, aVar.f89502b) && Arrays.equals(this.f89505e, aVar.f89505e)) {
                return true;
            }
        }
        return false;
    }

    @Override // gn.t0
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f89505e;
        }
        return null;
    }

    @Override // gn.t0
    public io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        String str = this.f89501a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f89500h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f89499g;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f89506f == 0) {
            String str = this.f89501a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f89502b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f89503c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f89504d;
            this.f89506f = Arrays.hashCode(this.f89505e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f89506f;
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f89501a + ", id=" + this.f89504d + ", durationMs=" + this.f89503c + ", value=" + this.f89502b;
    }
}
