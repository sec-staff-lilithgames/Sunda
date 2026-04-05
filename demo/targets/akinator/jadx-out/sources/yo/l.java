package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f94741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94742c;

    /* renamed from: d, reason: collision with root package name */
    public final int f94743d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f94744e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f94745f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f94741b = i10;
        this.f94742c = i11;
        this.f94743d = i12;
        this.f94744e = iArr;
        this.f94745f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f94741b == lVar.f94741b && this.f94742c == lVar.f94742c && this.f94743d == lVar.f94743d && Arrays.equals(this.f94744e, lVar.f94744e) && Arrays.equals(this.f94745f, lVar.f94745f)) {
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
        return Arrays.hashCode(this.f94745f) + ((Arrays.hashCode(this.f94744e) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f94741b) * 31) + this.f94742c) * 31) + this.f94743d) * 31)) * 31);
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }
}
