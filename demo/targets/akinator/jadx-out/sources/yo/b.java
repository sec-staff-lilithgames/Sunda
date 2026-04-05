package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f94712b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f94712b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f94736a.equals(bVar.f94736a) && Arrays.equals(this.f94712b, bVar.f94712b)) {
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
        return Arrays.hashCode(this.f94712b) + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f94736a);
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }
}
