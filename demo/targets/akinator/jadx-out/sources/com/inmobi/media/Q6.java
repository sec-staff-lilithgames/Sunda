package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32162a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f32163b;

    public Q6(int i10) {
        this.f32162a = i10;
        this.f32163b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q6)) {
            return false;
        }
        Q6 q62 = (Q6) obj;
        return this.f32162a == q62.f32162a && kotlin.jvm.internal.e0.areEqual(this.f32163b, q62.f32163b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f32162a) * 31;
        Integer num = this.f32163b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenRequestResultData(result=");
        sb2.append(this.f32162a);
        sb2.append(", errorCode=");
        return com.google.android.gms.internal.play_billing.a.j(sb2, this.f32163b, ')');
    }

    public Q6(int i10, Integer num) {
        this.f32162a = i10;
        this.f32163b = num;
    }
}
