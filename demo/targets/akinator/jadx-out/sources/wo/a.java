package wo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import gn.t0;
import gn.x0;
import io.bidmachine.media3.common.util.m0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90766b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90767c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90768d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90769e;

    /* renamed from: f, reason: collision with root package name */
    public final int f90770f;

    /* renamed from: g, reason: collision with root package name */
    public final int f90771g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f90772h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f90765a = i10;
        this.f90766b = str;
        this.f90767c = str2;
        this.f90768d = i11;
        this.f90769e = i12;
        this.f90770f = i13;
        this.f90771g = i14;
        this.f90772h = bArr;
    }

    public static a fromPictureBlock(m0 m0Var) {
        int i10 = m0Var.readInt();
        String strNormalizeMimeType = x0.normalizeMimeType(m0Var.readString(m0Var.readInt(), StandardCharsets.US_ASCII));
        String string = m0Var.readString(m0Var.readInt());
        int i11 = m0Var.readInt();
        int i12 = m0Var.readInt();
        int i13 = m0Var.readInt();
        int i14 = m0Var.readInt();
        int i15 = m0Var.readInt();
        byte[] bArr = new byte[i15];
        m0Var.readBytes(bArr, 0, i15);
        return new a(i10, strNormalizeMimeType, string, i11, i12, i13, i14, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f90765a == aVar.f90765a && this.f90766b.equals(aVar.f90766b) && this.f90767c.equals(aVar.f90767c) && this.f90768d == aVar.f90768d && this.f90769e == aVar.f90769e && this.f90770f == aVar.f90770f && this.f90771g == aVar.f90771g && Arrays.equals(this.f90772h, aVar.f90772h)) {
                return true;
            }
        }
        return false;
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f90772h) + ((((((((o2.e(o2.e((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f90765a) * 31, 31, this.f90766b), 31, this.f90767c) + this.f90768d) * 31) + this.f90769e) * 31) + this.f90770f) * 31) + this.f90771g) * 31);
    }

    @Override // gn.t0
    public void populateMediaMetadata(r0 r0Var) {
        r0Var.maybeSetArtworkData(this.f90772h, this.f90765a);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f90766b + ", description=" + this.f90767c;
    }
}
