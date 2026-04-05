package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Fb extends Hb {

    /* renamed from: a, reason: collision with root package name */
    public final int f31793a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31794b;

    public Fb(String message, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        this.f31793a = i10;
        this.f31794b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fb)) {
            return false;
        }
        Fb fb2 = (Fb) obj;
        return this.f31793a == fb2.f31793a && kotlin.jvm.internal.e0.areEqual(this.f31794b, fb2.f31794b);
    }

    public final int hashCode() {
        return this.f31794b.hashCode() + (Integer.hashCode(this.f31793a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Failure(statusCode=");
        sb2.append(this.f31793a);
        sb2.append(", message=");
        return AbstractC2962r0.a(sb2, this.f31794b, ')');
    }
}
