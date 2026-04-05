package md;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f74322a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f74323b;

    /* renamed from: c, reason: collision with root package name */
    public final jd.h f74324c;

    public n(String str, byte[] bArr, jd.h hVar) {
        this.f74322a = str;
        this.f74323b = bArr;
        this.f74324c = hVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f74322a.equals(d0Var.getBackendName())) {
                if (Arrays.equals(this.f74323b, d0Var instanceof n ? ((n) d0Var).f74323b : d0Var.getExtras()) && this.f74324c.equals(d0Var.getPriority())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // md.d0
    public String getBackendName() {
        return this.f74322a;
    }

    @Override // md.d0
    public byte[] getExtras() {
        return this.f74323b;
    }

    @Override // md.d0
    public jd.h getPriority() {
        return this.f74324c;
    }

    public int hashCode() {
        return ((((this.f74322a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f74323b)) * 1000003) ^ this.f74324c.hashCode();
    }
}
