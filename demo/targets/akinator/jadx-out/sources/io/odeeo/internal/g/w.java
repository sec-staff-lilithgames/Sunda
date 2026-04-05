package io.odeeo.internal.g;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f64176c = new w(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f64177a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64178b;

    public w(long j10, long j11) {
        this.f64177a = j10;
        this.f64178b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f64177a == wVar.f64177a && this.f64178b == wVar.f64178b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f64177a) * 31) + ((int) this.f64178b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f64177a);
        sb2.append(", position=");
        return a.b.g(this.f64178b, C3191e4.i.f36531e, sb2);
    }
}
