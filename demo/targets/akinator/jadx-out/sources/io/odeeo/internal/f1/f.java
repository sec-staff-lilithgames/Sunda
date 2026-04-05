package io.odeeo.internal.f1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f64056a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f64057b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f64058c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f64059d;

    public f(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f64056a = num;
        this.f64057b = num2;
        this.f64058c = num3;
        this.f64059d = num4;
    }

    public static /* synthetic */ f copy$default(f fVar, Integer num, Integer num2, Integer num3, Integer num4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = fVar.f64056a;
        }
        if ((i10 & 2) != 0) {
            num2 = fVar.f64057b;
        }
        if ((i10 & 4) != 0) {
            num3 = fVar.f64058c;
        }
        if ((i10 & 8) != 0) {
            num4 = fVar.f64059d;
        }
        return fVar.copy(num, num2, num3, num4);
    }

    public final Integer component1() {
        return this.f64056a;
    }

    public final Integer component2() {
        return this.f64057b;
    }

    public final Integer component3() {
        return this.f64058c;
    }

    public final Integer component4() {
        return this.f64059d;
    }

    public final f copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new f(num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e0.areEqual(this.f64056a, fVar.f64056a) && e0.areEqual(this.f64057b, fVar.f64057b) && e0.areEqual(this.f64058c, fVar.f64058c) && e0.areEqual(this.f64059d, fVar.f64059d);
    }

    public final Integer getCmpGdprApplied() {
        return this.f64059d;
    }

    public final Integer getCmpSdkId() {
        return this.f64056a;
    }

    public final Integer getCmpSdkVersion() {
        return this.f64057b;
    }

    public final Integer getCmpTcfVersion() {
        return this.f64058c;
    }

    public int hashCode() {
        Integer num = this.f64056a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f64057b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f64058c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f64059d;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IabTcfMetadata(cmpSdkId=");
        sb2.append(this.f64056a);
        sb2.append(", cmpSdkVersion=");
        sb2.append(this.f64057b);
        sb2.append(", cmpTcfVersion=");
        sb2.append(this.f64058c);
        sb2.append(", cmpGdprApplied=");
        return com.google.android.gms.internal.play_billing.a.j(sb2, this.f64059d, ')');
    }
}
