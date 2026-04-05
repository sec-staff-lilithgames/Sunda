package ld;

import ld.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends l0.a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f73299a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f73300b;

    @Override // ld.l0.a
    public l0 build() {
        return new u(this.f73299a, this.f73300b);
    }

    @Override // ld.l0.a
    public l0.a setClearBlob(byte[] bArr) {
        this.f73299a = bArr;
        return this;
    }

    @Override // ld.l0.a
    public l0.a setEncryptedBlob(byte[] bArr) {
        this.f73300b = bArr;
        return this;
    }
}
