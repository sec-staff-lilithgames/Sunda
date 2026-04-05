package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class T2 {

    /* renamed from: a, reason: collision with root package name */
    public final byte f32289a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32290b;

    public T2(byte b10, String str) {
        this.f32289a = b10;
        this.f32290b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T2)) {
            return false;
        }
        T2 t22 = (T2) obj;
        return this.f32289a == t22.f32289a && kotlin.jvm.internal.e0.areEqual(this.f32290b, t22.f32290b);
    }

    public final int hashCode() {
        int iHashCode = Byte.hashCode(this.f32289a) * 31;
        String str = this.f32290b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigError(errorCode=");
        sb2.append((int) this.f32289a);
        sb2.append(", errorMessage=");
        return AbstractC2962r0.a(sb2, this.f32290b, ')');
    }
}
