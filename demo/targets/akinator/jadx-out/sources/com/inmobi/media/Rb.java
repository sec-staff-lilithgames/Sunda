package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Rb {

    /* renamed from: a, reason: collision with root package name */
    public final byte f32215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32216b;

    public Rb(byte b10, String assetUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetUrl, "assetUrl");
        this.f32215a = b10;
        this.f32216b = assetUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rb)) {
            return false;
        }
        Rb rb2 = (Rb) obj;
        return this.f32215a == rb2.f32215a && kotlin.jvm.internal.e0.areEqual(this.f32216b, rb2.f32216b);
    }

    public final int hashCode() {
        return this.f32216b.hashCode() + (Byte.hashCode(this.f32215a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RawAsset(mRawAssetType=");
        sb2.append((int) this.f32215a);
        sb2.append(", assetUrl=");
        return AbstractC2962r0.a(sb2, this.f32216b, ')');
    }
}
