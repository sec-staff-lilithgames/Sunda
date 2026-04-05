package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final W0 f32472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32473b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f32474c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32475d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f32476e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32477f;

    public X(W0 adUnitTelemetry, String str, Boolean bool, String str2, byte b10, String str3) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitTelemetry, "adUnitTelemetry");
        this.f32472a = adUnitTelemetry;
        this.f32473b = str;
        this.f32474c = bool;
        this.f32475d = str2;
        this.f32476e = b10;
        this.f32477f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f32472a, x10.f32472a) && kotlin.jvm.internal.e0.areEqual(this.f32473b, x10.f32473b) && kotlin.jvm.internal.e0.areEqual(this.f32474c, x10.f32474c) && kotlin.jvm.internal.e0.areEqual(this.f32475d, x10.f32475d) && this.f32476e == x10.f32476e && kotlin.jvm.internal.e0.areEqual(this.f32477f, x10.f32477f);
    }

    public final int hashCode() {
        int iHashCode = this.f32472a.hashCode() * 31;
        String str = this.f32473b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f32474c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f32475d;
        int iHashCode4 = (Byte.hashCode(this.f32476e) + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f32477f;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdNotReadyMetadata(adUnitTelemetry=");
        sb2.append(this.f32472a);
        sb2.append(", creativeType=");
        sb2.append(this.f32473b);
        sb2.append(", isRewarded=");
        sb2.append(this.f32474c);
        sb2.append(", markupType=");
        sb2.append(this.f32475d);
        sb2.append(", adState=");
        sb2.append((int) this.f32476e);
        sb2.append(", impressionId=");
        return AbstractC2962r0.a(sb2, this.f32477f, ')');
    }
}
