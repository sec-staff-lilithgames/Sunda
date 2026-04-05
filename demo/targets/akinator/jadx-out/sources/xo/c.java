package xo;

import b3.h;
import gn.r0;
import gn.t0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f92176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92177b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92178c;

    public c(byte[] bArr, String str, String str2) {
        this.f92176a = bArr;
        this.f92177b = str;
        this.f92178c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f92176a, ((c) obj).f92176a);
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
        return Arrays.hashCode(this.f92176a);
    }

    @Override // gn.t0
    public void populateMediaMetadata(r0 r0Var) {
        String str = this.f92177b;
        if (str != null) {
            r0Var.setTitle(str);
        }
    }

    public String toString() {
        return a.b.f(this.f92176a.length, "\"", h.b("ICY: title=\"", this.f92177b, "\", url=\"", this.f92178c, "\", rawMetadata.length=\""));
    }
}
