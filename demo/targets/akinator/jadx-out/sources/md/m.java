package md;

import md.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends d0.a {

    /* renamed from: a, reason: collision with root package name */
    public String f74319a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f74320b;

    /* renamed from: c, reason: collision with root package name */
    public jd.h f74321c;

    @Override // md.d0.a
    public d0 build() {
        String strConcat = this.f74319a == null ? " backendName" : "";
        if (this.f74321c == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new n(this.f74319a, this.f74320b, this.f74321c);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // md.d0.a
    public d0.a setBackendName(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f74319a = str;
        return this;
    }

    @Override // md.d0.a
    public d0.a setExtras(byte[] bArr) {
        this.f74320b = bArr;
        return this;
    }

    @Override // md.d0.a
    public d0.a setPriority(jd.h hVar) {
        if (hVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f74321c = hVar;
        return this;
    }
}
