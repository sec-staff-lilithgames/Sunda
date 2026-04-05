package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S9 {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC3017u4 f32266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32267b;

    public S9(EnumC3017u4 errorCode, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        this.f32266a = errorCode;
        this.f32267b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S9)) {
            return false;
        }
        S9 s92 = (S9) obj;
        return this.f32266a == s92.f32266a && kotlin.jvm.internal.e0.areEqual(this.f32267b, s92.f32267b);
    }

    public final int hashCode() {
        int iHashCode = this.f32266a.hashCode() * 31;
        String str = this.f32267b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkError(errorCode=");
        sb2.append(this.f32266a);
        sb2.append(", errorMessage=");
        return AbstractC2962r0.a(sb2, this.f32267b, ')');
    }
}
