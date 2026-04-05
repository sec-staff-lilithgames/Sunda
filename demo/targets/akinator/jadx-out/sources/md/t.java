package md;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final jd.e f74337a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f74338b;

    public t(jd.e eVar, byte[] bArr) {
        if (eVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f74337a = eVar;
        this.f74338b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f74337a.equals(tVar.f74337a)) {
            return Arrays.equals(this.f74338b, tVar.f74338b);
        }
        return false;
    }

    public byte[] getBytes() {
        return this.f74338b;
    }

    public jd.e getEncoding() {
        return this.f74337a;
    }

    public int hashCode() {
        return ((this.f74337a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f74338b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f74337a + ", bytes=[...]}";
    }
}
