package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Na {

    /* renamed from: a, reason: collision with root package name */
    public final Ja f32074a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32076c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32077d;

    public Na(Ja ping, int i10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        this.f32074a = ping;
        this.f32075b = i10;
        this.f32076c = str;
        this.f32077d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Na)) {
            return false;
        }
        Na na2 = (Na) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f32074a, na2.f32074a) && this.f32075b == na2.f32075b && kotlin.jvm.internal.e0.areEqual(this.f32076c, na2.f32076c) && this.f32077d == na2.f32077d;
    }

    public final int hashCode() {
        int iD = e3.g.d(this.f32075b, this.f32074a.hashCode() * 31, 31);
        String str = this.f32076c;
        return Long.hashCode(this.f32077d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PingResult(ping=");
        sb2.append(this.f32074a);
        sb2.append(", statusCode=");
        sb2.append(this.f32075b);
        sb2.append(", error=");
        sb2.append(this.f32076c);
        sb2.append(", timestamp=");
        return e3.g.n(sb2, this.f32077d, ')');
    }
}
