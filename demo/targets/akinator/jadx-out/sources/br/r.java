package br;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r extends e1 {

    /* renamed from: c, reason: collision with root package name */
    public final String f9985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String base64) {
        super(f1.f9827b, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(base64, "base64");
        this.f9985c = base64;
    }

    public static /* synthetic */ r copy$default(r rVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rVar.f9985c;
        }
        return rVar.copy(str);
    }

    public final String component1() {
        return this.f9985c;
    }

    public final r copy(String base64) {
        kotlin.jvm.internal.e0.checkNotNullParameter(base64, "base64");
        return new r(base64);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.e0.areEqual(this.f9985c, ((r) obj).f9985c);
    }

    public final String getBase64() {
        return this.f9985c;
    }

    public int hashCode() {
        return this.f9985c.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("Base64MediaSource(base64="), this.f9985c, ')');
    }
}
