package xo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import gn.t0;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f92170a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92171b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92172c;

    /* renamed from: d, reason: collision with root package name */
    public final String f92173d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f92174e;

    /* renamed from: f, reason: collision with root package name */
    public final int f92175f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        io.bidmachine.media3.common.util.a.checkArgument(i11 == -1 || i11 > 0);
        this.f92170a = i10;
        this.f92171b = str;
        this.f92172c = str2;
        this.f92173d = str3;
        this.f92174e = z10;
        this.f92175f = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static xo.b parse(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.b.parse(java.util.Map):xo.b");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f92170a == bVar.f92170a && Objects.equals(this.f92171b, bVar.f92171b) && Objects.equals(this.f92172c, bVar.f92172c) && Objects.equals(this.f92173d, bVar.f92173d) && this.f92174e == bVar.f92174e && this.f92175f == bVar.f92175f) {
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
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f92170a) * 31;
        String str = this.f92171b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f92172c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f92173d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f92174e ? 1 : 0)) * 31) + this.f92175f;
    }

    @Override // gn.t0
    public void populateMediaMetadata(r0 r0Var) {
        String str = this.f92172c;
        if (str != null) {
            r0Var.setStation(str);
        }
        String str2 = this.f92171b;
        if (str2 != null) {
            r0Var.setGenre(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f92172c + "\", genre=\"" + this.f92171b + "\", bitrate=" + this.f92170a + ", metadataInterval=" + this.f92175f;
    }
}
