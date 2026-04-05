package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f94750b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94751c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f94750b = str2;
        this.f94751c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f94736a.equals(oVar.f94736a) && Objects.equals(this.f94750b, oVar.f94750b) && Objects.equals(this.f94751c, oVar.f94751c)) {
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
        int iE = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f94736a);
        String str = this.f94750b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94751c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ void populateMediaMetadata(r0 r0Var) {
        super.populateMediaMetadata(r0Var);
    }

    @Override // yo.i
    public String toString() {
        return this.f94736a + ": url=" + this.f94751c;
    }
}
