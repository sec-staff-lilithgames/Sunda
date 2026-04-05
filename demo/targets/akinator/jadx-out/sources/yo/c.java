package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import gn.r0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f94713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94714c;

    /* renamed from: d, reason: collision with root package name */
    public final int f94715d;

    /* renamed from: e, reason: collision with root package name */
    public final long f94716e;

    /* renamed from: f, reason: collision with root package name */
    public final long f94717f;

    /* renamed from: g, reason: collision with root package name */
    public final i[] f94718g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super(ChapterFrame.ID);
        this.f94713b = str;
        this.f94714c = i10;
        this.f94715d = i11;
        this.f94716e = j10;
        this.f94717f = j11;
        this.f94718g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f94714c == cVar.f94714c && this.f94715d == cVar.f94715d && this.f94716e == cVar.f94716e && this.f94717f == cVar.f94717f && Objects.equals(this.f94713b, cVar.f94713b) && Arrays.equals(this.f94718g, cVar.f94718g)) {
                return true;
            }
        }
        return false;
    }

    public i getSubFrame(int i10) {
        return this.f94718g[i10];
    }

    public int getSubFrameCount() {
        return this.f94718g.length;
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
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f94714c) * 31) + this.f94715d) * 31) + ((int) this.f94716e)) * 31) + ((int) this.f94717f)) * 31;
        String str = this.f94713b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }
}
