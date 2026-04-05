package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import gn.r0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f94719b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f94720c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f94721d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f94722e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f94723f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super(ChapterTocFrame.ID);
        this.f94719b = str;
        this.f94720c = z10;
        this.f94721d = z11;
        this.f94722e = strArr;
        this.f94723f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f94720c == dVar.f94720c && this.f94721d == dVar.f94721d && Objects.equals(this.f94719b, dVar.f94719b) && Arrays.equals(this.f94722e, dVar.f94722e) && Arrays.equals(this.f94723f, dVar.f94723f)) {
                return true;
            }
        }
        return false;
    }

    public i getSubFrame(int i10) {
        return this.f94723f[i10];
    }

    public int getSubFrameCount() {
        return this.f94723f.length;
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
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f94720c ? 1 : 0)) * 31) + (this.f94721d ? 1 : 0)) * 31;
        String str = this.f94719b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }
}
