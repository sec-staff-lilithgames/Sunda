package jd;

import jd.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends g.a {

    /* renamed from: a, reason: collision with root package name */
    public String f69494a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f69495b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f69496c;

    @Override // jd.g.a
    public g build() {
        return new c(this.f69494a, this.f69495b, this.f69496c);
    }

    @Override // jd.g.a
    public g.a setExperimentIdsClear(byte[] bArr) {
        this.f69495b = bArr;
        return this;
    }

    @Override // jd.g.a
    public g.a setExperimentIdsEncrypted(byte[] bArr) {
        this.f69496c = bArr;
        return this;
    }

    @Override // jd.g.a
    public g.a setPseudonymousId(String str) {
        this.f69494a = str;
        return this;
    }
}
