package ee;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f54210c = new j0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f54211a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54212b;

    public j0(long j10, long j11) {
        this.f54211a = j10;
        this.f54212b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (this.f54211a == j0Var.f54211a && this.f54212b == j0Var.f54212b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f54211a) * 31) + ((int) this.f54212b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f54211a);
        sb2.append(", position=");
        return a.b.g(this.f54212b, C3191e4.i.f36531e, sb2);
    }
}
